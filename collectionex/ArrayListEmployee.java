/**
 * 
 */
package collectionex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NANCY
 *
 */
public class ArrayListEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> lst = new ArrayList<Employee>();  //generic-type
		
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		
		lst.add(e1);
		
        Employee e = new Employee(1,"Anubhav Sinha",15000,10);
        
        lst.add(e);
        
        lst.add(new Employee(3,"Sangeeta Shah",35000,10));
        lst.add(new Employee(2,"Raj Malhotra",25000,10));
        
        
        System.out.println(lst);
        
        System.out.println(lst.size());      
        
          System.out.println("calling contains method on ArrayList to search an Employee:");
		  boolean isPresent = lst.contains(new Employee(3,"Sangeeta Shah",35000,10));
		  System.out.println("Employee with empid 3 and name Sangeeta Shah is Present or not? = "+isPresent);
        
		 
	}

}
