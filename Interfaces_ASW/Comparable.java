/*
 * The comparable interface is implemented by RationalNumber, Task, and Process
 * and contains methods with empty bodies.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Interfaces
 * Spring 2023
 */


public interface Comparable{

	public int compareTo(RationalNumber r2);

	int compareTo(Task task2);
	
	int compareTo(Process process2);

}//end interface