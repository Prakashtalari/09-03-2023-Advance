package OrangeHRMTestCases;

import Utiles.AppUtiles;
import orangehrmlibrerys.Loginpage;

public class AdminLoginWithInvalidData {

	public static void main(String[] args) {
		AppUtiles.LaunchApp("http://Orangehrm.qedgetech.com");
		
		Loginpage lp = new Loginpage();
		lp.AdminLogin("abc", "xys");
	boolean res = 	lp.isErrmsgdisplayed();
	if (res) {
		System.out.println("system is displayed appropriate error message for invalid logn, test  pass ");
		
	}else {
		System.out.println("system not displayed appropriate error message for invalid logn, test  fail");
	}	
				
 AppUtiles.closeapp();
  
	}

}
