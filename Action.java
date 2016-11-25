package arsFramework;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {

	public  String xpth,inp;
	public WebDriver driver;
	public WebElement el;
	
	
	
	public Action(WebDriver driver){
		this.driver=driver;
	}
	

	public  void clickMethod(String xpth){
		
		
		this.xpth="\"xpth\"";
		
		for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			if(SeeElement.checkElement(el)){
				el.click();
	        	System.out.println("Link for  is Clicked");
	        	break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not present");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);}
			}
		
	}
	
	
	
	public void inputMethod(String xpth, String inp){
				
		this.xpth="\"xpth\"";
		this.inp=inp;
		//Date date = new Date();
		//String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date); 
		System.out.println(inp);
		System.out.println(xpth);
		
		for(int i=0;i<10;i++){
			try{
				System.out.println("Finding username box");
			el = driver.findElement(By.xpath(xpth));
			System.out.println("web element defined");
			if(SeeElement.checkElement(el)){
				el.clear();
				//el.sendKeys(inp+"-"+datetime);
				el.sendKeys(inp);
	        	System.out.println("Input is given");
	        	break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not present");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please"+e.getMessage());
				waiting.pleaseWait(1);}
			}
		
	
			
	}
	
	
	public  boolean enabled(String xpth, String step){
		
		
		this.xpth="\"xpth\"";
		
		//for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			
			if(SeeElement.checkElement(el)){
				if(el.isEnabled()){return true;}
				else{System.out.println("Error: button is not enabled");
				return false;}
	        	//System.out.println("Link for  is Enabled");
	        	//break;
	        }
			else{System.out.println("ERROR: The web element is not Displayed yet..else");
			return false;}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not enabled");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;}
			//}
		
	}
	
	
	public  void displayedMethod(String xpth){
		
		
		this.xpth="\"xpth\"";
		
		//for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			if(SeeElement.checkElement(el)){
				el.isDisplayed();
	        	System.out.println("Link for  is Displayed");
	        	//break;
	        }
				else{System.out.println("The web element is not Displayed yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not Displayed");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);}
			}
		
	//}
	
	
public  boolean click(String xpth, String step){
		
		
		this.xpth="\"xpth\"";
		
		//for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			if(SeeElement.checkElement1(el)){
				el.click();
	        	//System.out.println(step + " done! ");
				
	        	//break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;
							}
			catch(Exception e){
				System.out.println("********General Exception: "+ step);
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;}
			//}
		
			return true;
		
		
		
	}
	
	
public boolean input(String xpth, String inp, String step){
	
	this.xpth="\"xpth\"";
	this.inp=inp;
	//Date date = new Date();
	//String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date); 
	//System.out.println(inp);
	//System.out.println(xpth);
	
	//for(int i=0;i<10;i++){
		try{
			//System.out.println("Finding username box");
		el = driver.findElement(By.xpath(xpth));
		//System.out.println("web element defined");
		if(SeeElement.checkElement1(el)){
			el.clear();
			//el.sendKeys(inp+"-"+datetime);
			el.sendKeys(inp);
        	//System.out.println("Input is given");
        	//break;
        }
			else{System.out.println("The web element is not present yet..else");}
		}
		
		catch(NoSuchElementException ne){
			System.out.println("ERROR: *********************************************************************WebElement " +step+ "  is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;						
			}
		
		
		catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please"+e.getMessage());
			waiting.pleaseWait(1);
			return false;
			}
		//}
	
return true;
		
}

public boolean displayed(String xpth, String step){
	this.xpth="\"xpth\"";
	//try{
		el = driver.findElement(By.xpath(xpth));
		if(SeeElement.checkElement1(el)){
			//el.isDisplayed();
			return true;
		}
		else{
			System.out.println("Element is not displayed");
			return false;
		}
	//}
	/*
	catch(NoSuchElementException ne){
		System.out.println("ERROR: *********************************************************************WebElement " +step+ "  is not present");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		return false;						
		}
	
	
	catch(Exception e){
		System.out.println("********General Exception");
		System.out.println("***Wait for few sec please"+e.getMessage());
		waiting.pleaseWait(1);
		return false;
		}
	*/
	
	//return true;

}



public String getText(String xpth, String step){
	this.xpth="\"xpth\"";
	String text="";
	try{
		el = driver.findElement(By.xpath(xpth));
		if(SeeElement.checkElement1(el)){text = el.getText();}
		else{text = "";}
		
		
		
	}
	catch(NoSuchElementException ne){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		text = "";						
		}
	
	
	catch(Exception e){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed"+":  General Exception");
		System.out.println("***Wait for few sec please"+e.getMessage());
		waiting.pleaseWait(1);
		text = "";
		}
	
	return text;
}


public  boolean click1(String xpth, String step){
	
	
	this.xpth="\"xpth\"";
	
	//for(int i=0;i<10;i++){
		try{			
		el = driver.findElement(By.xpath(xpth));
		
		}

		catch(NoSuchElementException ne){
			System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;
						}
		catch(Exception e){
			System.out.println("********General Exception: "+ step);
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;}
		
		if(SeeElement.checkElement1(el)){
			el.click();
        	//System.out.println(step + " done! ");
			
        	//break;
			return true;
        }
		else{return false;}
		
			
			//return false;
		
		
		
		//}
	
		
	
	
	
}













	
	
	
//end of class	
}
