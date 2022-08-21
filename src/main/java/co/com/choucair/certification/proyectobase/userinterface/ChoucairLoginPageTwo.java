package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPageTwo extends PageObject{

    public static final Target CITY= Target.the("Where do we write the CITY").
            located(By.id("city"));
    public static final Target CODE_POSTAL = Target.the("Where do we write code postal").
            located(By.id("zip"));




    public static final Target COUNTRY = Target.the("SELECT SYSTEM OPERATIVE").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public static final Target COUNTRY_LABEL = Target.the("SELECT SYSTEM OPERATIVE").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[54]/span"));

    public static final Target NEXT_BUTTONPAGE_THREE=Target.the("next page Three").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));


}
