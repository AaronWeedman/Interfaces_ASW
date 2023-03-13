/*
 * The Application class will test all of the methods and objects in our classes
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Interfaces
 * Spring 2023
 */
public class Application {
   
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(6, 8);//creates a rational number 6/8
        RationalNumber r2 = new RationalNumber(1, 3);//creates a rational number 1/3
        RationalNumber r3 = new RationalNumber(3, 4);//creates a rational number 3/4

        System.out.println("Comparing r1 and r2: " + r1.compareTo(r2) + "\n");//compares r1 and r2 using the compareTo method

        System.out.println("Comparing r1 and r3: " + r1.compareTo(r3) + "\n");//compares r1 and r3 using the compareTo method

        System.out.println("Comparing r2 and r1: " + r2.compareTo(r1) + "\n");//compares r2 and r3 using the compareTo method


       System.out.println("\n" + "Next part of project" + "\n");//prints "Next part of project"

       Task task1 = new Task("Walk the dog", Task.Status.COMPLETE, 9);//creates a task named "Walk the dog" that is complete with a priority level of 9
       Task task2 = new Task("Do home work", Task.Status.NOT_STARTED, 1);//creates a task named "Do home work" that is not started with a priority level of 1
       Task task3 = new Task("Clean the house", Task.Status.IN_PROCESS, 5);//creates a task named "clean the house" that is in process with a priority level of 5

       Process process1 = new Process("process 1", 3);//creates a process called "process 1" with a priority of 3.
       Process process2 = new Process("process 2", 8);//creates a process called "process 2" with a priority of 8.
       Process process3 = new Process("process 3", 6);//creates a process called "process 3" with a priority of 6.
       
      System.out.println("Tasks\n");//prints out "Tasks"
      System.out.println(task1.toString());//prints the toString method from the Task class. "Task: Walk the dog. Priority: 9. Status: COMPLETE"
      System.out.println(task2.toString());//prints the toString method from the Task class. "Task: Task: Do home work. Priority: 1. Status: NOT_STARTED"
      System.out.println(task3.toString());//prints the toString method from the Task class. "Task: Task: Clean the house. Priority: 5. Status: IN_PROCESS"

      System.out.println("Comparing task 1 and 2: " + task1.compareTo(task2)+ "\n");//compares task1 and task2 by using the compareTo method in the Task class. Outputs 1.
      System.out.println("Comparing task 1 and 3: " + task1.compareTo(task3)+ "\n");//compares task1 and task3 by using the compareTo method in the Task class. Outputs 1.
      System.out.println("Comparing task 2 and 3: " + task2.compareTo(task3)+ "\n");//compares task2 and task3 by using the compareTo method in the Task class. Outputs -1.
      
      System.out.println("Processes\n");//prints "Processes"
      System.out.println(process1.toString());//prints the toString method from the Process class. "Process: process 1. Priority: 3"
      System.out.println(process2.toString());//prints the toString method from the Process class. "Process: process 2. Priority: 8"
      System.out.println(process3.toString());//prints the toString method from the Process class. "Process: process 3. Priority: 6"
      
      System.out.println("Comparing process 1 and 2: " + process1.compareTo(process2)+ "\n");//compares process1 and process by using the compareTo method in the Process class. Outputs -1.
      System.out.println("Comparing process 1 and 3: " + process1.compareTo(process3)+ "\n");//compares process1 and process3 by using the compareTo method in the Process class. Outputs -1.
      System.out.println("Comparing process 2 and 3: " + process2.compareTo(process3)+ "\n");//compares process2 and process3 by using the compareTo method in the Process class. Outputs 1.
     
    }//end main
}//end class