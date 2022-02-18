package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertEquals;
import pageObjects.ExitoPages;
import utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoBusquedaStep {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void escribirMasEnter(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }

    public void darClick(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }


    public void buscar1() {

        try {
            leerExcel = Excel.leerXlsx("GoogleSemilleroInterno.xlsx", "Terminos Busqueda");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++) {
            escribirMasEnter(ExitoPages.getTxtBarraBusqueda(), leerExcel.get(i).get("Busquedas"));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        darClick(ExitoPages.getBtnselecart1());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        darClick(ExitoPages.getBtnhome());

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void buscar2() {
        darClick(ExitoPages.getBtnEnviogratis());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        darClick(ExitoPages.getBtnSeleccionar());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        darClick(ExitoPages.getBtnhome());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void buscar3 (){
        darClick(ExitoPages.getBtnarthome());

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();}

            }

    private String obtenerTexto (By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validar (By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }

    }
