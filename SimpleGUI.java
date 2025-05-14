import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGUI {
    private JFrame frame;
    private JButton button;

    public SimpleGUI() {
        frame = new JFrame("占い");
        button = new JButton("占う");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        button.setBounds(100, 80, 100, 30);
        frame.add(button);

        frame.setVisible(true);
    }

    public void addActionListener(ActionListener listener) {
        button.addActionListener(listener);
    }

    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
    }
}

