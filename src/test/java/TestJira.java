import BaseSteps.TaskPageSteps;
import WebHooks.WebHooks;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static BaseSteps.LoginSteps.*;
import static BaseSteps.MainPageSteps.*;
import static BaseSteps.ProjPageSteps.*;
import static BaseSteps.TaskPageSteps.*;
public class TestJira extends WebHooks {

    @Test
    public void Test1(){
        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        loginMethod();

    }

    @Test
    public void Test2(){
        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        loginMethod();
        mainPageMethod();

    }
    @Test
    public void Test3(){
        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        loginMethod();
        mainPageMethod();
        projectPageMethod();

    }
    @Test
    public void Test4(){
        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        loginMethod();
        mainPageMethod();
        projectPageMethod();
        taskPageMethod();


    }
}
