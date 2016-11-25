/**
 * 
 */
package arsFramework;

/**
 * @author Anuj.Singh
 *
 */
public class waiting {
	
	
	public static void pleaseWait(int n){
		int m = n*1000;
		try{
			Thread.sleep(m);
		}
		catch(Exception e){System.out.println("Something wrong in while waiting for elelment");}
		
	}
	
	

}
