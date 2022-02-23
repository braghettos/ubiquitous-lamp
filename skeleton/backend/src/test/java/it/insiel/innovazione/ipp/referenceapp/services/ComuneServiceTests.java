package it.insiel.innovazione.ipp.referenceapp.services;

import static it.insiel.innovazione.ipp.referenceapp.TestConstants.COMUNI_IN_REGIONE;
import static it.insiel.innovazione.ipp.referenceapp.TestConstants.PAGE_SIZE;
import it.insiel.innovazione.ipp.referenceapp.commons.exceptions.ServiceException;
import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import it.insiel.innovazione.ipp.referenceapp.comuni.services.ComuneService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.springframework.data.domain.Page;
import org.springframework.test.util.AssertionErrors;

@SpringBootTest
class ComuneServiceTests {

    @Autowired
    private ComuneService comuneService;

    @Test
    void testFindAll() throws ServiceException {
        Pageable pageable = PageRequest.of(0, PAGE_SIZE, Sort.by(
                Sort.Order.asc("nome"),
                Sort.Order.desc("provincia")));
        Page<Comune> result = comuneService.findAll(pageable);

        assertEquals(COMUNI_IN_REGIONE, result.getTotalElements());
        assertEquals(PAGE_SIZE, result.get().count());
        assertEquals("Aiello del Friuli", result.get().findFirst().orElseThrow().getNome());
        assertEquals("Udine", result.get().findFirst().orElseThrow().getProvincia());
    }

    @Test
    void testCountComuni() throws ServiceException {
        Page<Comune> comuni = comuneService.findAll(null);
        assertEquals(COMUNI_IN_REGIONE, comuni.getTotalElements());
    }

    @Test
    void testReadComune() throws ServiceException {
        Page<Comune> comuni = comuneService.findAll(null);
        Comune comune = null;
        for (Comune c : comuni) {
            if (c.getNome().equals("Fagagna")) {
                comune = c;
                break;
            }
        }
        if (comune == null) {
            fail("Comune non trovato");
        } else {
            AssertionErrors.assertEquals("numero abitanti errato", comune.getAbitanti(), 6279);
            AssertionErrors.assertEquals("provincia errata", comune.getProvincia(), "Udine");
        }
    }
}
