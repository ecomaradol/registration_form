package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();

    private SelenideElement

            headerInput = $("h5"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            subjectsInputs = $("#subjectsInput"),
            genderInput = $(byText("Female")),
            hobbyInput = $(byText("Sports")),
            imageInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            buttonInput = $("#submit"),
            formInput = $(".table-responsive");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public void getHeader(String header) {
        headerInput.shouldHave(text(header));
    }

    public void setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public void setLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }

    public void setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
    }

    public void setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
    }

    public void chooseGender(String gender) {
        genderInput.click();
    }

    public void setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
    }

    public void chooseSubjects(String subjectsInput) {
        subjectsInputs.setValue(subjectsInput).pressEnter();
    }

    public void chooseHobby(String hobby) {
        hobbyInput.click();
    }

    public void uploadImage(String image) {
        imageInput.uploadFromClasspath(image);
    }

    public void setAddress(String address) {
        addressInput.setValue(address);
    }

    public void chooseState(String state) {
        stateInput.setValue(state).pressEnter();
    }

    public void chooseCity(String city) {
        cityInput.setValue(city).pressEnter();
    }

    public void clickButton() {
        buttonInput.click();
    }

    public void checkForm() {
        formInput.shouldHave(text("Mara Dol"), text("test@test.com"), text("Female"),
                text("4564564545"), text("30 August,1983"), text("Maths, Arts"),
                text("Sports"), text("test_file.txt"), text("Address"), text("Uttar Pradesh Agra"));
    }

}
