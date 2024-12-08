package co.com.orange.certification.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.orange.certification.userinterfaces.LoginUI.*;
import static co.com.orange.certification.utils.Constans.PASSWORD;
import static co.com.orange.certification.utils.Constans.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T vane) {
        vane.attemptsTo(
                Enter.theValue(USERNAME).into(inputUsername),
                Enter.theValue(PASSWORD).into(inputPassword),
                Click.on(buttonLogin)
        );
    }
    public static Login login(){
        return instrumented(Login.class);
    }
}
