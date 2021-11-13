package com.igordias.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CadastroPageObject {

    private AppiumDriver driver;
    private MobileElement campoNome;
    private MobileElement campoSenha;
    private MobileElement campoConfirmarSenha;
    private MobileElement botaoCadastrar;

    public CadastroPageObject(AppiumDriver driver){
        this.driver = driver;
    }

    public void BuscarElementos() {
        campoNome = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        campoSenha = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        campoConfirmarSenha = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        botaoCadastrar = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
    }

    public void PreencherFormulario(String usario, String senha, String confirmarSenha) {
        campoNome.setValue(usario);
        campoSenha.setValue(senha);
        campoConfirmarSenha.setValue(confirmarSenha);
    }

    public void Cadastrar() {
        botaoCadastrar.click();
    }
}
