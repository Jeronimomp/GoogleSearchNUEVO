package ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BUSCADOR=Target.the("Buscador").locatedBy("//input[@name='q']");
    public static final Target RESULTADO=Target.the("Resultado").located(By.id("dimg_3"));
}
