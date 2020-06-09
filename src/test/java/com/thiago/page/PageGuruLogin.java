package com.thiago.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;

public class PageGuruLogin extends CorePage<PageGuruLogin> {

	public PageGuruLogin() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "email")
	private WebElement inputEmail;
	
	@FindBy(name = "password")
	private WebElement inputPassword;
	
	@FindBy(xpath = "")
	private WebElement successText;
	
	@FindBy(xpath = "")
	private WebElement btnLogin;
	
	public void acessarNoGuru(String email, String password) {
		preencherCampo(inputEmail,"barba@gmail.com");
		preencherCampo(inputPassword, "teste123");
		click(btnLogin);
	}
	
}
