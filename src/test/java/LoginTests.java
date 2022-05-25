import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    @Before
    public void abreBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amand\\OneDrive\\Documentos\\TT\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Drive é o objeto do selenium
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Aguardar o browser abrir

    }


    @Test
    public void loginComSucesso() { // Criamos um metodo: tipo do metodo (public), retorno do metodo (void) e nome do metodo

    }

    @Test
    public void loginSemSucesso() { // Criamos um metodo: tipo do metodo (public), retorno do metodo (void) e nome do metodo


    }
    public void fechaBrowser(){
       // driver.quit(); - Ver na proxima aula.
    }
}