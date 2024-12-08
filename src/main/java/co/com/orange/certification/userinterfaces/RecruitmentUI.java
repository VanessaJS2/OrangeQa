package co.com.orange.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RecruitmentUI {

    public static final Target sectionRecruitment = Target.the("section RecruitmentUI")
            .located(By.xpath("//li//span[text()='Recruitment']"));
    public static final Target buttonAdd = Target.the("button add")
            .located(By.xpath("//div[@class='orangehrm-header-container']//button[@type='button'][text()=' Add ']"));
    public static final Target inputFirstName = Target.the("input First Name")
            .located(By.xpath("//input[@name='firstName']"));

    public static final Target inputLastName = Target.the("input last name")
            .located(By.xpath("//input[@name='lastName']"));
    public static final Target wrapperVacancy = Target.the("list vacancy")
            .located(By.xpath("//div[@class='oxd-select-wrapper']"));
    public static final Target wrapperPayroll = Target.the("list vacancy- payroll")
            .located(By.xpath("//div[@class='oxd-select-wrapper']//div[contains(.,'Payroll Administrator')]"));
    public static final Target inputEmail = Target.the("INPUT EMAIL")
            .located(By.xpath("(//div[@class='oxd-form-row']//input[@placeholder='Type here'])[1]"));
    public static final Target inputContactNumber = Target.the("INPUT contact number")
            .located(By.xpath("(//div[@class='oxd-form-row']//input[@placeholder='Type here'])[2]"));
    public static final Target checkboxConsent = Target.the("input checboxt consent to keep data")
            .located(By.xpath("//span//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public static final Target buttonSave = Target.the("button save")
            .located(By.xpath("//button[contains(.,'Save')]"));

    public static final Target buttonNext = Target.the("button NEXT")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));

    public static final Target buttonNextOffert = Target.the("button NEXT offert job")
            .located(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--success'])[2][contains(.,Offer)]"));

    public static final Target inputInterviewTitle = Target.the("input interview title")
            .located(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[2]"));
    public static final Target inputInterviewer = Target.the(" input Interviewer")
            .located(By.xpath("//input[@include-employees='onlyCurrent']"));

    public static final Target inputInterviewerList = Target.the(" input Interviewer list")
            .located(By.xpath("//div[@role='listbox']//*[position()=1]"));
    public static final Target inputDate = Target.the(" input fecha")
            .located(By.xpath("//input[@placeholder=\"yyyy-dd-mm\"]"));

    public static final Target inputTime = Target.the("time")
            .located(By.xpath("//input[@placeholder=\"hh:mm\"]"));

    public static final Target inputStatus = Target.the("status")
            .located(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[4]"));

    public static final Target inputCandidateName = Target.the("Candidate Name")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));


    public static final Target hired = Target.the("hired")
            .located(By.xpath("//div[@role='listbox']//*[contains(text(),'Hired')]"));

    public static final Target inputCandidate = Target.the("hired")
            .located(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));

    public static final Target buttonSearchCandidate = Target.the("Search candidate")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

    public static final Target fullName = Target.the("full name")
            .located(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][3]"));

    public static final Target vacancyInformation = Target.the("vacancyInformation")
            .located(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]"));

    public static final Target statusRegistry = Target.the("statusRegistry")
            .located(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][6]"));
}
