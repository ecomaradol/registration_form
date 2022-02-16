package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.image;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class FillFormPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Mara";
    String lastName = "Dol";
    String userEmail = "test@test.com";
    String userNumber = "4564564545";
    String subjectsInput = "Math";
    String subjectsInput1 = "Arts";
    String gender = "Female";
    String hobby = "Sports";
    String address = "Address";
    String state = "Uttar Pradesh";
    String city = "Agra";
    String header = "Student Registration Form";

    @Test
    void successFillForm() {

        registrationPage.setOpen();
        registrationPage.setHeader(header);
        registrationPage.setFirstName(firstName);
        registrationPage.setLastName(lastName);
        registrationPage.setUserEmail(userEmail);
        registrationPage.setUserNumber(userNumber);
        registrationPage.setBirthDate("30", "August", "1983");
        registrationPage.setSubjects(subjectsInput);
        registrationPage.setSubjects(subjectsInput1);
        registrationPage.setGender(gender);
        registrationPage.setHobby(hobby);
        registrationPage.setImage("test_file.txt");
        registrationPage.setAddress(address);
        registrationPage.setState(state);
        registrationPage.setCity(city);
        registrationPage.setButton();
        registrationPage.checkForm();

    }
}
