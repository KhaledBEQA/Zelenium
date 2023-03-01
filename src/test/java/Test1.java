import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {
    @Test

    public void Test() throws MalformedURLException, InterruptedException {
        System.out.println("Thread which is running"+Thread.currentThread().getId());
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME,"chrome");
        WebDriver driver=new RemoteWebDriver(new URL("http://locahost:4444/wd/hub"),cap);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.quit();
    }
}
