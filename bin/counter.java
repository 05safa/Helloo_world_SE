
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class counter {
    private static final String FILE_PATH = "src/execution_count.txt";
    private static int readCount() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = reader.readLine();
            if (line != null) {
                return Integer.parseInt(line);
            }
        } catch (IOException | NumberFormatException e) {
        }
        return 0;
    }

    private static void writeCount(int count) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String runProgram() {
        int count = readCount();
        count++;
        writeCount(count);
        return "code executed " +count+" times";
    }
               
    
    public static void main(String[] args) {
        System.out.println(runProgram());
    }
}
    



