package pages;


import maps.LoginElementMap;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage extends LoginElementMap {

    public LoginPage(){PageFactory.initElements(driver, this);}

    public void validarCertificado() {
        if (detailsButton.isDisplayed()){
            detailsButton.click();
            linkSeguro.click();
        }else {
            System.out.print("Tela sem certificado");
        }
    }

    public void preencherLogin(String usuario) {
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        inputEmail.click();
        inputPassw.clear();
        inputPassw.sendKeys(senha);
    }

    public void clicarBotaoLogin() {

        buttonLogin.click();
    }

    public void validarModalMensagemErro(String mensagemErro) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(msgmError.isDisplayed());
        assertEquals(mensagemErro, msgmError.getText());
        System.out.print(msgmError.getText());
    }
}
