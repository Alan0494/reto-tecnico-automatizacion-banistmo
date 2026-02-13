package pa.com.auto.banistmo.cert.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ElPdfEsCorrecto implements Question<Boolean> {

    private String Banistmo;

    public ElPdfEsCorrecto(String nombreEsperado) {
        this.Banistmo = Banistmo;
    }

    public static ElPdfEsCorrecto conNombre(String Banistmo) {
        return new ElPdfEsCorrecto(Banistmo);

    }
    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String mainHandle = driver.getWindowHandle();
        Set<String> handless = driver.getWindowHandles();
        for (String window : allWindows);
        if (!window.equals(originalWindow)) { driver.switchTo().window(window); break; } } return driver.getCurrentUrl().contains(nombreEsperado); }



    }
    }
}


