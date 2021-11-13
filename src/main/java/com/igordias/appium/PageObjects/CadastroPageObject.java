package com.igordias.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CadastroPageObject {

    private AppiumDriver driver;
    private MobileElement campoNome;
    private MobileElement campoSenha;
    private MobileElement campoConfirmarSenha;
    private MobileElement botaoCadastrar;
    private MobileElement mensagemErro;

    public CadastroPageObject(AppiumDriver driver){
        this.driver = driver;
    }

    public void BuscarElementos() {
        campoNome = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        campoSenha = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        campoConfirmarSenha = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        botaoCadastrar = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
    }

    private void PreencherFormulario(String usuario, String senha, String confirmarSenha) {
        campoNome.setValue(usuario);
        campoSenha.setValue(senha);
        campoConfirmarSenha.setValue(confirmarSenha);
    }

    public LoginPageObject Cadastrar(String usuario, String senha, String confirmarSenha) {
        PreencherFormulario(usuario, senha, confirmarSenha);
        botaoCadastrar.click();
        return new LoginPageObject(driver);
    }

    public String MensagemErro() {
        mensagemErro = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        return mensagemErro.getText();
    }
}
