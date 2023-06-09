package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class Buscador extends BaseClass {


    public Buscador(WebDriver driver) {
        super(driver);
    }

    By writeBuscador = By.xpath("//input[@placeholder=\"Buscar productos\"]");
    By verefFiltroBuscado = By.xpath("//mat-chip[1]");

    public void usarElBuscador(String texto) {
        click(writeBuscador);
        agregarTexto(writeBuscador, texto);
        enterEncuadroTexto(writeBuscador);
    }

    public String vereficarFiltro() {
        esperaExplicita(verefFiltroBuscado, 5);
        return primeraPalabra(obtenerTexto(verefFiltroBuscado));
    }
}
