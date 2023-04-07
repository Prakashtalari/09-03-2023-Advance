package OrangeHRMTestCases;

import Utiles.AppUtiles;
import orangehrmlibrerys.Loginpage;

public class AdminLoginTestWithValidData 
{

	public static void main(String[] args) 
	{
		AppUtiles.LaunchApp("http://orangehrm.qedgetech.com");
		
		Loginpage lp = new Loginpage();
		lp.AdminLogin("Admin", "Qedge123!@#");
		
	boolean res= lp.isAdminModuledisplayed();
		
	if (res) {
		System.out.println("Admin Login Test Pass");
		
	}else 
	{
		System.out.println("Admin Login Test Fail");
	}	
	
	 lp.logout();
     AppUtiles.closeapp();
   
	}
	
	

}
