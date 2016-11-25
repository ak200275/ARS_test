/**
 * 
 */
package arsFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Anuj.Singh
 *
 */
public class SearchResult {
	
	public  static List<WebElement> noofcol = null;
	public  static List<WebElement> cellvalues = null;
	public  static WebElement elem = null;
	public WebDriver driver;
	
	
	public SearchResult(WebDriver driver ){
		
		this.driver=driver;
				
	}
	
	public static void search(List<WebElement> cellvalues, List<WebElement> noofcol ){
		System.out.println("Total number of data values :  "+cellvalues.size());
		
		System.out.println("Total number of columns :  "+noofcol.size());
		
		
		
		for(int i=0;i<cellvalues.size(); i++){
			System.out.println("");
			for(int j=0;j<noofcol.size(); j++){
			//String txt = cellvalues.get(i).getText();
			String txt = cellvalues.get(i).getText();
			//System.out.print("value of i : "+i+" : "+txt+"             ");
			System.out.print("            "+txt+"             ");
			i=i+1;
			if(i>=cellvalues.size()){
				System.out.println("--------------EXITING--------------FOR LOOP--------------");
				break;}
			else{}
			}
			//System.out.println("Value of i Before correcting it is : " +i);      
			i=i-1;
			System.out.println("");
			//System.out.println("Value of i after correcting it is : " +i);
			System.out.println("");
		}
		
		System.out.println("--------------FINISH-----COMING OUT FROM---------EXTERNAL FOR LOOP--------------");
		
	}
	
	
	public static boolean search1(List<WebElement> cellvalues, List<WebElement> noofcol ){
		System.out.println("Total number of data values :  "+cellvalues.size());
		
		System.out.println("Total number of columns :  "+noofcol.size());
		
		
		
		for(int i=0;i<cellvalues.size(); i++){
			System.out.println("");
			for(int j=0;j<noofcol.size(); j++){
			//String txt = cellvalues.get(i).getText();
			String txt = cellvalues.get(i).getText();
			//System.out.print("value of i : "+i+" : "+txt+"             ");
			System.out.print("            "+txt+"             ");
			i=i+1;
			if(i>=cellvalues.size()){
				System.out.println("--------------EXITING--------------FOR LOOP--------------");
				break;}
			else{}
			}
			//System.out.println("Value of i Before correcting it is : " +i);      
			i=i-1;
			System.out.println("");
			//System.out.println("Value of i after correcting it is : " +i);
			System.out.println("");
		}
		
		System.out.println("--------------FINISH-----COMING OUT FROM---------EXTERNAL FOR LOOP--------------");
		return true;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* could not pass the element because we can not declare the web element before it is available.
	public void commonSearch(WebElement elem){
		
		
		for(int n=0;n<11;n++){
			
			
			try{	
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
		
		
		
		
		//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
for(int n=0;n<11;n++){
	
	
	try{	
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
		//select option
		//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Assets']

for(int n=0;n<11;n++){
	
	try{	
		//WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Assets']"));
        if(SeeElement.checkElement(elem)){
        	elem.click();
        	System.out.println("Link for "+elem.getText()+"  is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement "+elem.getText()+" is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement "+elem.getText()+" is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

	
		//keyintext *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
for(int n=0;n<11;n++){
	
	try{	
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

	
				//click SearchButton using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
			
for(int n=0;n<11;n++){
	
	try{	
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}


		
		
		
		
	}*/
	
	
	
	
	
	
	
	

}
