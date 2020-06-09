package com.thiago.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;

public class PageGuruLoginSuccess extends CorePage<PageGuruLogin>{ 

	final String EXPECTED_TEXT = "Successfully Logged in...";
	
	public PageGuruLoginSuccess() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div/h3")
	private WebElement txtSuccess;

	public void validarSucessoAcesso() {
		assertEquals(txtSuccess.getText(), EXPECTED_TEXT);
	}
}
