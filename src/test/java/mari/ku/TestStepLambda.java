package mari.ku;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.partialLinkText;

public class TestStepLambda extends TestBase {

    private static final String REPOSITORY = "dz6_allureReports";

    @Test
    @Owner("marina-ku4erenko")
    @Feature("Страница репозитория")
    @Story("Наличие табов")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("testStepLambda/ Проверка наличия таба Issues")
    @Link(name = "GitHub", url = "https://github.com")
    public void testStepLambda() {

        step("Открываем главную страницу github", () -> {
            open("https://github.com/");
        });

        step("Ищем репозиторий " + REPOSITORY, () -> {
            $("[data-test-selector=nav-search-input]").setValue(REPOSITORY).pressEnter();
        });

        step("Переходим в репозиторий " + REPOSITORY, () -> {
            $(partialLinkText(REPOSITORY)).click();
        });

        step("Проверяем, что на странице присутствует таб Issues", () -> {
            $(partialLinkText("Issues")).click();
        });

    }
}
