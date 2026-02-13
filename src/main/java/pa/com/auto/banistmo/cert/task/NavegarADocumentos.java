package pa.com.auto.banistmo.cert.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.auto.banistmo.cert.userinterface.BanistmoPagina;

public class NavegarADocumentos implements Task {
    public static NavegarADocumentos deCuentaAhorro() {
        return Tasks.instrumented(NavegarADocumentos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Click.on(BanistmoPagina.MENU_PRODUCTOS),
              Click.on(BanistmoPagina.OPCION_DEPOSITOS),
              Click.on(BanistmoPagina.CUENTA_AHORRO_COMERCIAL),
              Click.on(BanistmoPagina.TAB_DOCUMENTOS)
      );
    }
}
