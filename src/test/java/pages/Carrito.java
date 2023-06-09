package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class Carrito extends BaseClass {

    public Carrito(WebDriver driver) {
        super(driver);
    }

    By clikCarrito = By.xpath("//span[@style=\"height: 0px;\"]//mat-icon");
    By clickSeguircomprando = By.xpath("//span/span[normalize-space()=\"Seguir comprando\"]");
    By clickPrimerSumarCarrito = By.xpath("//cgw-product-alone[@class=\"mat-card card-product ng-star-inserted\"][1]//button");
    By verefComprar = By.xpath("//span/span[normalize-space()=\"Comprar\"]");
    By writeDescuento = By.xpath("//input[@id=\"mat-input-1\"]");
    By clickAplicar = By.xpath("//span[normalize-space() = \"APLICAR\"]");
    By verefMensajeError = By.xpath("//*[@id=\"wrapper\"]//div[2]/div//div[3]/div/p");
    By clickBorrarcompra = By.xpath("//mat-icon[@svgicon=\"trash_icon\"]");
    By verefMensajeNoHayElm = By.xpath("//h3[normalize-space() = \"No hay elementos en el carrito\"]");

    public void irAcomprarProducto(){
        click(clikCarrito);
        esperaExplicita(clickSeguircomprando,5);
        click(clickSeguircomprando);
        esperaExplicita(clickPrimerSumarCarrito,5);
        click(clickPrimerSumarCarrito);
        click(clikCarrito);
    }

    public String vereficarComprar(){
        esperaExplicita(verefComprar,5);
        return obtenerTexto(verefComprar);
    }

    public void irAPonerDescuento(String descuento){
        irAcomprarProducto();
        esperaExplicita(writeDescuento,5);
        click(writeDescuento);
        agregarTexto(writeDescuento,descuento);
        click(clickAplicar);
    }

    public String vereficarMensajeDeerror(){
        esperaExplicita(verefMensajeError,10);
        return obtenerTexto(verefMensajeError);
    }

    public void irAEliminarCarito(){
        irAcomprarProducto();
        esperaExplicita(clickBorrarcompra,5);
        click(clickBorrarcompra);
    }

    public String vereficarMensajeDeCarrito(){
        esperaExplicita(verefMensajeNoHayElm,5);
        return obtenerTexto(verefMensajeNoHayElm);
    }

}
