package co.com.orange.certification.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class ValidateHireQuestion implements Question<String> {
    private String question;
    @Override
    public String answeredBy(Actor vane) {
        question= vane.recall("information").toString();
        return question;
    }

    public static ValidateHireQuestion validateHireQuestion() {
        return new ValidateHireQuestion();
    }
}
