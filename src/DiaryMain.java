import java.util.*;
// This is the main class that contains the menu and the main method to run the diary application
public class DiaryMain {
    // INSTANCE VARIABLES
    Scanner scan = new Scanner(System.in);

    // DISPLAY MENU | Display the main menu options to the user
    public void displayMenu() {
        System.out.println("=========================");
        System.out.println("1. Enter a new diary page");
        System.out.println("2. View diary pages");
        System.out.println("3. Modify a diary page");
        System.out.println("4. Delete a diary page");
        System.out.println("5. Exit");
        System.out.println("=========================");
        System.out.print("Please select an option: ");
    }

    // MAIN METHOD | Entry point of the program
    public static void main(String[] args) {
        DiaryMain diaryMain = new DiaryMain();
        diaryMain.displayMenu();
        int input = diaryMain.scan.nextInt();
    }

    // CALL METHOD | Call the appropriate method based on user input
    public void callMethod(int input) {

    }
}
