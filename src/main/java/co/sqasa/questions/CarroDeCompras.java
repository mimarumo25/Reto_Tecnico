package co.sqasa.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.sqasa.userinterfaces.Carritopage.PRODUCTOS_CARRITO;

public class CarroDeCompras implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor miguel) {

        boolean producto1Presente = PRODUCTOS_CARRITO.resolveFor(miguel).isDisplayed();

        return producto1Presente ;
    }

    public static CarroDeCompras contenido() {
        return new CarroDeCompras();
    }
}
