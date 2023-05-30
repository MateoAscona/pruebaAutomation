package examples.pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class LoginPage {

    private By txt_user_name = By.cssSelector("#username");
    private By txt_user_password = By.cssSelector("#password");
    private By btn_login = By.cssSelector("#Login");

    private String url = "https://sancorsalud.my.salesforce.com/";

//    public By getTxt_user_name() {
//        return txt_user_name;
//    }
//
//    public By getTxt_user_password() {
//        return txt_user_password;
//    }
//
//    public By getBtn_login() {
//        return btn_login;
//    }
//
//    public String getUrl() {
//        return url;
//    }



}
