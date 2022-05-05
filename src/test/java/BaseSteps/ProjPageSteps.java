package BaseSteps;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static BaseElements.ProjectPageElements.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjPageSteps {
    public static void projectPageMethod() {
        String statusChek = statusVal.getText();
        assertEquals("В РАБОТЕ", statusChek, "not equals");
        String versChek = versionCheck.getText();
        assertEquals("Version 2.0", versChek, "not equals");
        newBug.click();
        newBugAssert.shouldBe(Condition.visible, Duration.ofSeconds(60));
    }
}
