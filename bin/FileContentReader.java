
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileContentReader {
    private static String readContent(String filePath) {
        // Declaring the content variable
        String content = "";

        try {
            // Read the file's content into a String
            content = new String(Files.readAllBytes(Paths.get(filePath)));
	        // System.out.println("File read successfullly");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return content;
    
    }

    public static String content(String filePath) {
        return readContent(filePath);
    }

    public static void main(String[] args) {
        // Testing the readContent method in main 
        System.out.println("Looking for file at: " + new java.io.File("src/project.txt").getAbsolutePath());
        String str = content("src/project.txt");
        System.out.println(str);
    }
}
