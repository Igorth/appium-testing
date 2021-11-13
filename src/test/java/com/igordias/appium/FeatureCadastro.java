package com.igordias.appium;

import com.igordias.appium.PageObjects.CadastroPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FeatureCadastro {

    @Test
    @DisplayName("When the user try to sign up with different passwords, then show me a error message 'Senhas não conferem'")
    public void can_not_register_users_with_passwords_that_do_not_match() {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

        MobileElement botaoCadastro = (MobileElement)driver.findElementById(
                "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        CadastroPageObject telaCadastro = new CadastroPageObject(driver);
        telaCadastro.BuscarElementos();
        telaCadastro.Cadastrar("Igor", "123", "456");
        assertEquals("Senhas não conferem", telaCadastro.MensagemErro());

        driver.navigate().back();
    }

    @Test
    @DisplayName("When the user try to sign up with equals passwords, then the user is redirect to the home page")
    public void register_users_with_matching_passwords() throws NoSuchElementException {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

        MobileElement botaoCadastro = (MobileElement)driver.findElementById(
                "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        CadastroPageObject telaCadastro = new CadastroPageObject(driver);
        telaCadastro.BuscarElementos();
        telaCadastro.Cadastrar("Igor","123","123");

        MobileElement botaoLogar = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");
    }
}
