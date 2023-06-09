package tests;


import Selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import utils.DataDriven;

public class Tests extends SeleniumTestBase {
    //declarar atributos


    //Producto
    @Test
    public void CPG001VereficarFiltroNotebooks(){
        excelCPG = DataDriven.getData("CPG - 001");
        productos.irANotebooks();
        Assertions.assertEquals(productos.vereficarNotebooks(), excelCPG.get(1));
    }

    @Test
    public void CPG002VereficarFiltroLenovo(){
        excelCPG = DataDriven.getData("CPG - 002");
        productos.iraLenovo();
        System.out.println(productos.vereficarLenovo());
        Assertions.assertEquals(productos.vereficarLenovo(), excelCPG.get(1));
    }

    @Test
    public void CPG003VereficarFiltroProcesador(){
        excelCPG = DataDriven.getData("CPG - 003");
        productos.irAProcesadores();
        Assertions.assertEquals(productos.vereficarProcesadorAMD(), excelCPG.get(1));
    }

    @Test
    public void CPG004VereficarFiltroNucleo(){
        excelCPG = DataDriven.getData("CPG - 004");
        productos.irA6nucleos();
        Assertions.assertEquals(productos.vereficarNuecleos6(), excelCPG.get(1));
    }

    //Buscador
    @Test
    public void CPG005VereficarFiltroPlacas(){
        excelCPG = DataDriven.getData("CPG - 005");
        buscador.usarElBuscador(excelCPG.get(1));
        Assertions.assertEquals(buscador.vereficarFiltro(), excelCPG.get(1));
    }


    @Test
    public void CPG006VereficarFiltroTeclado(){
        excelCPG = DataDriven.getData("CPG - 006");
        buscador.usarElBuscador(excelCPG.get(1));
        Assertions.assertEquals(buscador.vereficarFiltro(),excelCPG.get(1));
    }

    //ArmaTuPc
    @Test
    public void CPG007VereficarTituloMother(){
        excelCPG = DataDriven.getData("CPG - 007");
        armaTuPc.iraimgMather();
        Assertions.assertEquals(armaTuPc.vereficarTitulo(),excelCPG.get(1));
    }

    @Test
    public void CPG008VereficarTituloCooler(){
        excelCPG = DataDriven.getData("CPG - 008");
        armaTuPc.iraimgcooler();
        Assertions.assertEquals(armaTuPc.vereficarTitulo(),excelCPG.get(1));
    }

    //carrito
    @Test
    public void CPG009VereficarProductoLLegoACarrito(){
        excelCPG = DataDriven.getData("CPG - 009");
        carrito.irAcomprarProducto();
        Assertions.assertEquals(carrito.vereficarComprar(),excelCPG.get(1));
    }

    @Test
    public void CPG010VereficarCuponMalIngresado(){
        excelCPG = DataDriven.getData("CPG - 010");
        carrito.irAPonerDescuento(excelCPG.get(1));
        Assertions.assertEquals(carrito.vereficarMensajeDeerror(),excelCPG.get(2));
    }

    @Test
    public void CPG011VereficarBorradoDeProductoEnCarrito(){
        excelCPG = DataDriven.getData("CPG - 011");
        carrito.irAEliminarCarito();
        Assertions.assertEquals(carrito.vereficarMensajeDeCarrito(),excelCPG.get(1));
    }

    //InicioSesion
    @Test
    public void CPG012VereficarMensajeDeEmailIncorrecto(){
        excelCPG = DataDriven.getData("CPG - 012");
        inicioSesion.irAIniciarSesion(excelCPG.get(1));
        Assertions.assertEquals(inicioSesion.vereficarMensajeDeError(),excelCPG.get(2));
    }

}
