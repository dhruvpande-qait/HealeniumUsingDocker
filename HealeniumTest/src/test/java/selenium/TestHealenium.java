package selenium;

import com.epam.healenium.PageAwareBy;
import com.epam.healenium.annotation.PageAwareFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestHealenium extends BaseTest {
    @Test
    public void login(){
        driver.get("file:///home/qainfotech/Desktop/Html-css-day1-master/Day-2-%20using%20Bootstrap/login.html");
        driver.findElement(PageAwareBy.by("login page",By.id("signup123"))).click();
    }
}
