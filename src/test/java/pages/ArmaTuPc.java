package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class ArmaTuPc extends BaseClass {
    public ArmaTuPc(WebDriver driver) {
        super(driver);
    }

    By clickarmaTuPc = By.xpath("//a[@href=\"/armatupc\"]");
    By clickimgMathher = By.xpath("//img[@src=\"PatchRouterSection/assets/img/arma-pc/mother1.png\"]");
    By clickimgcooler = By.xpath("//img[@src=\"PatchRouterSection/assets/img/arma-pc/cooler1.png\"]");
    By verefTitulo = By.xpath("//h2[@class=\"titulo\"]");

    public void iraArmaTuPc(){
        click(clickarmaTuPc);
    }

    public void iraimgMather(){
        iraArmaTuPc();
        esperaExplicita(clickimgMathher,5);
        click(clickimgMathher);
    }

    public void iraimgcooler(){
        iraArmaTuPc();
        esperaExplicita(clickimgcooler,5);
        click(clickimgcooler);
    }

    public String vereficarTitulo(){
        esperaExplicita(verefTitulo,5);
        return obtenerTexto(verefTitulo);
    }
}
