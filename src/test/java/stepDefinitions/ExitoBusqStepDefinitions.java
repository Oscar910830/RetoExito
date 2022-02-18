package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObjects.ExitoPages;
import steps.ExitoBusquedaStep;

public class ExitoBusqStepDefinitions {

    @Steps
    ExitoBusquedaStep Step = new  ExitoBusquedaStep();

    @Given("^que me encuentro en la pagina de Exito$")
    public void queMeEncuentroEnLaPaginaDeExito() {
        SeleniumWebDriver.ChromeDriver ("https://www.exito.com/");
    }


    @When("^busco productos$")
    public void buscoProductos() {
        Step.buscar1();
        Step.buscar2();
        Step.buscar3();
    }


    @Then("^hace la busqueda y me muestra el resultado$")
    public void haceLaBusquedaYMeMuestraElResultado() {
        Step.validar(ExitoPages.getLblreferencia(),"Televisor Lg 55 pulgadas Uhd Plano Smart Tv Up7750psb.Awc Led");
    }

}
