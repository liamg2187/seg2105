package exercise2.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Administrator class represents an administrative employee with specific tasks.
 * Extends the Employee class.
 * 
 * @autor Hussein Al Osman
 */
public class Administrator extends Employee{

	// List of tasks assigned to the administrator
	List<String> tasks;

	/**
	 * Adds a task to the list of tasks assigned to the administrator.
	 *
	 * @param task the task to be added
	 */
	public void addTask(String task) { tasks.add(task); }

	/**
	 * Retrieves the list of tasks assigned to the administrator as a formatted string.
	 *
	 * @return a formatted string of tasks
	 */
	private String getTasksList() {
		StringBuilder temp = new StringBuilder();
		for (String task : tasks) temp.append("\n\t\t").append(task);
		return temp.toString();
	}

	/**
	 * Returns a string representation of the administrator's information.
	 *
	 * @return a string containing the administrator's details
	 */
	public String toString() {
		return "Administrator information:\n"
				+ "\tFirst name: " + getFirstName() + "\n"
				+ "\tLast name: " + getLastName() + "\n"
				+ "\tEmployee ID: " + getId() + "\n"
				+ "\tSalary: " + getSalary() + "\n"
				+ "\tTasks: " + getTasksList() + "\n";
	}

	/**
	 * Constructs a new Administrator with the given details.
	 * 
	 * @param firstName the first name of the administrator
	 * @param lastName the last name of the administrator
	 * @param id the ID of the administrator
	 * @param salary the salary of the administrator
	 */
	public Administrator(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		tasks = new ArrayList<String>();
	}
	


}
