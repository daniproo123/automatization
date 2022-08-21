package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class ChoucairLoginPage  extends PageObject{


    // FIRST STAGE
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target FRIST_NAME = Target.the("Where do we write the frist name").
            located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Where do we write the last name").
            located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Where do we write the e-mail").
            located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("Where do we write the bird month").
           located(By.cssSelector("#birthMonth"));

    public static final Target BIRTH_DAY = Target.the("Where do we write the bird month").
            located(By.cssSelector("#birthDay"));

    public static final Target BIRTH_YEAR = Target.the("Where do we write the bird month").
            located(By.cssSelector("#birthYear"));


    public static final Target LANGUAGES = Target.the("Where do we write the bird month").
            located(By.className("ui-select-search input-xs ng-valid ng-dirty ng-touched ng-empty"));

    public static final Target NEXT_PAGE_LOCATION = Target.the("Button for next page ").
            located(By.className("btn-blue"));



}
