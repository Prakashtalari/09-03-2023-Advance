package OrangeHRMTestCases;

import Utiles.AppUtiles;
import orangehrmlibrerys.Loginpage;
import orangehrmlibrerys.User;

public class UserRegistationtestcase {

	public static void main(String[] args) throws InterruptedException {

		
		AppUtiles.LaunchApp("http://Orangehrm.qedgetech.com");
		
		Loginpage lp = new Loginpage();
		lp.AdminLogin("Admin", "Qedge123!@#");
		
		User us = new User();
	boolean res=	us.adduser("ESS", "prakash9849 Demo", "prakash1234", "Qedge123!@#");
		
	if (res) {
		
	System.out.println("New User Registered Succesfully ,Test Pass");
	}else {
		System.out.println("New User Registered Test Fail");
	}	
	lp.logout();
	AppUtiles.closeapp();
	
		
		

	}

}
