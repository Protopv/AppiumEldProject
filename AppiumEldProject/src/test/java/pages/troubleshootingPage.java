package pages;


import org.openqa.selenium.WebElement;


import tests.BaseClass;



public class troubleshootingPage extends BaseClass {
	
	

	public void testTroubleshooting() {
    
	//click troubleshooting
	WebElement troubleshooting = driver.findElementById("com.inthinc.connectApplication:id/troubleshooting_settings_container");
    troubleshooting.click();
    //WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	//logInButton.click();
	
	// enter password
	//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	//password.sendKeys("10105100");
	
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
	driver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys("Admin01");
}


}