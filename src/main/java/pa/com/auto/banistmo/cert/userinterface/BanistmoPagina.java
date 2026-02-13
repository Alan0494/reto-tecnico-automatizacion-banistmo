package pa.com.auto.banistmo.cert.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BanistmoPagina {

    public static final Target MENU_PRODUCTOS = Target.the("Menu productos y servicios")
            .locatedBy("//a[contains(text(),'Productos & Servicios')]");
    public static final Target OPCION_DEPOSITOS = Target.the("Opcion Depositos")
            .locatedBy("//a[text()='Depositos']");
    public static final Target CUENTA_AHORRO_COMERCIAL = Target.the("Cuenta de ahorros")
            .locatedBy("//a[text()='Cuenta Ahorro Comercial')]");
    public static final Target TAB_DOCUMENTOS = Target.the("Documentos")
            .locatedBy("//a[text()='Documentos')]");
    public static final Target PDF_CONTRATO = Target.the("PDF Contrato unico")
            .locatedBy("//table//td[contains(.,'Contrato unico')]/following-sibling::td//img");














}
