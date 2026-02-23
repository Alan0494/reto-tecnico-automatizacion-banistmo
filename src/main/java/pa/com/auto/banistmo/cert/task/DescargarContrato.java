package pa.com.auto.banistmo.cert.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import pa.com.auto.banistmo.cert.userinterface.BanistmoPagina;

public class DescargarContrato implements Task {

    public static DescargarContrato ahora() {
        return Tasks.instrumented(DescargarContrato.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BanistmoPagina.CONTRATO_UNICO_PDF),
                Click.on(BanistmoPagina.CONTRATO_UNICO_PDF)
        );
    }
}
