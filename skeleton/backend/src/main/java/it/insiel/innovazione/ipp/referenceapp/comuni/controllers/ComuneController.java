package it.insiel.innovazione.ipp.referenceapp.comuni.controllers;

import static it.insiel.innovazione.ipp.referenceapp.commons.Constants.API_ENTRYPOINT;
import it.insiel.innovazione.ipp.referenceapp.commons.exceptions.ControllerException;
import it.insiel.innovazione.ipp.referenceapp.commons.exceptions.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;
import it.insiel.innovazione.ipp.referenceapp.comuni.services.ComuneService;

import java.util.List;
import org.springframework.data.domain.Page;

@RequestMapping(value = API_ENTRYPOINT, produces = {MediaType.APPLICATION_JSON_VALUE})
@RestController
public class ComuneController {

    private final ComuneService comuneService;

    @Autowired
    public ComuneController(ComuneService comuneService) {
        this.comuneService = comuneService;
    }

    @GetMapping("/comuni")
    public List<Comune> getComuni(@RequestParam(value = "provincia", required = false) String provincia, @RequestParam(value = "nome", required = false) String nomeComune) throws ControllerException {
        Page<Comune> page = Page.empty();
        try {
            if (provincia != null) {
                page = comuneService.findComuniByProvincia(provincia, null);
            } else if (nomeComune != null) {
                page = comuneService.findComuniByNome(nomeComune, null);
            } else {
                page = comuneService.findAll(null);
            }
        } catch (ServiceException ex) {            
            throw new ControllerException(ex.getLocalizedMessage(), ex);
        }
        return page.getContent();
    }

}
