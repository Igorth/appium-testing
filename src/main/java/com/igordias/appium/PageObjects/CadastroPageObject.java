package com.igordias.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPageObject extends PageObjectBase {

    private MobileElement campoNome;
    private MobileElement campoSenha;
    private MobileElement campoConfirmarSenha;
    private MobileElement botaoCadastrar;
    private MobileElement mensagemErro;

    private final By errorId;
    private final By campoNomeID;
    private final By campoSenhaID;
    private final By campoConfirmarSenhaID;
    private final By botaoCadastrarID;

    protected CadastroPageObject(AppiumDriver driver) {
        super(driver);
        errorId = By.id("br.com.alura.aluraesporte:id/erro_cadastro");
        campoNomeID = By.id("br.com.alura.aluraesporte:id/input_nome");
        campoSenhaID = By.id("br.com.alura.aluraesporte:id/input_senha");
        campoConfirmarSenhaID = By.id("br.com.alura.aluraesporte:id/input_confirmar_senha");
        botaoCadastrarID = By.id("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
    }

    @Override
    public void BuscarElementos() {
        campoNome = (MobileElement)driver.findElement(campoNomeID);
        campoSenha = (MobileElement)driver.findElement(campoSenhaID);
        campoConfirmarSenha = (MobileElement)driver.findElement(campoConfirmarSenhaID);
        botaoCadastrar = (MobileElement)driver.findElement(botaoCadastrarID);
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
        WebDriverWait espera = new WebDriverWait(driver, 3);
        espera.until(ExpectedConditions.presenceOfElementLocated(errorId));
        mensagemErro = (MobileElement)driver.findElement(errorId);
        return mensagemErro.getText();
    }
}
