package it.insiel.innovazione.ipp.referenceapp.features;

import io.cucumber.spring.CucumberContextConfiguration;
import it.insiel.innovazione.ipp.referenceapp.ReferenceApp;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@CucumberContextConfiguration
@SpringBootTest(classes = ReferenceApp.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringIntegrationTest {

    @Test
    void emptyTest() {
    }
}
