package BaseSteps;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;
import BaseElements.MainPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.Test;

import java.time.Duration;

public class MainPageSteps extends MainPageElements {



    public static void mainPageMethod(){
        projectElem.shouldBe(visible, Duration.ofSeconds(60)).click();
        testElem.shouldBe(visible,Duration.ofSeconds(60)).click();
        taskToDo.shouldBe(visible,Duration.ofSeconds(60)).click();
        String numberTasks = numberOfTask.getText().substring(5);
        System.out.println("Текущее количество задач: " + numberTasks);
        searchInput.setValue("TestSelenium").click();
        taskTestSelenium.pressEnter();
        String testNameAssert = seleniumAssert.shouldBe(visible, Duration.ofSeconds(60)).getText();
        assertEquals("TestSelenium", testNameAssert,"not equals");







    }


}
