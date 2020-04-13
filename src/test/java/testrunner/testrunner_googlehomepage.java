package testrunner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)//telling to run test as cucumber test
@CucumberOptions(features="src\\test\\resources\\feature\\search_addtocart.feature", glue="stepdefinations",plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/cucumber.json" })//path of feature file and step def class
public class testrunner_googlehomepage {
//	@AfterClass
//	 public static void writeExtentReport() {
//	 //Reporter.loadXMLConfig(new File("C:\\Users\\DELL\\eclipse-workspace\\bdd_prac\\extent-config.xml"));
//	 }
}
