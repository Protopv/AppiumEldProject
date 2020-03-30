package tests;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.troubleshootingPage;
import tests.BaseClass;

public class basics extends BaseClass {
			
	@Test
	public void testOne() {

		ExtentTest test1 = extent.createTest("Test one", "Sample test");
				
		test1.log(Status.INFO, "tEST oNE STARTED");
		
		driver.findElementByXPath("//android.widget.EditText[@text='Employee ID']").sendKeys("USER");
		test1.log(Status.PASS, "send keys ADMIN01");
		System.out.println("completed test one");
		test1.log(Status.INFO, "Test one complited");
		
		//driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys("User");
		//driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.EditText[@text='Registration code']").sendKeys("inthinc850");
		
		//driver.hideKeyboard();
		driver.findElementByClassName("android.widget.Button").click();
		
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		//click troubleshooting
		driver.findElementById("com.inthinc.connectApplication:id/troubleshooting_settings_container").click();
		
		// troubleshooting password
		driver.findElementById("com.inthinc.connectApplication:id/wizard_text_field").sendKeys("54912");
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		//Get seatbelt
		driver.findElementById("com.inthinc.connectApplication:id/text1").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		
		//Get ignition state
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Get ignition state']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//load emulation
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Load eumulation file']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//reguest configuration
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Request configuration']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//Send configuration
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Send configuration']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//Test satellite
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Test satellite']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		
		//Test gprs
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Test gprs']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//Check odb data
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Check odb data']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//Put system to sleep
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Put system to sleep']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//Reboot system
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Reboot system']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		//Program New Trailer ID
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Program New Trailer ID']").click();
		
		// click next
		driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		
		// click back
		driver.findElementByXPath("//android.widget.Button[@text='Back']").click();
		
		System.out.println("completed test one");
		test1.log(Status.INFO, "Test one complited");
		
	}
		
}	
		
	
	











