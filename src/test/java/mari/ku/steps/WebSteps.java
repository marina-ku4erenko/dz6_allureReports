package mari.ku.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открываем главную страницу github")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("Ищем репозиторий {repository}")
    public void searchRepository(String repository) {
        $("[data-test-selector=nav-search-input]").setValue(repository).pressEnter();
    }

    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(partialLinkText(repository)).click();
    }

    @Step("Проверяем, что на странице присутствует таб Issues")
    public void shouldSeeIssue() {
        $(partialLinkText("Issues")).click();
    }

}
