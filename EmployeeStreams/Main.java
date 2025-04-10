/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Employee> listempDetails = new ArrayList<>();
		Employee e1 = new Employee("Zain",1);
		Employee e2 = new Employee("Mohamed",2);
		listempDetails.add(e1);
		listempDetails.add(e2);
		List<String> empDetails = listempDetails.stream().filter(f1 -> f1.empName.equals("Zain")).map(f1 -> f1.empName);
		empDetails.forEach(System.out::println);
	}
}