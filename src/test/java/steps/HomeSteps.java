package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.HomePage;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Dado("^que estou na página home$")
    public void queEstouNaPáginaHome() {
        homePage.validarTelaHome();
    }

    @Quando("^informo a transação \"([^\"]*)\"$")
    public void preencherTransacao(String transacao) throws Throwable {
        homePage.preencherDadosTransacao(transacao);
    }

    @Quando("^informo o numero da apuração \"([^\"]*)\"$")
    public void preencherIdApuracao(String apuracao) throws Throwable {
        homePage.preencherIdApuracao(apuracao);
    }
}
