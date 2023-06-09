package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class InicioSesion extends BaseClass {
    public InicioSesion(WebDriver driver) {
        super(driver);
    }

    By clickInicioSesion = By.xpath("//mat-icon[normalize-space() = \"account_circle\"]");
    By writeEmail = By.xpath("//input[@id=\"mat-input-1\"]");
    By clickContinuar = By.xpath("//span[normalize-space()= \"Continuar\"]");
    By verefMensjError = By.xpath("//mat-error");

    public void irAIniciarSesion(String texto){
        click(clickInicioSesion);
        esperaExplicita(writeEmail,5);
        click(writeEmail);
        agregarTexto(writeEmail,texto);
        click(clickContinuar);
    }

    public String vereficarMensajeDeError(){
        esperaExplicita(verefMensjError,10);
        return obtenerTexto(verefMensjError);
    }
}
