package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.CommonPage;

public class HomeElementMap extends CommonPage {

    @FindBy(how = How.XPATH, using = "//span[@data-sap-ui='meAreaHeaderButton']")
    public WebElement transacao;

    @FindBy(how = How.XPATH, using = "//span[@id='ToolbarOkCode-r']/input")
    public WebElement  inputTransacao;

    @FindBy(how = How.XPATH, using = "//table[@id='M1:46:1::0:21-r']/tbody/tr/td/input")
    public WebElement  inputApuracao;

    @FindBy(how = How.XPATH, using = "//div[@id='webguiPopupWindow1-ttltxt']")
    public WebElement  modal;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Efetuar logoff')]")
    public WebElement logof;

    @FindBy(how = How.ID, using = "__item0-anchorNavigationBar-2-inner")
    public WebElement menuICMS;

    @FindBy(how = How.XPATH, using = " //*[@id='__tile20-title-inner']")
    protected WebElement selectItemICMS;

}
