package it.insiel.innovazione.ipp.referenceapp.comuni.services;

import it.insiel.innovazione.ipp.referenceapp.commons.exceptions.ServiceException;

import org.springframework.data.domain.Pageable;

import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;

import org.springframework.data.domain.Page;

public interface ComuneService {

    Page<Comune> findComuniByNome(String nome, Pageable pageable) throws ServiceException;

    Page<Comune> findComuniByProvincia(String provincia, Pageable pageable) throws ServiceException;

    Page<Comune> findAll(Pageable pageable) throws ServiceException;

}
