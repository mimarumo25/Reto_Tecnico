package co.sqasa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Carritopage {
    public static final Target PRODUCTOS_CARRITO = Target.the("Nombre del producto en el carrito")
            .locatedBy("//h1[contains(text(), 'Carrito')]");
    public static final Target PRODUCTOS_Elimina = Target.the("Nombre del producto en el carrito")
            .locatedBy("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[6]/a/i");

}
