/**
 * 
 */
package arsFramework;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ARS_Pages.ars_logIn;
import ARS_Pages.waiting;

/**
 * @author Anuj.Singh
 *
 */
public class login {

	public static String repository;
    public static String username;
    public static String password;	      
    public static String url;
	
	
	
	public static WebDriver newLogin(){
		
		
	    
	    
	    Date myTime = new Date();
	    System.out.println(myTime);
	    //WebDriver driver=null;
	    WebDriver driver = new FirefoxDriver();
	    driver.get(url);
	   
	    //WebDriver driver;
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    //System.out.println("Page not Maximized");
	    	   
	    	// Log - in page     	   
	    	   
	    	   //System.out.println("This is Smoke Test just to check login and the links on the subsequent page");
	    	   
	    	   //System.out.println("Testing url is : " + url);
	                      
	                      //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	                     
	                      //driver.get(url);
	                      String actual = driver.getTitle();
	                      //System.out.println(actual);
	                    
	                      //System.out.println(myTime);
	                     


	// 

	try{

	//System.out.println("test Case: Log in with correct password");
	                      for(int i=0; i<5;i++){
	                    	  
	                    	  try{
	                                     //System.out.println(i);
	                                     //System.out.println("Are Text boxes present?.......");
	                      if (driver.findElement(By.id("txtPassword")).isDisplayed())
	                      {
	                    	  //System.out.println("Yes Text boxes present!!.......");
	                    	  ars_logIn loginPage = new ars_logIn(driver);
	                      	  //System.out.println("object created");
	                      	  loginPage.logIn(repository, username, password);
	                    	  break;
	                      }
	                      else {
	                    	  			//System.out.println("Text boxes Not yet available");           
	                    	  			//System.out.println("waiting");
	                    	  waiting.pleaseWait(7);
	                      }
	                      }
	              			catch(NoSuchElementException ne){
	        					//System.out.println("*********************************************************************No They are not present yet");
	        					//System.out.println("***Wait for few sec please");
	        					waiting.pleaseWait(7);
	        											}
	        			catch(Exception e){
	        					//System.out.println("********General Exception");
	        					//System.out.println("***Wait for few sec please");
	        					waiting.pleaseWait(7);
	        								}
	                      }
	                                     
	                      //System.out.println("LOADING another Page");
	                      
	                      for(int i=0;i<6;i++){
	                    	  
	                    	  try{
	                                     //System.out.println(i);
	                                     //System.out.println("ARS PAGE LOADING");
	                                     //System.out.println("Checking if page is loaded successfully");
	                                     
	                                     if (driver.findElement(By.xpath(".//*[.='Legal Notices']")).isDisplayed())
	                                     	{
	                                     
	                                    	 	//System.out.println("LOGGING SUCCESSFUL");
	                                    	 	//System.out.println("Test Case Log In Passed");
	                                    	 	//System.out.println("-----------------------------------------------------------------");
	                                    	 	//System.out.println(myTime);
	                                  
	                                    	 	break;    
	                                     	}
	                                     else
	                                     	{
	                                    	 	System.out.println("Waiting...");
	                                    	 	waiting.pleaseWait(7);
	                                     	}
	                                     
	                                     //System.out.println("-------------------------Moved to Home page After Log In-------------------");
	                                     //System.out.println(myTime);

	                                     //try {
	                         				//Thread.sleep(10000);
	                         			//} catch (InterruptedException e) {
	                         				// TODO Auto-generated catch block
	                         				//e.printStackTrace();
	                         			//}
	                                                                     
	                      } 
	                			catch(NoSuchElementException ne){
	            					//System.out.println("********************************************************************page is NOT loaded successfully");
	            					//System.out.println("***Wait for few sec please");
	            					waiting.pleaseWait(7);
	            											}
	            			catch(Exception e){
	            					//System.out.println("********General Exception");
	            					//System.out.println("***Wait for few sec please");
	            					waiting.pleaseWait(7);
	            								}  
	                      }
	                      
	                      waiting.pleaseWait(5);
	                      //System.out.println(url+"  After 10 sec");
	                      
	                      
	}
	catch(Exception e){
	       //System.out.println("**********************************************************************************************TestCase 1 Failed");
	}
		
		
		return driver;
		
		
		
	}
	
	
	
	
	
}
