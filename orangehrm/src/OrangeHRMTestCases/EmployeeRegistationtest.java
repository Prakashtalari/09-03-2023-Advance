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
		  boolean res=  emp.addEmployee("prakash9849", "demo");
           if (res)
           {
			System.out.println("Employee Registion Test Pass");
		    }else 
		    {
			System.out.println("Employee Registation Test Fail");
		     }
		     
		     AppUtiles.closeapp();
		     lp.logout();
	    }
	  }


