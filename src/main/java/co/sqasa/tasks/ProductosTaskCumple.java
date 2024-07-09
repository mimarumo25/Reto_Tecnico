package co.sqasa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.userinterfaces.Carritopage.PRODUCTOS_Elimina;
import static co.sqasa.userinterfaces.HomePage.*;

public class ProductosTaskCumple implements Task {
    private String categoria, producto;

    public ProductosTaskCumple(String categoria, String producto) {
        this.categoria = categoria;
        this.producto = producto;
    }

    public static ProductosTaskCumple add(String categoria, String producto) {

        return Instrumented.instanceOf(ProductosTaskCumple.class).withProperties(categoria, producto);
    }

    @Override
    public <T extends Actor> void performAs(T miguel) {
        System.out.println(categoria +producto);
        miguel.attemptsTo(
                Click.on(CATEGORIA.of(categoria)),
                Click.on(PRODUCTOS.of(producto)),
                Click.on(BTN_AGREGAR_CARRITO),
                Click.on(PRODUCTOS_Elimina)
                );
    }
}
