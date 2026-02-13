package pa.com.auto.banistmo.cert.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features"},
        glue = "pa.com.auto.banistmo.cert.stepdefinitions",
        snippets =CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Reto"
)

public class BanistmoRunner {

}
