/**
 * The Process class represents a process and its priority level
 *
 * @author Aaron Weedman
 * @version 1.0
 * Interfaces
 * Spring 2023
 */
public class Process implements Priority, Comparable{

	private String processID;//the name of the process
	private int priority;//the priority level

	/*
	 * This is a constructor for the Process class with parameters of processID and Priority.
	 */
	public Process(String aProcessID, int aPriority) {
		processID = aProcessID;
		priority = aPriority;
	}//end Process

	/**
	 * getter for processID
	 * @return the processID
	 */
	public String getProcessID() {
		return processID;
	}//end getProcessID

	/**
	 * setter for processID
	 * @param processID the processID to set
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end set ProcessID

	/**
	 * getter for priority
	 * @return the priority
	 */
	
	public int getPriority() {
		return priority;
	}//end getPriority


	/**
	 * setter for priority
	 * @param priority the priority to set
	 */
	
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	/*
	 * The compareTo method compares two processes by looking at their priority.
	 * If the first process' priority is greater than the seconds, it returns 1.
	 * If the first process' priority is less than the seconds, it returns -1.
	 * If the priorities are the same, it returns 0.
	 */
	
	public int compareTo(Process process2) {
		if(this.priority>process2.priority) {
		return 1;	
		}//end if
		else if(this.priority<process2.priority) {
			return -1;
		}//end else if
		else {
			return 0;
		}//end else
	}//end compareTo
	
	/*
	 * The toString method prints the processId and the priority level associated with it.
	 */
	public String toString() {
		return ("Process: " + processID + "\nPriority: " + priority + "\n");
	}//end toString

	@Override
	public int compareTo(RationalNumber r2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Task task2) {
		// TODO Auto-generated method stub
		return 0;
	}

}//end class