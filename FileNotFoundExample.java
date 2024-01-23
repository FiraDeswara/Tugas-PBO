import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("nonexistent.txt"));
            // Proses membaca file
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
