package co.sqasa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Carritopage {
    public static final Target PRODUCTOS_CARRITO = Target.the("Nombre del producto en el carrito")
            .locatedBy("//h1[contains(text(), 'Carrito')]");
}
