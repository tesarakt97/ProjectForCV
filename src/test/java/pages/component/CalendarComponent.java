package pages.component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private final SelenideElement
            dateOfBirthMonthPickerOption = $(".react-datepicker__month-select").as("Выбор месяца"),
            dateOfBirthYearPickerOption = $(".react-datepicker__year-select").as("Выбор года");

    public void setDate(String day, String month, String year) {
        dateOfBirthMonthPickerOption.selectOption(month);
        dateOfBirthYearPickerOption.selectOption(year);
        $("react-datepicker__day--0" + day).click();
    }
}
