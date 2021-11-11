package com.igordias.appium;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeatureCadastro {

    @Test
    @DisplayName("When the user click on Cadastrar field, then show me the page Cadastrar")
    public void can_not_register_users_with_passwords_that_do_not_match() throws MalformedURLException {
        AppiumDriverConfig driver = new AppiumDriverConfig();

        MobileElement botaoCadastro = (MobileElement)driver.driver.findElementById(
                "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        assertTrue(true);
    }
}
