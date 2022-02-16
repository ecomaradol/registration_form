package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FillForm {

    @BeforeAll()
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillForm() {
        open("/automation-practice-form");
        $("h5").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Mara");
        $("#lastName").setValue("Dol");
        $("#userEmail").setValue("test@test.com");
        $(byText("Female")).click();
        $("#userNumber").setValue("4564564545");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(8);
        $(".react-datepicker__year-select").selectOption("1983");
        $(".react-datepicker__day--030").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("test_file.txt");
        $("#currentAddress").setValue("Address");
        $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
        $("#react-select-4-input").setValue("Agra").pressEnter();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Mara Dol"), text("test@test.com"), text("Female"),
                text("4564564545l"), text("30 August,1983"), text("Math, Arts"),
                text("Sports"), text("test_file.txt"), text("Address"), text("Uttar Pradesh Agra"));


    }
}
