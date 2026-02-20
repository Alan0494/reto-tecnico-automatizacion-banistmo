package pa.com.auto.banistmo.cert.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import pa.com.auto.banistmo.cert.userinterface.BanistmoPagina;


public class AbrirNavegador implements Task {
    public static AbrirNavegador deCuentaAhorro() {
        return Tasks.instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BanistmoPagina.BTN_ACEPTAR_COOKIES),
                Click.on(BanistmoPagina.PRODUCTOS_SERVICIOS), 
                Click.on(BanistmoPagina.CUENTAS),
                Scroll.to(BanistmoPagina.CUENTA_AHORRO_COMERCIAL),
                Click.on(BanistmoPagina.CUENTA_AHORRO_COMERCIAL)
        );

    }
}
