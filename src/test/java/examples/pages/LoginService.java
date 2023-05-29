package examples.pages;

import examples.config.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginService {

    private LoginPage loginPage;

    public LoginService(){
        this.loginPage = new LoginPage();
    }

    public void goToPage(){
        DriverManager.getDriver().get(loginPage.getUrl());
    }

    public void ingresar_user_name(String user_name){
        DriverManager.getDriver().findElement(
                this.loginPage.getTxt_user_name()).sendKeys(user_name);
    }
    public void ingresar_user_password(String user_password){
        // Implementando esperas
        WebElement txt_userPassword = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(this.loginPage.getTxt_user_password())
        );

        DriverManager.ingresarTexto(txt_userPassword, user_password);

        // DriverManager.getDriver().findElement(this.loginPage.getTxt_user_password()).sendKeys(user_password);
    }
    public void clicl_login(){
        DriverManager.getDriver().findElement(this.loginPage.getBtn_login()).click();
    }

    public void iniciar_sesion(String userName, String user_password){
        DriverManager.getDriver().findElement(this.loginPage.getTxt_user_name()).sendKeys(userName);
        DriverManager.getDriver().findElement(this.loginPage.getTxt_user_password()).sendKeys(user_password);
        DriverManager.getDriver().findElement(this.loginPage.getBtn_login()).click();
    }
}
