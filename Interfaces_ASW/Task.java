/**
 * The task class represents a list of tasks that need to be completed, their priority level and status.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Interfaces
 * Spring 2023
 */

public class Task implements Priority, Comparable{
	
	/*
	 * The enum Status is used to show the progress of out task. a task can either be completed,
	 * in process, or not started
	 */
	public enum Status {NOT_STARTED,IN_PROCESS,COMPLETE}

	private String name;//name is used to name the task
	private int priority;//priority gives a priority to our task.
	private Status status;//the status works with the enum to give the status of our task.

	/*
	 * Constructor for the task class with parameters of name, status, and priority.
	 */
	
	public Task (String aName, Status aStatus, int aPriority) {
		name = aName;
		status = aStatus;
		priority = aPriority;
	}//end Task

	/*
	 * The compareTo method compares two tasks by looking at their priority.
	 * If the first task's priority is greater than the seconds, it returns 1.
	 * If the first task's priority is less than the seconds, it returns -1.
	 * If the priorities are the same, it returns 0.
	 */
	
	public int compareTo(Task task2) {
		if(this.priority>task2.priority) {
			return 1;
		}//end if
		else if(this.priority<task2.priority) {
			return -1;
		}//end else if
		else {
			return 0;
		}//end else
	}//end compareTo

	/**
	 * getter for name
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * setter for name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/**
	 * getter for priority
	 * @return the priority
	 */
	@Override
	public int getPriority() {
		return priority;
	}//end getPriority

	/**
	 * setter for priority
	 * @param priority the priority to set
	 */
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	/**
	 * getter for status
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}//end getStatus

	/**
	 * setter for status
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}//end setStatus

	@Override
	public int compareTo(RationalNumber r2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Process process2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * The toString method returns a string with the important information of our task.
	 * It prints the name, priority and status of the task.
	 */
	
	public String toString() {
		return ("Task: " + name + "\nPriority: " + priority + "\nStatus: " + status + "\n");
	}//end toString
}//end class
