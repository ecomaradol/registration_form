package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

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

        registrationPage.openPage();
        registrationPage.getHeader(header);
        registrationPage.setFirstName(firstName);
        registrationPage.setLastName(lastName);
        registrationPage.setUserEmail(userEmail);
        registrationPage.setUserNumber(userNumber);
        registrationPage.setBirthDate("30", "August", "1983");
        registrationPage.chooseSubjects(subjectsInput);
        registrationPage.chooseSubjects(subjectsInput1);
        registrationPage.chooseGender(gender);
        registrationPage.chooseHobby(hobby);
        registrationPage.uploadImage("test_file.txt");
        registrationPage.setAddress(address);
        registrationPage.chooseState(state);
        registrationPage.chooseCity(city);
        registrationPage.clickButton();
        registrationPage.checkForm();

    }
}
