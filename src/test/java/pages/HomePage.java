package pages;

import maps.HomeElementMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class HomePage extends HomeElementMap {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void validarUsuarioLogado() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Assert.assertTrue(iconUser.isDisplayed());
        //iconUser.click();
    }

    public void efetuarLogout() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  if (iconUser.isDisplayed()){
        driver.get("https://sapgpopas001.fh.com.br:8446/sap/public/bc/icf/logoff?sap-client=100");
        System.out.print("Chegamos aqui");
        //}else {
        System.out.print("Usuário não está Logado");
        //}
    }

    public void clicarMenuICMS() throws Throwable {

        try {
            WebElement menuICMS = driver.findElement((By.xpath("//div[contains(text(), 'ICMS/IPI')]")));
            menuICMS.click();
        } catch (org.openqa.selenium.StaleElementReferenceException exception) {
            WebElement menuICMS = driver.findElement((By.xpath("//div[contains(text(), 'ICMS/IPI')]")));
            menuICMS.click();
        }

    }

    public void clicarItemPainelICMS() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            selectItemICMS.click();
        } catch (org.openqa.selenium.StaleElementReferenceException exception) {
            selectItemICMS.click();
        }
    }

    public void validarTelaHome() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        if (inputTransacao.isDisplayed()) {
            inputTransacao.click();
        }
    }

    public void preencherDadosTransacao(String transacao) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        inputTransacao.clear();
        inputTransacao.sendKeys(transacao);
        inputTransacao.sendKeys(Keys.ENTER);
    }

    public void preencherIdApuracao(String apuracao) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        inputApuracao.click();
        inputApuracao.clear();
        inputApuracao.sendKeys(apuracao);
        inputApuracao.sendKeys(Keys.ENTER);
    }
}
