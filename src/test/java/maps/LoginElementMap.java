package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.CommonPage;

public class LoginElementMap extends CommonPage {

    @FindBy(how = How.ID, using = "details-button")
    protected WebElement detailsButton;

    @FindBy(how = How.XPATH, using = "//span[@id='sap-user-r']/input")
    public WebElement inputEmail;

    @FindBy(how = How.XPATH, using = "//span[@id='sap-password-r']/input")
    public WebElement inputPassw;

    @FindBy(how = How.ID, using = "proceed-link")
    public  WebElement linkSeguro;

    @FindBy(how = How.XPATH, using = "//form[@id='formLogin']/div/div/div/input[@name='Email']")
    public WebElement button;

    @FindBy(how = How.XPATH, using = "//*[@id='dropdown-logged']")
    public WebElement userLogad;

    @FindBy(how = How.ID, using = "LOGON_BUTTON")
    public WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = "//span[@id='m1-txt']")
    public WebElement msgmError;
}
