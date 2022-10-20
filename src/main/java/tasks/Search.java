package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.Keys;
import ui.HomePage;


public class Search implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Enter.theValue("futbol").into(HomePage.BUSCADOR).thenHit(Keys.ENTER),
             Click.on(HomePage.RESULTADO)
     );
    }
    public static Search inGoogle(){
        return Tasks.instrumented(Search.class);
    }
}
