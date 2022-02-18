package pageObjects;

import org.openqa.selenium.By;

public class ExitoPages {
    private static By txtBarraBusqueda = By.xpath("//input[@placeholder='Buscar en exito.com']");
    private static By btnEnviogratis = By.xpath("//div[@class='2item w-25-l mr2-l w-50-s ph1-s  pv2-s']");
    private static By btnSeleccionar = By.xpath("//a[@href=\"/galaxy-a22-128gb-light-green-samsung-sm-a225mlggltc-3031422/p?pauta=t/p\"]");
    private static By btnselecart1= By.xpath("//a[@href=\"/lavadora-13-kg29-lbs-sapience-lg-wt13bsbpabmecol-3039688/p\"]");
    private static By btnhome=By.xpath("//a[@href=\"/\"]");
    private static By btnarthome = By.xpath("//a[@class=\"campaign_name_bloque2_4\"]");
    private static By lblreferencia = By.xpath("//span[@class=\"vtex-breadcrumb-1-x-term ph2 c-on-base\"]");

    public static By getTxtBarraBusqueda() {return txtBarraBusqueda;}

    public static By getBtnSeleccionar() {return btnSeleccionar;}

    public static By getBtnEnviogratis() {return btnEnviogratis;}

    public static By getBtnselecart1() { return btnselecart1; }

    public static By getBtnhome() { return btnhome; }

    public static By getLblreferencia() {
        return lblreferencia;
    }

    public static By getBtnarthome() {

        return btnarthome;
    }
}