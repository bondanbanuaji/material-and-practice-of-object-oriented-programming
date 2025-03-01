import javax.swing.*;
import java.awt.*;

public class World {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Window");
            window.setSize(500, 400);
            window.setLocationRelativeTo(null);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Hello World");
            window.add(label);
            window.setVisible(true);

            ImageIcon imageIcon = new ImageIcon("src/resources/earth.png");
            label.setIcon(imageIcon);

            label.setText("Goodbye!");
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.CENTER);

            label.setForeground(Color.WHITE);
//            label.setForeground(Color.decode("#ba523f"));
//            label.setForeground(new Color(58, 240, 67, 200));

//            retrieve text
            System.out.println(label.getText());

//            vertical alignment
            label.setVerticalAlignment(SwingConstants.CENTER);
            window.setVisible(true);

            window.setResizable(true);
        });
    }
}
