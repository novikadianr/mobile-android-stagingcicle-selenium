package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TC6_addnewcard.feature",
        glue = "stepDef"
//        plugin = {"html:target/HTML_report.html","json:target/JSON_report.json", "junit:target/XML_report.xml"}
)
public class runTC6_addcard {
}
