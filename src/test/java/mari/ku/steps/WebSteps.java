package mari.ku.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открываем главную страницу github")
    public WebSteps openMainPage() {
        open("https://github.com/");

        return this;
    }

    @Step("Ищем репозиторий {repository}")
    public WebSteps searchRepository(String repository) {
        $("[data-test-selector=nav-search-input]").setValue(repository).pressEnter();

        return this;
    }

    @Step("Переходим в репозиторий {repository}")
    public WebSteps goToRepository(String repository) {
        $(partialLinkText(repository)).click();

        return this;
    }

    @Step("Проверяем, что на странице присутствует таб Issues")
    public WebSteps shouldSeeIssue() {
        $(partialLinkText("Issues")).click();

        return this;
    }

}
