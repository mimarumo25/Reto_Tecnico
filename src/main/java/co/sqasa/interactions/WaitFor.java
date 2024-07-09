package co.sqasa.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitFor implements Interaction {
    protected  double sec;

    public WaitFor(double sec) {
        this.sec = sec;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        try {
            Thread.sleep((long)(sec * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public  static WaitFor on(double sec){
        return Instrumented.instanceOf(WaitFor.class).withProperties(sec);
    }
}
