public class DisplayFileContent {

    private static String[] getStrings(String messageFile) {
        // Create an instance of FileContentReader
        FileContentReader fileReader = new FileContentReader();
        counter executionCount = new counter();

        // Read the file content
        String message = fileReader.content(messageFile);
        String count = executionCount.runProgram();

        // put the content retrieved inside an array of strings
        String[] content = new String[2];
        content[0] = message;
        content[1] = count;

        return content;
    }

    public static String[] getContent(String messageFile) {
        return getStrings(messageFile);
    }

    public static void displayContent() {
        String messageFile = "src/project.txt";
        System.out.println(getContent(messageFile)[0]);
        System.out.println(getContent(messageFile)[1]);
    }


    public static void main(String[] args) {
        // test
        displayContent();
    }
}
