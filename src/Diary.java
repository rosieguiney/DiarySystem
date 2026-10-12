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

    // MODIFY ENTRY | Method to modify an existing diary entry
    // ---------------------------------------------------------

    // SEARCH ENTRY | Method to search for a diary entry by date or entry ID
    // -----------------------------------------------------------------------

    // DELETE ENTRY | Method to delete a diary entry
    // -----------------------------------------------

}
