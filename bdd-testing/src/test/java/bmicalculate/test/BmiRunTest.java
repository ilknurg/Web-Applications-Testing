package bmicalculate.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/report/bmi.html"})
public class BmiRunTest {
	
}
