package testScript;

import java.util.Map;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bash.Common.CommonClass;
import com.bash.LoingPage.LoginPage;
import com.tfg.bash.genericyCodes.DataUtile;
import com.tfg.bash.genericyCodes.WebUtil;

import bash.baseClass.BaseTest;



public class BashTS extends BaseTest{

private WebUtil gm=WebUtil.getObject();	
private CommonClass comm;
DataUtile database=new DataUtile();
	
@Test	
public void verifyBash001SearchProducts() throws InterruptedException {
	gm.getExtTest().log(Status.INFO, "verifyAM001SearchProducts TestScript started Successfully."); 
	comm = new CommonClass(gm);
	comm.userSignIn();
	LoginPage loginpage=new LoginPage(gm);
	Map<String,String>testCaseDataMap=database.getTestCaseData("Bash001", 2);
	loginpage.validLoginDeatils(testCaseDataMap);
	comm.VarifySigninUserName(testCaseDataMap);
	
	
	
	Thread.sleep(10000);
	
}
	
}
