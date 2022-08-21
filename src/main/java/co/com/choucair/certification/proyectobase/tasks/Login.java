package co.com.choucair.certification.proyectobase.tasks;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPageTwo;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPagThree;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPageFour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task{
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    String password = "#aAS3Okldlqw";

        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),

                //STEP ONE
                Enter.theValue("Daniel").into(ChoucairLoginPage.FRIST_NAME),
                Enter.theValue("Zuleta").into(ChoucairLoginPage.LAST_NAME),
                Enter.theValue("Danielzuleta2022@pruebados.com").into(ChoucairLoginPage.EMAIL),
                SelectFromOptions.byVisibleText("February").from(ChoucairLoginPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText("20").from(ChoucairLoginPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText("2000").from(ChoucairLoginPage.BIRTH_YEAR),
                //Enter.theValue("Spanish").into(ChoucairLoginPage.LANGUAGES)
                Click.on(ChoucairLoginPage.NEXT_PAGE_LOCATION),


                //STEP TWO
                Enter.theValue("29902020").into(ChoucairLoginPageTwo.CODE_POSTAL),
                Click.on(ChoucairLoginPageTwo.COUNTRY),
                Click.on(ChoucairLoginPageTwo.COUNTRY_LABEL),
                Click.on(ChoucairLoginPageTwo.NEXT_BUTTONPAGE_THREE),


                //STEP THREE
                Click.on(ChoucairLoginPagThree.YOURCOMPUTER),
                Click.on(ChoucairLoginPagThree.YOURCOMPUTER_LABEL),

                Click.on(ChoucairLoginPagThree.VERSION),
                Click.on(ChoucairLoginPagThree.VERSION_LABEL),

                Click.on(ChoucairLoginPagThree.LANGUAGES),
                Click.on(ChoucairLoginPagThree.LANGUAGES_LABEL),

                DoubleClick.on(ChoucairLoginPagThree.MOBILE_DEVICE),
                Click.on(ChoucairLoginPagThree.MOBILE_DEVICE_LABEL),

                DoubleClick.on(ChoucairLoginPagThree.MODEL),
                Click.on(ChoucairLoginPagThree.MODEL_LABEL),

                DoubleClick.on(ChoucairLoginPagThree.OPERATING),
                Click.on(ChoucairLoginPagThree.OPERATING_LABEL),
                Click.on(ChoucairLoginPagThree.NEXT_LAST_STEP),


                //STEP FOUR
                Enter.theValue(password).into(ChoucairLoginPageFour.PASSWORD),
                Enter.theValue(password).into(ChoucairLoginPageFour.PASSWORD_CONFIRM),
                Click.on(ChoucairLoginPageFour.CHECK_MARK_TOU),
                Click.on(ChoucairLoginPageFour.CHECK_MARK_PSP)
                //Click.on(ChoucairLoginPagThree.NEXT_LAST_STEP)


                );
    }
}
