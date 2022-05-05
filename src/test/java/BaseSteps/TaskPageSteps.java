package BaseSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.time.Duration;

import static BaseElements.TaskElements.*;
import static BaseElements.ProjectPageElements.statusVal;
import static BaseElements.ProjectPageElements.versionCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskPageSteps {
    public static void taskPageMethod() {
//        bugTypeSort.shouldBe(Condition.visible, Duration.ofSeconds(60)).sendKeys("Ошибка");
//        bugTypeSort.pressEnter();
//        bugTupe.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();
//        bugTupe.pressEnter();
//        thematic.setValue("11111111");
//        aboutBug.click();
//        aboutBug.sendKeys("2222222");
//        versionA.click();
//        aboutBug2.click();
//        aboutBug2.sendKeys("333333");
//        versionB.scrollIntoView(true).click();
//        assignMe.click();
//        createBtn.scrollIntoView(true).click();
//        alLTasks.click();
//        myTasks.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();
//        ownTask.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();
//        businessProcessBtn.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();
//        doneBtn.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();
//        while (!statusVal.getText().equals("ГОТОВО")){
//            statusval.getText();
//        }
//        assertEquals("ГОТОВО", statusVal.getText(),"not equals");
//        String versCheck = versionCheck.getText();
//        assertEquals("version 2.0",versCheck,"not equals");
//
//
//    }
        createBtn.shouldBe(Condition.visible, Duration.ofSeconds(60)).pressEnter();
        taskType.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        taskType.sendKeys("Ошибка");
        taskType.pressEnter();
        taskName.setValue("NewBug");
        description.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();


        version2.click();

        priorityVer.shouldBe(Condition.visible,Duration.ofSeconds(60)).click();
        priorityVer.sendKeys("Low");
        priorityVer.pressEnter();

        environment.click();
        environment.sendKeys("А я Вам сейчас покажу откуда готовилось нападение!");






    }
}

