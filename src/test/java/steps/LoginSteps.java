package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Quando("^preencho os dados de acesso$")
    public void preencherDadosLoginSenhaValidos() throws Throwable {
        String usuario = "US_FRONTAUTO";
        String senha = "frontauto2022";
        loginPage.preencherLogin(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarBotaoLogin();
    }

    @Quando("^acesso a tela de login$")
    public void acessarTelaLogin() throws Throwable {
        loginPage.validarCertificado();
    }

    @Quando("^informo os dados de login \"([^\"]*)\"$")
    public void preencherUsuario(String usuario) throws Throwable {

        loginPage.preencherLogin(usuario);

    }

    @Quando("^informo os dados de senha \"([^\"]*)\"$")
    public void preencherSenha(String senha) throws Throwable {

        loginPage.preencherSenha(senha);

    }

    @Quando("^selecionar o botão login$")
    public void clicarBotaoLogin() throws Throwable {
        loginPage.clicarBotaoLogin();
    }

    @Entao("^sou direcionado para pagina inicial$")
    public void validarLogin() throws Throwable {

        homePage.validarTelaHome();
    }

    @Entao("^recebo mensagem informando dados inválidos \"([^\"]*)\"$")
    public void validarMensagemDadosInvalidos(String mensagemErro) throws Throwable {
        loginPage.validarModalMensagemErro(mensagemErro);
    }

}
