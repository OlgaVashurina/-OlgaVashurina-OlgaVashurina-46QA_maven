package demoqa.forms;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.PracticeFormPage;
import demoqa.pages.SidePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver).getForms().hideAds();
        new SidePage(app.driver).selectPracticeForm().hideAds();
    }

    @Test
    public void practiceFormTest(){
        new PracticeFormPage(app.driver)
                .enterPersonalData(
                        "Bth","Gibbs","adminadmin@gmail.com", "1223456567890")
                .selectGender("Female")
                .chooseDateAsString("04 May 1965")
                //.chooseDate("4","May","1965")
                .enterSubject(new String[]{"Maths", "English"})
                .chooseHobbies(new String[]{"Sports", "Music"})
                .uploadPicture("C:/Users/ovash/Desktop/сайт hr/4.png")
                .enterCurrentAddress("Portishead, Bristol, UK")
                .enterState("NCR")
                .enterCity("Delhi")
                .submitForm()
                .verifySuccessRegistration("Thanks for submitting the form")
        ;
    }

    @Test
    @Parameters({"firstName","lastName", "email", "phone"})
    public void practiceFormParametersTest(String firstName, String lastName, String email, String phone){
        new PracticeFormPage(app.driver)
                .enterPersonalData(firstName,lastName,email, phone)
                .selectGender("Female")
                .chooseDateAsString("04 May 1965")
                //.chooseDate("4","May","1965")
                .enterSubject(new String[]{"Maths", "English"})
                .chooseHobbies(new String[]{"Sports", "Music"})
                .uploadPicture("C:/Users/ovash/Desktop/сайт hr/4.png")
                .enterCurrentAddress("Portishead, Bristol, UK")
                .enterState("NCR")
                .enterCity("Delhi")
                .submitForm()
                .verifySuccessRegistration("Thanks for submitting the form")
        ;
    }
}