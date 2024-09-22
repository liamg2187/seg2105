package exercise2;

import exercise2.UI.CommandLineUI;
import exercise2.backend.UniversityManagementSystem;
import exercise2.dataStorage.MemoryDataStore;
import exercise2.util.InvalidUserInputException;

/**
 * The Main class is the entry point for the university management system application.
 * It initializes the CommandLineUI to start accepting user input, initiates the UniversityManagementSystem, and creates the data store.
 * 
 * @author Hussein Al Osman
 */
public class Main {

	/**
	 * The main method to run the university management system application.
	 * 
	 */
    public static void main(String[] args) {

        CommandLineUI ui = new CommandLineUI();
        
        MemoryDataStore store = new MemoryDataStore();
        UniversityManagementSystem system = new UniversityManagementSystem(ui, store);
        
        ui.setUniversityManagementSystem(system);
        
        
        try {
			ui.acceptInput();
		} catch (InvalidUserInputException e) {

			System.out.println(e);
		}
    }
}
