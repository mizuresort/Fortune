import javax.swing.JOptionPane;
public class GUI implements UI {
    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);

    }

    public String getInput(String prompt){
        return JOptionPane.showInputDialog(null, prompt);
    }

}
