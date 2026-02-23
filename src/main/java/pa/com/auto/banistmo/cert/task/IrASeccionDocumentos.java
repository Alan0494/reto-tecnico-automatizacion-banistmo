package pa.com.auto.banistmo.cert.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import pa.com.auto.banistmo.cert.userinterface.BanistmoPagina;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrASeccionDocumentos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BanistmoPagina.DOCUMENTOS)
        );
    }
    public static IrASeccionDocumentos seccion(){
        return instrumented(IrASeccionDocumentos.class);
    }
}
