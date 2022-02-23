package it.insiel.innovazione.ipp.referenceapp.comuni.services;

import it.insiel.innovazione.ipp.referenceapp.commons.Constants;
import it.insiel.innovazione.ipp.referenceapp.commons.exceptions.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.ComuneRepository;
import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;
import org.springframework.data.domain.Example;

@Service
public class ComuneServiceImpl implements ComuneService {

    @Autowired
    private ComuneRepository comuneRepository;

    @Override
    public Page<Comune> findComuniByNome(String nome, Pageable pageable) throws ServiceException {
        if (nome == null || nome.trim().equals("")) {
            throw new ServiceException("Nome comune non specificata");
        }
        Example<Comune> example = Example.of(new Comune(nome, null, null));
        return retrieveData(example, pageable);
    }

    @Override
    public Page<Comune> findComuniByProvincia(String provincia, Pageable pageable) throws ServiceException {
        if (provincia == null || provincia.trim().equals("")) {
            throw new ServiceException("Provincia non specificata");
        }
        Example<Comune> example = Example.of(new Comune(null, provincia, null));
        return retrieveData(example, pageable);
    }

    @Override
    public Page<Comune> findAll(Pageable pageable) throws ServiceException {
        return retrieveData(null, pageable);
    }

    private Page<Comune> retrieveData(Example<Comune> example, Pageable pageable) {
        Page<Comune> page;
        if (example != null) {
            page = comuneRepository.findAll(example, checkPageable(pageable));
        } else {
            page = comuneRepository.findAll(checkPageable(pageable));
        }
        return page;
    }

    private Pageable checkPageable(Pageable pageable) {
        Pageable pageRequest;
        if (pageable == null) {
            pageRequest = PageRequest.of(0, Constants.MAX_NUM_ROW, Sort.by(Sort.Order.asc("nome")));
        } else {
            pageRequest = pageable;
        }
        return pageRequest;
    }

}
