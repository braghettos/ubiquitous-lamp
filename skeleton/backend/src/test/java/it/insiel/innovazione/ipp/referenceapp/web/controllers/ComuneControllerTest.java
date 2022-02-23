package it.insiel.innovazione.ipp.referenceapp.web.controllers;

import static it.insiel.innovazione.ipp.referenceapp.commons.Constants.API_ENTRYPOINT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import it.insiel.innovazione.ipp.referenceapp.comuni.controllers.ComuneController;
import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;
import it.insiel.innovazione.ipp.referenceapp.comuni.services.ComuneService;
import java.util.ArrayList;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ComuneController.class)
class ComuneControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ComuneService comuneService;


    @Test
    void testElencoComuni() throws Exception {
        ArrayList<Comune> list = new ArrayList<>();
        list.add(new Comune(0L, "Trieste", "Trieste", 1000));
        list.add(new Comune(1L, "Udine", "Udine", 1000));
        when(comuneService.findAll(null)).thenReturn(new PageImpl<Comune>(list));

        ResultActions resultAction = mockMvc.perform(get(API_ENTRYPOINT + "/comuni"));
        resultAction.andExpect(status().isOk());
        resultAction.andExpect(jsonPath("$", hasSize(2)));
        resultAction.andExpect(jsonPath("$[*].nome", containsInAnyOrder("Trieste", "Udine")));
        resultAction.andExpect(jsonPath("$[*].provincia", containsInAnyOrder("Udine", "Trieste")));
    }

    @Test
    void testComuniPerProvincia() throws Exception {    
        ArrayList<Comune> list = new ArrayList<>();
        list.add(new Comune(0L, "Trieste", "Trieste", 1000));
        when(comuneService.findComuniByProvincia("Trieste",null)).thenReturn(new PageImpl<Comune>(list));
        
        ResultActions resultAction = mockMvc.perform(get(API_ENTRYPOINT + "/comuni?provincia=Trieste"));
        resultAction.andExpect(status().isOk());
        resultAction.andExpect(jsonPath("$", hasSize(1)));
        resultAction.andExpect(jsonPath("$[*].nome", containsInAnyOrder("Trieste")));
    }
}
