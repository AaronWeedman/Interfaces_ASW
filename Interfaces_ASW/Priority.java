/**
 * The priority interface is implemented by the Task and Process class.
 * It has empty body methods and includes constants
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Interfaces
 * Spring 2023
 */
public interface Priority {

	public void setPriority(int priority);

	public int getPriority();

	int MED_PRIORITY = 5;
	int MAX_PRIORITY = 10;
	int MIN_PRIORITY = 1;

}//end interface