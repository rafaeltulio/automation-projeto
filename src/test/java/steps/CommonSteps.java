package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("^o usuário acessar a url da aplicação sap$")
    public void acessarUrlSAP() {
        String urlSapGuepardo = "https://fhsrv020.fh.com.br:8443/sap/bc/gui/sap/its/webgui/?sap-client=910&sap-language=PT";
        TestRule.abrirNavegador(urlSapGuepardo);
    }

}
