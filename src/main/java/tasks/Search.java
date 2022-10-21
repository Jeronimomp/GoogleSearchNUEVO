package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.HoverOverTarget;
import org.openqa.selenium.Keys;
import ui.HomePage;


public class Search implements Task {
    private String palabra;

    public Search(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Enter.theValue(palabra).into(HomePage.BUSCADOR).thenHit(Keys.ENTER),
             Click.on(HomePage.RESULTADO)

     );
    }
    public static Search inGoogle(String palabra){
        return Tasks.instrumented(Search.class, palabra);
    }
}
