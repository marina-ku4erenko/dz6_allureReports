package mari.ku;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class TestSelenideLoggerListener extends TestBase {

    @Test
    @Owner("marina-ku4erenko")
    @Feature("Страница репозитория")
    @Story("Наличие табов")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("testSelenideLoggerListener/ Проверка наличия таба Issues")
    @Link(name = "GitHub", url = "https://github.com")
    public void testSelenideLoggerListener() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        // открыть https://github.com/
        open("https://github.com/");
        // в поиске вбить dz6_allureReports и нажать enter
        $("[data-test-selector=nav-search-input]").setValue("dz6_allureReports").pressEnter();
        // перейти в репозиторий marina-ku4erenko/dz6_allureReports
        $(partialLinkText("dz6_allureReports")).click();
        // проверить, то на странице имеется таб Issues
        $(partialLinkText("Issues")).click();

    }

}
