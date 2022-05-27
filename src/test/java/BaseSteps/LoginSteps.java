package BaseSteps;
import BaseElements.LoginElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import org.junit.jupiter.api.Assertions;

import java.time.Duration;

public class LoginSteps extends LoginElements {




    public static void loginMethod(){
        username.shouldBe(Condition.visible, Duration.ofSeconds(60)).setValue("ktambov");
        password.setValue("123Qwerty");
        loginBtn.click();
        String elemVal = asserElement.shouldBe(Condition.visible,Duration.ofSeconds(60)).getText();
        Assertions.assertEquals(elemVal, asserElement.getText(),"error");
    }

}
