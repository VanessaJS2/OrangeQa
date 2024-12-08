package co.com.orange.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target inputUsername = Target.the("input username")
            .located(By.xpath("//input[@name='username']"));
    public static final Target inputPassword = Target.the("input password")
            .located(By.xpath("//input[@name='password']"));
    public static final Target buttonLogin = Target.the("button login ")
            .located(By.xpath("//button[@type='submit']"));
}
