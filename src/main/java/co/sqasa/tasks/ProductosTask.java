package co.sqasa.tasks;


import co.sqasa.interactions.WaitFor;
import lombok.Data;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.userinterfaces.HomePage.*;


public class ProductosTask implements Task {
    private String categoria;
    private String prodcuto1;
    private String producto2;

    public ProductosTask(String categoria, String prodcuto1, String producto2) {
        this.categoria = categoria;
        this.prodcuto1 = prodcuto1;
        this.producto2 = producto2;
    }

    public static ProductosTask agregar(String categoria, String prodcuto1, String producto2) {

        return Instrumented.instanceOf(ProductosTask.class).withProperties(categoria, prodcuto1, producto2);
    }

    @Override
    public <T extends Actor> void performAs(T miguel) {
        miguel.attemptsTo(
                Click.on(CATEGORIA.of(categoria)),
                Click.on(PRODUCTOS.of(prodcuto1)),
                Click.on(BTN_AGREGAR_CARRITO),
                Click.on(CATEGORIA.of(categoria)),
                Click.on(PRODUCTOS.of(producto2)),
                Click.on(BTN_AGREGAR_CARRITO)
        );
    }
}
