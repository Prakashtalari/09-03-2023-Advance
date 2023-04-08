package OrangeHRMTestCases;

import Utiles.AppUtiles;
import orangehrmlibrerys.Loginpage;

public class EmployeeLoginTest {

	public static void main(String[] args) {

		AppUtiles.LaunchApp("http://Orangehrm.qedgetech.com");
		
		Loginpage lp = new Loginpage();
	lp.AdminLogin("prakash123", "Qedge123!@#");
		 boolean res=   lp.isEmpModuleDisplyed();
		 if (res) {
			System.out.println("Employee Login Test Pass");
		}else {
			System.out.println("Employee Login Test Fail");
			
		}

	}

}
