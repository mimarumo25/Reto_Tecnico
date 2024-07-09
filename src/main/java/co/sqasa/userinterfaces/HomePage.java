package co.sqasa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target CATEGORIA = Target.the("Categoria del producto")
            .locatedBy("(//a[contains(text(), '{0}')])[4]");
    public static final Target PRODUCTOS = Target.the("producto por nombre")
            .locatedBy("//a[contains(text(), '{0}')]");
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton para agregar al carrito ")
            .locatedBy("//button[contains(text(), 'Añadir al carrito')]");

}
