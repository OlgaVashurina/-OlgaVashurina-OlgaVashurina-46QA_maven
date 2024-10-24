package demoqa.elements;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksImagesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver).getElements().hideAds();
        new SidePage(app.driver).selectBrokenLinksImages().hideAds();
    }

    @Test
    public void BrokenLinksImagesTest(){
        new demoqa.pages.BrokenLinksImagesPage(app.driver)
                .checkBrokenLinksImages()
        ;
    }
}
