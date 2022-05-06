package BaseSteps;
import com.codeborne.selenide.Condition;

import static BaseElements.ProjectPageElements.versionCheck;
import static BaseElements.TaskElements.*;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskPageSteps {
    public static void taskPageMethod() {

        createBtn.shouldBe(Condition.visible).pressEnter();
        taskType.shouldBe(Condition.visible).click();
        taskType.sendKeys("Ошибка");
        taskType.pressEnter();


        taskName.setValue("NewBug25");

        switchTo().frame("mce_0_ifr");
        description.sendKeys("bad bug");
        switchTo().defaultContent();





        priorityVer.shouldBe(Condition.visible).click();
        priorityVer.sendKeys("Low");
        priorityVer.pressEnter();


        switchTo().frame("mce_6_ifr");
        descriptionField.sendKeys("А Я вам сейчас покажу, откуда готовилось нападение!");
        switchTo().defaultContent();


        assignMe.click();


        createTaskBtn.shouldBe(Condition.visible).click();

        closePopUpBtn.shouldBe(Condition.visible).click();
        searchTask.sendKeys("NewBug25");
        searchTask.shouldBe(Condition.visible).click();
        foundTask.shouldBe(Condition.visible).click();
        processBtn.shouldBe(Condition.visible).click();
        doneBtn.shouldBe().click();

        String statuss = status.getText();
        assertEquals("Выполнено", statuss,"not equals");








    }
}

