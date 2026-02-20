package pa.com.auto.banistmo.cert.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BanistmoPagina {

    public static final Target BTN_ACEPTAR_COOKIES = Target.the("Boton aceptar cookies")
            .located(By.xpath("//span[contains(text(),'Entendido')]"));

        public static final Target PRODUCTOS_SERVICIOS = Target.the("Productos & Servicios")
                .locatedBy("//button[contains(text(),'Productos')]");

        public static final Target CUENTAS = Target.the("Cuentas")
                .locatedBy("//a[@href=\"/empresas/depositos\"]");

        public static final Target CUENTA_AHORRO_COMERCIAL = Target.the("Cuenta de ahorro comercial")
                .locatedBy("/html/body/div[2]/main/div/div/section[2]/div/div/div/div[5]/div/div[2]/div[4]/div/button");
    public static final Target DOCUMENTOS = Target.the("Sección Documentos")
            .locatedBy("//*[@id=\"Empresas > Cuentas > General > Tabs > Documentos\"]");
    public static final Target CONTRATO_UNICO_PDF = Target.the("Contrato único PDF")
            .locatedBy("/html/body/div[2]/main/div/div/section[2]/div/div/div/div/section/div/a");
    }

