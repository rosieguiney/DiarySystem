import java.io.*;
import java.util.*;
public class FileManaging {
    // SAVE FILE | Method to save a file
    public static void saveFile(ArrayList<DiaryEntry> diaryEntries) {
        // Try / catch to handle errors
        try {
            // Create print writer
            PrintWriter diaryFile = new PrintWriter(new FileWriter("DiaryEntries.txt"));
            // Put diary entries into the diary file
            for (DiaryEntry entry : diaryEntries) {
                diaryFile.println(entry.getEntryId() + ", " + entry.getTitle()
                        + ", " + entry.getDate() + ", " + entry.getContent());
            }
            diaryFile.close();
        } catch (IOException e) {
            System.err.println("Error saving file: " + e.getMessage());
        }

    }

    // READ FILE | Method to read a file
    public static ArrayList<DiaryEntry> readFile() {
        // Create ArrayList to store the diary data from file in
        ArrayList<DiaryEntry> diaryEntries = new ArrayList<>();
        // Try / catch to handle errors
        try {
            File diaryFile = new File("DiaryEntries.txt");
            Scanner fileScan = new Scanner(diaryFile);
            // Read each line from the file and create a DiaryEntry object
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] data = line.split(", ");

                int entryId = Integer.parseInt(data[0]);
                String title = data[1];
                String date = data[2];
                String content = data[3];

                DiaryEntry entry = new DiaryEntry(entryId, title, date, content);
                diaryEntries.add(entry);
            }
            fileScan.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return diaryEntries;
    }
}
