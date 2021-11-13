package com.igordias.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPageObject {

    private AppiumDriver driver;
    private MobileElement botaoCadastro;

    public LoginPageObject(AppiumDriver driver) {
        this.driver = driver;
    }
    public void BuscarElementos() {
        botaoCadastro = (MobileElement)driver.findElementById(
                "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
    }

    public CadastroPageObject IrParaTelaDeCadastro() {
        botaoCadastro.click();
        return new CadastroPageObject(this.driver);
    }
}
