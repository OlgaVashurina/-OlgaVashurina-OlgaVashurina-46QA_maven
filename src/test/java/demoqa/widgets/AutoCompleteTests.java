package demoqa.widgets;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoCompleteTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver).getWidgets().hideAds();
        new SidePage(app.driver).selectAutoCompleteMenu().hideAds();
    }

    @Test
    public void autoCompleteSingleTest(){
        new demoqa.pages.AutoCompletePage(app.driver)
                .autoComplete("m")
                .verifyAutocomplete("Magenta")
        ;
    }

    @Test
    public void autoCompleteArrayTest(){
        String[] autoCompleteArray = {"m","b","b"};
        String[] autoCompleteArrayVerify = {"Magenta","Black", "Blue"};
        new demoqa.pages.AutoCompletePage(app.driver)
                .autoCompleteArray(autoCompleteArray)
                .verifyAutocompleteArray(autoCompleteArrayVerify)
        ;
    }
}
