package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"F:\\selenium projects\\CucumberTest3\\src\\test\\resources\\features\\data.feature"},
			
				
		glue= {"Stepdefinitions"},
		plugin= {"pretty"},
		stepNotifications=true,
		monochrome=true,
		dryRun=false
		)
public class Runner {

}
