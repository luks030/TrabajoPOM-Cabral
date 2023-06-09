package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;


public class Productos extends BaseClass {

    public Productos(WebDriver driver) {
        super(driver);
    }

    By clickProductos = By.xpath("//a[@id = \"productos\"]");
    By clikEquiposYNotebooks = By.xpath("//mat-expansion-panel-header[@id=\"mat-expansion-panel-header-21\"]//mat-panel-title");
    By clickNotebooks = By.xpath("//div[@id=\"cdk-accordion-child-21\"]//p[2]/span");
    By verefNotebooks = By.xpath("//mat-chip[1]");
    By clickLenovo = By.xpath("//mat-radio-button[@id = \"mat-radio-2\"]/label");
    By verefLenovo = By.xpath("//mat-chip[2]");
    By clickProcedadores = By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/mat-accordion/mat-expansion-panel[2]");
    By clickProcesadorAMD = By.xpath("//div[@id=\"cdk-accordion-child-22\"]//span[normalize-space() =\"- Procesadores AMD\" ]");
    By verefProcesadorAMD = By.xpath("//mat-chip[1]");
    By click6 = By.xpath("//mat-radio-button[@id=\"mat-radio-14\"]");
    By verefNucleos6 = By.xpath("//mat-chip[2]");


    public void irAProductos(){
        click(clickProductos);
    }

    public void irANotebooks(){
        irAProductos();
        esperaExplicita(clikEquiposYNotebooks,5);
        click(clikEquiposYNotebooks);
        esperaExplicita(clickNotebooks,5);
        click(clickNotebooks);
    }

    public String vereficarNotebooks(){
        esperaExplicita(verefNotebooks,5);
        return primeraPalabra(obtenerTexto(verefNotebooks));
    }

    public void iraLenovo(){
        irANotebooks();
        esperaExplicita(clickLenovo,5);
        click(clickLenovo);
    }

    public String vereficarLenovo(){
        esperaExplicita(verefLenovo,5);
        return primeraPalabra(obtenerTexto(verefLenovo));
    }

    public void irAProcesadores(){
        irAProductos();
        esperaExplicita(clickProcedadores,5);
        click(clickProcedadores);
        esperaExplicita(clickProcesadorAMD,5);
        click(clickProcesadorAMD);
    }

    public String vereficarProcesadorAMD(){
        esperaExplicita(verefProcesadorAMD,5);
        return primeraPalabra(obtenerTexto(verefProcesadorAMD));
    }

    public void irA6nucleos(){
        irAProcesadores();
        scroll(0,600);
        esperaExplicita(click6,5);
        click(click6);
        //scroll(0,-600);
    }

    public String vereficarNuecleos6(){
        esperaExplicita(verefNucleos6,5);
        return primeraPalabra(obtenerTexto(verefNucleos6));
    }
}
