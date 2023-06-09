package Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class SeleniumTestBase {
    private WebDriver driver;
    public Productos productos;
    public Buscador buscador;
    public ArmaTuPc armaTuPc;
    public Carrito carrito;
    public InicioSesion inicioSesion;
    public ArrayList<String> excelCPG;


    @AfterMethod
    public void posPrueba(){
        productos.cerrarBrowser();
    }



    @BeforeMethod
    public void preparacionEjecucion(){
        //Instanciar los objetos
        excelCPG = new ArrayList<>();
        //Pages
        productos = new Productos(driver);
        //Usamos cualquir pages para conextar a las properties
        productos.conexionDriver
                (PropertiesDriven.getProperty("browser")
                        ,PropertiesDriven.getProperty("rutaDriver")
                        ,PropertiesDriven.getProperty("propertyDriver"));
        buscador = new Buscador(productos.getDriver());
        armaTuPc = new ArmaTuPc(productos.getDriver());
        carrito = new Carrito(productos.getDriver());
        inicioSesion = new InicioSesion(productos.getDriver());
        productos.cargarSitio(PropertiesDriven.getProperty("url"));
        productos.maximizarBrowser();
        //Espera para que cargue totalmete la pagina
        productos.esperarXSegundos(2000);


    }
}
