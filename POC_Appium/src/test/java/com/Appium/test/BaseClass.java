package com.Appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException
	{
		 	DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("deviceName", "emulator-5554");
	        caps.setCapability("appPackage", "com.swaglabsmobileapp"); // Replace with your app's package name
	        caps.setCapability("appActivity", ".SplashActivity");
	        
	        caps.setCapability("app", "C:\\Users\\ADMIN\\eclipse-workspace\\POC_Appium\\sources\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
	        
	        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
	        Thread.sleep(10000);
	}

}
