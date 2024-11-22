package pageFunctions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.LocatorUtils;

import static utilities.Wait.waitUntilVisibleByLocator;

public class samsungPageMethods {
    private AndroidDriver driver;
    public void displayFirstProduct(String productDesc, String productPrice) {
        try {
            By locator_Desc = LocatorUtils.getLocator(productDesc);
            By locator_Price = LocatorUtils.getLocator(productPrice);
            WebElement element_desc=waitUntilVisibleByLocator(driver,locator_Desc);
            String desc=element_desc.getText();WebElement element_price=waitUntilVisibleByLocator(driver,locator_Price);
            String price=element_price.getText();System.out.println("Desc: "+desc+", Price: "+price);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Hata oluştu (getFirstElementInfo): " + e.getMessage());
        }
    }
}