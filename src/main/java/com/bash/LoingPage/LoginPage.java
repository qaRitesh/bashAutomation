package com.bash.LoingPage;

import java.util.Map;

import com.aventstack.extentreports.Status;
import com.bash.LoingPage.OR.LoginPageOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class LoginPage extends LoginPageOR {

	private WebUtil gm;
	
	public LoginPage(WebUtil wd) {
		super(wd);
		this.gm=wd;
	}

	public void googleBT() {
		gm.clickButton(getGoogleBT());
		gm.getExtTest().log(Status.INFO, "Google Options Button Click Successfully");
	}
	
	public void faceBookBT() {
		gm.clickButton(getFacebookBT());
		gm.getExtTest().log(Status.INFO, "FaceBook Options Button Click Successfully");
	}
	
	public void appleBT() {
		gm.clickButton(getFacebookBT());
		gm.getExtTest().log(Status.INFO, "Apple Options Button Click Successfully");
	}
	
	public void validLoginDeatils(Map<String,String> testCaseDataMap) {
		gm.inputData(getEmailORPhoneNumber(),testCaseDataMap.get("UserNameID"));
		gm.inputData(getPassword(),testCaseDataMap.get("Password"));
		gm.clickButton(getSignInBT());
	}
}
