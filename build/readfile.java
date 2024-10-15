import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readfile {
    public static void main(String[] args) {
        // Path to the file to read from 
        String filePath = "project.txt";

        try {
            // Read the file's content into a String
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
	System.out.println(" file read");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
