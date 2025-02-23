package demoqa.book_store;
import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.LoginPage;
import demoqa.pages.SidePage;
import demoqa.utils.RetryAnalyser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        new HomePage(app.driver).getBookStore().hideAds();
        new SidePage(app.driver).selectLogin().hideAds();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void loginPositiveTest() {
        new LoginPage(app.driver)
                .enterPersonalData("olga_786","qwerty1!")
                .clickOnLoginButton()
                .verifyUserName("olga_786");
    }
}