package OrangeHRMTestCases;

import Utiles.AppUtiles;
import orangehrmlibrerys.Loginpage;
import orangehrmlibrerys.NewEmploye;

public class EmployeeRegistationtest 
{

	public static void main(String[] args) {
		AppUtiles.LaunchApp("http://Orangehrm.qedgetech.com");
		
		Loginpage lp = new Loginpage();
		lp.AdminLogin("Admin", "Qedge123!@#");
		
		NewEmploye emp = new NewEmploye();
	boolean res= 	emp.addEmployee("prakash9849","Qedge123!@#");
		
		if (res) {
			System.out.println("Employee Registaion Test Pass");
		}else {
			System.out.println("Employee Registation Test Fail");
		}
		
		lp.logout();
		AppUtiles.closeapp();
		
	}
	
	  }


