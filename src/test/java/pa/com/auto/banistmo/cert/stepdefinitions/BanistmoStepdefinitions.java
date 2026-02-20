package pa.com.auto.banistmo.cert.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.auto.banistmo.cert.task.AbrirNavegador;
import pa.com.auto.banistmo.cert.task.DescargarContrato;
import pa.com.auto.banistmo.cert.task.IrASeccionDocumentos;
import pa.com.auto.banistmo.cert.userinterface.BanistmoPagina;


public class BanistmoStepdefinitions {

@Before
public void setUp() {
    OnStage.setTheStage(new OnlineCast());

}


    @Dado("Que el cliente quiere acceder al servicio Cuenta de ahorro comercial de Depositos empresas")
    public void queElClienteQuiereAccederAlServicioCuentaDeAhorroComercialDeDepositosEmpresas() {

        OnStage.theActorCalled("Cliente").wasAbleTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/empresas/"),
                AbrirNavegador.deCuentaAhorro()
        );

    }
    @Cuando("va a la seccion de documentos")
    public void vaALaSeccionDeDocumentos() {

    OnStage.theActorInTheSpotlight().attemptsTo(IrASeccionDocumentos.seccion());

    }
    @Cuando("descarga el documento Contrato unico de Productos y Servicios Bancarios")
    public void descargaElDocumentoContratoUnicoDeProductosYServiciosBancarios() {

    OnStage.theActorInTheSpotlight().attemptsTo(DescargarContrato.ahora());
    }
    @Entonces("deberia ver el documento generado")
    public void deberiaVerElDocumentoGenerado() {

    }
}
