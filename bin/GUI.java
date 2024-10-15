import java.awt.*;
import javax.swing.*;

public class GUI  {

    public GUI() {

        // initialize the frame
        JFrame frame = new JFrame();

        // preparing the content to be diplayed
        DisplayFileContent displayedContent = new DisplayFileContent();
        String[] content = displayedContent.getContent("src/project.txt");
        JLabel message = new JLabel(content[0]);
        JLabel count = new JLabel(content[1]);

        // Set font size and center the text horizontally and vertically
        message.setFont(new Font("Arial", Font.BOLD, 60)); // Bigger font
        message.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Set font size and center the text horizontally and vertically
        count.setFont(new Font("Arial", Font.ITALIC, 50)); // Bigger font
        count.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,30,10,30));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(message);
        panel.add(count);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome to our program's GUI");
        frame.setSize(300,200);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
