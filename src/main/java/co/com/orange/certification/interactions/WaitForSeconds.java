package co.com.orange.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitForSeconds implements Interaction {
    private final int seconds;

    public WaitForSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static WaitForSeconds waitFor(int seconds) {
        return new WaitForSeconds(seconds);
    }
}