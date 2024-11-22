package com.bash.Common;

import java.util.Map;

import com.aventstack.extentreports.Status;
import com.bash.Common.OR.CommonClassOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class CommonClass extends CommonClassOR {

	private WebUtil gm;
	
	public CommonClass(WebUtil wd) {
		super(wd);
		this.gm=wd;		
	}
	
	public void userSignIn() {
		gm.clickButton(getSignInBT());
		gm.getExtTest().log(Status.INFO, "Sign button click successfully");
	}

	public void VarifySigninUserName(Map<String,String> maptestcaseData) {
		gm.VerifyInnerText(getSignInUsername(),maptestcaseData.get("Sign Username"));
	}
}
