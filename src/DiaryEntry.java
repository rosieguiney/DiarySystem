// This class represents a single diary entry
public class DiaryEntry {
    // DECLARE VARIABLES
    private int entryId;
    private String title;
    private String date;
    private String content;
    private int numberOfEntries = 0;

    // CONSTRUCTOR
    public DiaryEntry(String title, String date, String content) {
        this.entryId = ++numberOfEntries;
        this.title = title;
        this.date = date;
        this.content = content;
        numberOfEntries++;
    }

    // GETTERS AND SETTERS
    public int getEntryId() {
        return entryId;
    }
    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // TOSTRING METHOD | Returns a string representation of the diary entry
    public String toString() {
        return "Entry ID: " + entryId + " | Title: " + title +
                " | Date: " + date + " | Content: " + content;
    }

}
