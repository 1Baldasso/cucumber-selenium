package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o ecommerce")
    public void acessarEcommerce(){
        String ecommerceUrl = "https://automationexercise.com/products";
        TestRule.abrirNavegador(ecommerceUrl);
    }

}
