/**
 * 
 */
package customerexception;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author NANCY
 *
 */
public class CustomException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Account acc = new Account("Prateek Joshi",1001,10000);
		ArrayList<Account> account_List=new ArrayList<Account>();
		Account ob=new Account("Nancy", 123456789, 1000);
		account_List.add(ob);
		
	        Scanner sc = new Scanner(System.in);
	        String r;

	        do
	        {
	            System.out.println("Enter the amt to withdraw in multiples of 1000:");
	            double amt = sc.nextDouble();

	            try
	            {
	            amt = ob.withdraw(amt);
	            }
	            catch(InsufficientBalanceException e)
	            {
	                System.out.println(e);
	                break;
	            }
	            catch(ZeroBalanceException e)
				{
					System.out.println(e);
					break;
				}
	            
	            System.out.println("Do you wish to continue:(y/n):");
	             r =  sc.next();


	        }while(r.charAt(0)=='y'||r.charAt(0)=='Y');
	 
	        
	        sc.close();
	        System.out.println("program ends here..");
	}

}
