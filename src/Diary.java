import java.util.*;
// This class contains the methods for the diary application, such as adding, viewing, modifying, and deleting diary entries
public class Diary {
    // ARRAYLIST TO STORE DIARY ENTRIES
    private ArrayList<DiaryEntry> diaryEntries = new ArrayList<>();
    // RETURN DIARY ENTRIES
    public ArrayList<DiaryEntry> getDiaryEntries() {
        return diaryEntries;
    }
    // CONSTRUCTOR
    public Diary(ArrayList<DiaryEntry> diaryEntries) {
        this.diaryEntries = diaryEntries;
    }

    // ADD ENTRY | Method to add a new diary entry
    // ---------------------------------------------
    public void addEntry(Scanner scan) {
        // Declare variables
        String title, date, content;

        // Prompt user for input
        System.out.print("Enter title: ");
        title = scan.nextLine();
        System.out.print("Enter date (DD-MM-YYYY): ");
        date = scan.nextLine();
        System.out.print("Enter content: ");
        content = scan.nextLine();

        // Create new diary entry and add to list
        DiaryEntry newEntry = new DiaryEntry(title, date, content);
        diaryEntries.add(newEntry);
        System.out.println("Diary entry added successfully!");
    }

    // VIEW ENTRIES | Method to view all diary entries
    // -------------------------------------------------
    public void viewEntries() {
        if (diaryEntries.isEmpty()) {
            System.out.println("No diary entries found.");
        } else {
            for (DiaryEntry entry : diaryEntries) {
                System.out.println(entry.toString());
            }
        }
    }

    // MODIFY ENTRY | Method to modify an existing diary entry
    // ---------------------------------------------------------

    // SEARCH ENTRY | Method to search for a diary entry by date or entry ID
    // -----------------------------------------------------------------------
    public void searchEntry(Scanner scan) {
        int option;
        boolean found = false;
        // Loop until user selects a valid option
        while (true) {
            System.out.println("Do you want to search by [1] Date or [2] Entry ID?");
            option = scan.nextInt();
            scan.nextLine(); // consume newline
            if (option == 1 || option == 2) {
                break;
            }
            System.out.println("Invalid option. Please try again.");
        }
        
        // Search by date
        if (option == 1) {
            System.out.print("Enter date (DD-MM-YYYY): ");
            String date = scan.nextLine();
            // Search through diary entries for matching date
            for (DiaryEntry entry : diaryEntries) {
                if (entry.getDate().equals(date)) {
                    System.out.println(entry.toString());
                    found = true;
                }
            }
        }
        // Search by entry ID
        else if (option == 2) {
            System.out.print("Enter entry ID: ");
            int entryId = scan.nextInt();
            scan.nextLine(); // consume newline
            // Search through diary entries for matching entry ID
            for (DiaryEntry entry : diaryEntries) {
                if (entry.getEntryId() == entryId) {
                    System.out.println(entry.toString());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No diary entries found for the given date.");
        }
    }

    // DELETE ENTRY | Method to delete a diary entry
    // -----------------------------------------------

}
