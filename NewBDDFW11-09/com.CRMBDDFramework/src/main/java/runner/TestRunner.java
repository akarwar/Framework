package runner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(CucumberOptions.class)
@CucumberOptions(
		features = "C:\\Users\\ahsan\\Documents\\New Eclipse Workspace\\FreeCRMBDDFramework\\src\\main\\java\\features\\contact.feature"
		,glue= {"stepDefinition"},	//name or pad of stepdefinition
		plugin= {"pretty", "html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//report types
		monochrome = true, // Display the consoul in readable format
		strict = true,//will execution and will notify the undefine step
		dryRun = false // will check the mapping between feature File and Step Difination file
		
		)

public class TestRunner {

}
