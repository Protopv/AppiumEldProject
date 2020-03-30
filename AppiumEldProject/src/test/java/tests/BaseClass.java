package tests;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportsLog{
	

	//protected 
	protected AndroidDriver<AndroidElement> driver;
	
	
	@BeforeTest
	public  void setup() throws MalformedURLException {
		
		

			File appDir = new File("src/test/resources/apps/");
			File app = new File(appDir,"app-qa-release_3.5.0.255.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo1");
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//return driver;


		
	
	
	}
	@Test
	public void sampleTest() {
		System.out.println("I am inside samle Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {

		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");;
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");//версия андройда 5.1.0
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SABRESD MX6DQ");// имя телефона
		caps.setCapability(MobileCapabilityType.UDID, "0b0ec1d4ea9a07f7");//adb devices в командной строке видно 345345ab
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//		caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, caps);
		//driver = new AndroidDriver<MobileElement>(url, caps);
		//driver = new IOSDriver<MobileElement>(url, caps);

		}
		catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Massege is : "+exp.getMessage());
			exp.printStackTrace();
		}
	
	}
	@Test
	public void sampleTest() {
		System.out.println("I am inside samle Test");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
*/
}
