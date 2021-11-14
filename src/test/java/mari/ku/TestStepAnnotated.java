package mari.ku;

import io.qameta.allure.*;
import mari.ku.steps.WebSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestStepAnnotated extends TestBase {

    private static final String REPOSITORY = "dz6_allureReports";
    private WebSteps steps = new WebSteps();

    @Test
    @Owner("marina-ku4erenko")
    @Feature("Страница репозитория")
    @Story("Наличие табов")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("testStepAnnotated/ Проверка наличия таба Issues")
    @Link(name = "GitHub", url = "https://github.com")
    public void testStepAnnotated() {

        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.shouldSeeIssue();

    }
}
