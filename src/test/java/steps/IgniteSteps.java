package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;
import pages.PaginaServicios;

public class IgniteSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaServicios servicePage = new PaginaServicios();

    @Given("I navigate to www.igniteglobal.io")
        public void iNavigateToIgnite() {
            landingPage.navigateToIgniteGlobal();
        }
    
    @When("I go to {word} using the navigation bar")
        public void navigationBarUse(String section) {
            landingPage.clickOnSectionNavigationBar(section);
        }
    
    @When("I go to services page using the navigation bar")
        public void serviciosLink() {
            servicePage.clickServiciosLink();
        }
    
    @Then("I validate the options in the service page")
        public void validateServicePage() {
            List<String> lista = servicePage.returnServiciosList();
            List<String> listaEsperada = Arrays.asList("ECOMMERCE & EBUSINESS",
                "TECH RESEARCH & INNOVATION",
                "USER EXPERIENCE & DESIGN",
                "WEB & MOBILE APPLICATION",
                "QUALITY ASSURANCE");
            
            Assert.assertEquals(listaEsperada, lista);
            
        }
}

