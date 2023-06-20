package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.component.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();

    private final SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            genderMale = genderWrapper.$(byText("Male")),
            genderFemale = genderWrapper.$(byText("Female")),
            genderOther = genderWrapper.$(byText("Other")),
            dateOfBirthInput = $("#dateOfBirthInput").as("Поле ввода Даты Рождения"),
            userPhoneNumberInput = $("#userNumber");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    @Step("Задание имени пользователя")
    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }
    @Step("Задание фамилии пользователя")
    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        genderWrapper.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setPhone(String phoneNumber) {
        userPhoneNumberInput.setValue(phoneNumber);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

}
