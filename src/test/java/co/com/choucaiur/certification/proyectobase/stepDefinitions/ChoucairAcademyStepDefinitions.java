package co.com.choucaiur.certification.proyectobase.stepDefinitions;

import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {


    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Quiero completar la prueba tecnica de Choucair asociada a la automatizacion$")
    public void quieroCompletarLaPruebaTecnicaDeChoucairAsociadaALaAutomatizacion() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^Busco ingresar datos relacionados al login en la pagina de Utest$")
    public void buscoIngresarDatosRelacionadosAlLoginEnLaPaginaDeUtest() {

    }

    @Then("^Rellena todos los datos sobre del formulario de registro, para completarlo de forma exitosa$")
    public void rellenaTodosLosDatosSobreDelFormularioDeRegistroParaCompletarloDeFormaExitosa() {

    }

}
