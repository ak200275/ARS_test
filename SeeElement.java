/**
 * 
 */
package arsFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

/**
 * @author Anuj.Singh
 *
 */
public class SeeElement {
	
	public static boolean checkElement(WebElement element){
		
		try{
		return element.isDisplayed();
		}
		catch(NoSuchElementException e){
			System.out.println("No Such Element Exception in checkElement method exists ");
			return false;
		}
		 
		catch(Exception e1){
			System.out.println("General Exception in checkElement method exists ");
			return false;
		}
		
			
	}
	
	
	public static boolean checkElement1(WebElement element){
		
		  FluentWait<WebElement> wait = new FluentWait<WebElement>(element)
                  .withTimeout(20, TimeUnit.SECONDS)
                  .pollingEvery(500, TimeUnit.MILLISECONDS)
                  .ignoring(NoSuchElementException.class);

             Function<WebElement, Boolean> f = new Function<WebElement, Boolean>() {
              @Override
              public Boolean apply(WebElement element) {
              if(!element.isDisplayed()){ 
                  return false;  
              }         
              else{return true;}
              }
            };

		 return wait.until(f);
		
	}


	public static WebElement checkElement2(WebDriver driver, String xpth){
		
		
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
        fWait.withTimeout(20, TimeUnit.SECONDS);
        fWait.pollingEvery(1, TimeUnit.SECONDS);
        fWait.ignoring(NoSuchElementException.class);
         return fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpth)));

		
	}

}
