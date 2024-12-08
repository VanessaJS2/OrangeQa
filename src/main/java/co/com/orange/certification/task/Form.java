package co.com.orange.certification.task;

import co.com.orange.certification.interactions.WaitForSeconds;
import co.com.orange.certification.userinterfaces.RecruitmentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.orange.certification.userinterfaces.RecruitmentUI.*;
import static co.com.orange.certification.utils.Constans.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Form implements Task {
    private String fullNameActor,vacancy,status;
    @Override
    public <T extends Actor> void performAs(T vane) {
        vane.attemptsTo(
            Click.on(sectionRecruitment),
                Click.on(buttonAdd),
                Enter.theValue(FIRSTNAME).into(inputFirstName),
                Enter.theValue(LASTNAME).into(inputLastName),
                Click.on(wrapperVacancy),
                Click.on(wrapperPayroll),
                Enter.theValue(EMAIL).into(inputEmail),
                Enter.theValue(CONTACTNUMBER).into(inputContactNumber),
                Click.on(checkboxConsent),
                Click.on(buttonSave),
                Click.on(buttonNext),
                Click.on(buttonSave),
                Click.on(buttonNext),
                Enter.theValue(INTERVIEWTITLE).into(inputInterviewTitle),
                Enter.theValue("a").into(inputInterviewer),
                WaitForSeconds.waitFor(3),
                Click.on(inputInterviewerList),
                Enter.theValue(DATE).into(inputDate),
                Enter.theValue(TIME).into(inputTime),
                WaitForSeconds.waitFor(1),
                Click.on(buttonSave),
                Click.on(buttonNext),
                Click.on(buttonSave),
                Click.on(buttonNextOffert),
                Click.on(buttonSave),
                Click.on(buttonNext),
                Click.on(buttonSave),
                WaitForSeconds.waitFor(3),
                Click.on(sectionRecruitment),
                WaitForSeconds.waitFor(2),
                Click.on(inputStatus),
                WaitForSeconds.waitFor(3),
                Click.on(hired),
                WaitForSeconds.waitFor(3),
                Click.on(inputCandidate),
                Enter.theValue(ACTOR).into(inputCandidateName),
                WaitForSeconds.waitFor(2),
                Click.on(inputInterviewerList),
                WaitForSeconds.waitFor(1),
                Click.on(buttonSearchCandidate),
                WaitForSeconds.waitFor(3)
        );
        fullNameActor= RecruitmentUI.fullName.resolveFor(vane).getText();
        vacancy=RecruitmentUI.vacancyInformation.resolveFor(vane).getText();
        status= RecruitmentUI.statusRegistry.resolveFor(vane).getText();
        vane.remember("information", fullNameActor+vacancy+status);
        System.out.println(fullNameActor+vacancy+status);

    }

    public static Form form(){
        return instrumented(Form.class);
    }
}
