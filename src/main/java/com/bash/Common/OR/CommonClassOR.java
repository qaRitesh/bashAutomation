package com.bash.Common.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class CommonClassOR {

	public CommonClassOR(WebUtil wd) {
		PageFactory.initElements(wd.getDriver(), this);		
	}
	
	
	@FindBy(xpath ="//span[text()='Sign In']")
	private WebElement signInBT;
	
	@FindBy(xpath ="//span[text()='RK']")
	private WebElement signInUsername;
}
