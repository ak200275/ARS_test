package arsFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */

/**
 * @author Anuj.Singh
 *The objective of this class it to test log in to ARS application with or without repository needs be selected
 */
public class ars_logIn {

	
  WebDriver driver;
	
	String UserName, PassWord, Repository, rep1, rep, rep2;
  	public ars_logIn(WebDriver driver)
  	{
		this.driver = driver;
		
	}
	
	
	
	
  	public	void loginWithoutRepository(String username, String password){
		
		//System.out.println("Inside Method");

		this.UserName= username;
		this.PassWord= password;
		
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
        //System.out.println("provided inputs for admin");
        driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
        //System.out.println("provided inputs for password");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath(".//button[@ng-bind='loginCtrl.textLocalizeSignIn']")).click();
        //System.out.println("logging in");
				
	}
	
	
	
public void loginWithRepository(String repository, String username, String password){
	//System.out.println("Inside method of login class");	
	rep1=".//li[.='";
	rep = repository;
	rep2 = "']";

	repository = rep1+rep+rep2;
	System.out.println(repository);
	
	this.UserName= username;
	this.PassWord= password;
	this.Repository= repository;

		//System.out.println(repository+"  "+username+"   "+password);
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
        //System.out.println("provided inputs for admin");
        driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
        //System.out.println("provided inputs for password");
        //System.out.println("Need to choose repository");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath(".//span[@class='k-icon k-i-arrow-s' and .='select']")).click();
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath(Repository)).click();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath(".//button[@ng-bind='loginCtrl.textLocalizeSignIn']")).click();
        //System.out.println("logging in");
	}




public void logIn(String repository, String username, String password)
{
	 
	this.UserName= username;
	this.PassWord= password;
	this.Repository= repository;
	
	if(driver.findElement(By.xpath(".//*[@class='k-icon k-i-arrow-s']")).isDisplayed())
     {
     	//System.out.println("Need to discover repository");
     	//System.out.println("need to call method from other class that is logIn");
     	//ars_logIn loginPage = new ars_logIn(driver);
     	//System.out.println("object created");
			//loginPage.loginWithRepository(repository, username, password);
     	loginWithRepository(repository, username, password);
			//System.out.println("after the class object accessed with method");
			
     	
	}
     else {
     	//System.out.println("Need not to choose repository");
     			
     			//ars_logIn loginPage = new ars_logIn(driver);
             	//System.out.println("object created");
     			//loginPage.loginWithoutRepository(username, password);
             	loginWithoutRepository(username, password);
     			//System.out.println("after the class object accessed with method");
     					
     
     }
	
	
	
}
	
	
	
}
