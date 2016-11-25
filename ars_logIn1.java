
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
public class ars_logIn1 {

	
  WebDriver driver;
	
	String UserName, PassWord, Repository, rep1, rep, rep2;
  	public ars_logIn1(WebDriver driver)
  	{
		this.driver = driver;
		
	}
	
	
	
	
  	public	void loginWithoutRepository(String username, String password){
		
		

		this.UserName= username;
		this.PassWord= password;
		
		//driver.findElement(By.id("txtUserName")).sendKeys(UserName);
        //driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
        //driver.findElement(By.xpath(".//button[@ng-bind='loginCtrl.textLocalizeSignIn']")).click();
		
		
		
        //  xpath for user name:       .//*[@id='txtUserName']        
        //  xpath for password :     .//*[@id='txtPassword'] 
        
        
        Action ac = new Action(driver);
        
        String step = "Provide User name";
        String xpth = ".//*[@id='txtUserName']";
        String inp = UserName;
        if(ac.input(xpth, inp, step)){System.out.println(step+"    : Done");}
        else{System.out.println(step+"    : Failed");
        return;}

        step = "Provide Password";
        xpth = ".//*[@id='txtPassword']";
        inp = PassWord;
        if(ac.input(xpth, inp, step)){System.out.println(step+"    : Done");}
        else{System.out.println(step+"    : Failed");
        return;}
        
        step = "Hit Sign In button";
        xpth = ".//button[@ng-bind='loginCtrl.textLocalizeSignIn']";
        if(ac.click1(xpth, step)){System.out.println(step+"    : Done");}
        else{System.out.println(step+"    : Failed");
        return;}
				
	}
	
	
	
public void loginWithRepository(String repository, String username, String password){

	rep1=".//li[.='";
	rep = repository;
	rep2 = "']";

	repository = rep1+rep+rep2;
	System.out.println(repository);
	
	this.UserName= username;
	this.PassWord= password;
	this.Repository= repository;


		//driver.findElement(By.id("txtUserName")).sendKeys(UserName);
        //driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
	Action ac = new Action(driver);
    
    String step = "Provide User name";
    String xpth = ".//*[@id='txtUserName']";
    String inp = UserName;
    if(ac.input(xpth, inp, step)){System.out.println(step+"    : Done");}
    else{System.out.println(step+"    : Failed");
    return;}

    step = "Provide Password";
    xpth = ".//*[@id='txtPassword']";
    inp = PassWord;
    if(ac.input(xpth, inp, step)){System.out.println(step+"    : Done");}
    else{System.out.println(step+"    : Failed");
    return;}

       // driver.findElement(By.xpath(".//span[@class='k-icon k-i-arrow-s' and .='select']")).click();
       // driver.findElement(By.xpath(Repository)).click();     
       // driver.findElement(By.xpath(".//button[@ng-bind='loginCtrl.textLocalizeSignIn']")).click();
        
    step = "Hit dropdown button";
    xpth = ".//span[@class='k-icon k-i-arrow-s' and .='select']";
    if(ac.click1(xpth, step)){System.out.println(step+"    : Done");}
    else{System.out.println(step+"    : Failed");
    return;}
    
    
    step = "Select Repository";
    xpth = Repository;
    if(ac.click1(xpth, step)){System.out.println(step+"    : Done");}
    else{System.out.println(step+"    : Failed");
    return;}
    
    step = "Hit Sign In button";
    xpth = ".//button[@ng-bind='loginCtrl.textLocalizeSignIn']";
    if(ac.click1(xpth, step)){System.out.println(step+"    : Done");}
    else{System.out.println(step+"    : Failed");
    return;}
    
    
    
    
	}




public void logIn(String repository, String username, String password)
{
	 
	this.UserName= username;
	this.PassWord= password;
	this.Repository= repository;
	
	if(driver.findElement(By.xpath(".//*[@class='k-icon k-i-arrow-s']")).isDisplayed())
     {
     	
     	loginWithRepository(repository, username, password);
		
	}
     else {
     	
             	loginWithoutRepository(username, password);
     		
     }
	
	
	
}
	
	
	
}
