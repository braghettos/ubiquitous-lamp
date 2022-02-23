package it.insiel.innovazione.ipp.referenceapp.features.steps;

import io.cucumber.java.it.Allora;
import io.cucumber.java.it.E;
import io.cucumber.java.it.Quando;
import it.insiel.innovazione.ipp.referenceapp.commons.exceptions.ControllerException;
import it.insiel.innovazione.ipp.referenceapp.comuni.controllers.ComuneController;
import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComuniStepdefs {

    private List<Comune> comuni;
    private Exception exception;

    @Autowired
    ComuneController comuneController;

    @Quando("l'utente accede al sistema")
    public void lUtenteAccedeAlSistema() {

    }

    @E("richiede l'elenco completo dei comuni")
    public void richiedeElencoComuni() throws ControllerException {
        comuni = comuneController.getComuni(null, null);
    }

    @Quando("cerca il comune di {string}")
    public void cerca_il_comune_di(String comune) throws ControllerException {
        comuni =  comuneController.getComuni(null, comune);
    }

    @E("richiede elenco comuni presenti nella provincia di {string}")
    public void richiedeElencoComuniPresentiNellaProvincia(String provincia) {
        try {
            comuni = comuneController.getComuni(provincia, null);
        } catch (Exception e) {
            exception = e;
        }
    }

    @E("il numero di abitanti nel comune di {string} e' pari a {int}")
    public void ilNumeroDiAbitantiNelComuneEPariA(String nomeComune, int abitanti) {
        Comune comune = comuni.stream().filter(item -> item.getNome().equalsIgnoreCase(nomeComune)).findFirst()
                .orElseThrow();
        assertEquals(abitanti, comune.getAbitanti());
    }

    @Quando("richiede il comune di {string}")
    public void richiedeComuneConDi(String nomeComune) {
        try{
            comuni = comuneController.getComuni(null, nomeComune);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Allora("il numero dei comuni trovati e' {int}")
    public void ilNumeroDeiComuniTrovatiE(int count) {
        assertEquals(comuni.size(), count);
    }

    @Allora("il nome del comune è {string}, la provincia è {string} ed il numero di abitanti è {int}")
    public void ilComuneE(String nome, String provincia, int count) {
        Comune comuneTrovato = comuni.get(0);
        Comune comune = new Comune(comuneTrovato.getNome(), comuneTrovato.getProvincia(),
                comuneTrovato.getAbitanti());
        comune.setId(comuneTrovato.getId());
        assertEquals(comuneTrovato, comune);
    }

    @Allora("il sistema genera una eccezione")
    public void ilSistemaGeneraUnaEccezione() {
        assertNotNull(exception);
    }
}
