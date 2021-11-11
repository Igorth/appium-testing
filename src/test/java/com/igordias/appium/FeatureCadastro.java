package com.igordias.appium;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FeatureCadastro {

    @Test
    @DisplayName("When the user try to sign up with different passwords, then show me a error message 'Senhas não conferem'")
    public void can_not_register_users_with_passwords_that_do_not_match() throws MalformedURLException {
        AppiumDriverConfig driver = new AppiumDriverConfig();

        MobileElement botaoCadastro = (MobileElement)driver.driver.findElementById(
                "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        MobileElement campoNome = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        MobileElement campoSenha = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        campoNome.setValue("Igor");
        campoSenha.setValue("123");
        campoConfirmarSenha.setValue("456");

        MobileElement botaoConfirmarCadastro = (MobileElement)driver.driver.findElementById(
                "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaoConfirmarCadastro.click();

        MobileElement erro = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");

        assertEquals("Senhas não conferem", erro.getText());
    }
}
