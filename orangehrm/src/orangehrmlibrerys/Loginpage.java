package orangehrmlibrerys;

import org.openqa.selenium.By;

import Utiles.AppUtiles;

public class Loginpage extends AppUtiles
{
	
	public void AdminLogin(String uname,String uid)
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(uid);
		driver.findElement(By.id("btnLogin")).click();
	
	}
public boolean isAdminModuledisplayed()
{
if (driver.findElement(By.linkText("Admin")).isDisplayed()) 

{
	return true ;
	
}else 
{
	return false;
	
}	
}
public void logout() 
{
driver.findElement(By.partialLinkText("Welcome")).click();
driver.findElement(By.linkText("Logout")).click();

}
public boolean isErrmsgdisplayed()
{

      String errmsg = 	driver.findElement(By.id("spanMessage")).getText();
	if (errmsg.toLowerCase().contains("invalid")) 
	{
		return true;
		
	}else {
		return false;
	}
	
}
public boolean isEmpModuleDisplyed()
{
	try {
		driver.findElement(By.linkText("Admin")).isDisplayed();
		return false;
	} catch (Exception e) {
		return true;
	}
}


}
