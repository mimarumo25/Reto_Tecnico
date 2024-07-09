package co.sqasa.stepdefinitions;


import co.sqasa.questions.CarroDeCompras;
import co.sqasa.tasks.ProductosTask;
import co.sqasa.tasks.ProductosTaskCumple;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;




public class CompraStepDefinition {
    @Before
    public static void onStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que estoy en la pagina principal del sitio de compras")
    public void queEstoyEnLaPaginaPrincipalDelSitioDeCompras() {
        OnStage.theActorCalled("Miguel").attemptsTo(Open.url("https://www.floristeriamundoflor.com/"));

    }

    @Cuando("selecciono la categoria {string} agregando los productos {string} {string} al carrito")
    public void seleccionoLaCategoriaAgregandoLosProductosAlCarrito(String categoria, String prodcuto1, String producto2) {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductosTask.agregar(categoria,prodcuto1, producto2));
    }

    @Entonces("el carrito de compras deberia contener ambos productos seleccionados")
    public void elCarritoDeComprasDeberiaContenerAmbosProductosSeleccionados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CarroDeCompras.contenido()));

    }
    @Cuando("selecciono la categoria {string} agregando el {string} al carrito")
    public void seleccionoLaCategoriaAgregandoElProductosAlCarrito(String categoria, String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductosTaskCumple.add(categoria,producto));

    }
    @Cuando("elimino el producto del carrito de comporas")
    public void eliminoElProductoDelCarritoDeComporas() {

    }
    @Entonces("el carrito de compras deberia estar vacio")
    public void elCarritoDeComprasDeberiaEstarVacio() {

    }

}
