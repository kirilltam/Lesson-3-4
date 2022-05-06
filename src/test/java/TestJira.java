
import WebHooks.WebHooks;

import org.junit.Test;
import static BaseSteps.LoginSteps.*;
import static BaseSteps.MainPageSteps.*;
import static BaseSteps.ProjPageSteps.*;
import static BaseSteps.TaskPageSteps.*;
public class TestJira extends WebHooks {

    @Test
    public void Test1(){
        loginMethod();

    }

    @Test
    public void Test2(){
        loginMethod();
        mainPageMethod();

    }
    @Test
    public void Test3(){
        loginMethod();
        mainPageMethod();
        projectPageMethod();

    }
    @Test
    public void Test4(){
        loginMethod();
        mainPageMethod();
        projectPageMethod();
        taskPageMethod();


    }
}
