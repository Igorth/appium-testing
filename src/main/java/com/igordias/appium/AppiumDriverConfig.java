package com.igordias.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {

    public final AppiumDriver driver;
    private static AppiumDriverConfig _instance;

    public static AppiumDriverConfig Instance() {
        if(AppiumDriverConfig._instance == null) {
            AppiumDriverConfig._instance = new AppiumDriverConfig();
        }
        return AppiumDriverConfig._instance;
    }

    private AppiumDriverConfig() throws MalformedURLException {
        File apk = new File("/Users/igordias/IdeaProjects/appium-project/src/main/resources/alura_esporte.apk");

        DesiredCapabilities configs = new DesiredCapabilities();
        configs.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        configs.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configs.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");


        URL urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<>(urlConexao, configs);
    }
}
