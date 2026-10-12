import java.util.*;
// This is the main class that contains the menu and the main method to run the diary application
public class DiaryMain {
    // INSTANCE VARIABLES
    private Scanner scan = new Scanner(System.in);
    private int option;

    // DISPLAY MENU | Display the main menu options to the user
    public void displayMenu() {
        System.out.println("=========================");
        System.out.println("1. Enter a new diary page");
        System.out.println("2. View diary pages");
        System.out.println("3. Modify a diary page");
        System.out.println("4. Delete a diary page");
        System.out.println("5. Exit");
        System.out.println("=========================");
    }

    // MAIN METHOD | Entry point of the program
    public static void main(String[] args) {
        Diary diary = new Diary(new ArrayList<>());
        DiaryMain diaryMain = new DiaryMain();
        diaryMain.menuSelection(diary);
    }

    // MENU SELECTION | Call the appropriate method based on user input
    public void menuSelection(Diary diary) {
        // open menu selection
        while (true) {
            // select option
            displayMenu();
            System.out.print("Please select an option: ");
            option = scan.nextInt();
            scan.nextLine(); // consume newline

            // run option
            if (option == 1) {
                System.out.println("Option 1 Selected: Enter a new diary page");
                System.out.println("===========================================");
                diary.addEntry(scan); // Call method to add a new diary entry
            } else if (option == 2) {
                System.out.println("Option 2 Selected: View diary pages");
                System.out.println("=====================================");
                // Call method to view diary pages
            } else if (option == 3) {
                System.out.println("Option 3 Selected: Modify a diary page");
                System.out.println("========================================");
                // Call method to modify a diary page
            } else if (option == 4) {
                System.out.println("Option 4 Selected: Delete a diary page");
                System.out.println("=========================================");
                // Call method to delete a diary page
            } else if (option == 5) {
                System.out.println("Option 5 Selected: Exit");
                System.out.println("=========================");
                System.out.println("Exiting the diary application. Goodbye!");
                System.exit(0); // exit the program
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
