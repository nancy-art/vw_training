/**
 * 
 */
package collectionex;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author NANCY
 *
 */
public class TreeSetEmpEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Employee> sst = new TreeSet<Employee>();

		Employee e1 = new Employee(2, "Raj Malhotra", 25000, 10);

		sst.add(e1);

		Employee e = new Employee(1, "Anubhav Sinha", 15000, 10);

		sst.add(e);

		sst.add(new Employee(6, "Sangeeta Shah", 35000, 20));
		sst.add(new Employee(2, "Raj Malhotra", 25000, 10)); // duplicate

		System.out.println(sst);

		sst.add(new Employee(4, "Amit Shah", 45000, 20));

		System.out.println(sst);

		System.out.println(sst.size());

		System.out.println(sst.contains(new Employee(6, "Sangeeta Shah", 35000, 20)));
	}
}
