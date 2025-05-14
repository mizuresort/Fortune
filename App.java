public class App {
    public static void main(String[] args) throws Exception {
       SimpleGUI gui= new SimpleGUI();
       FortuneTeller ft= new FortuneTeller();

       gui.addActionListener(ft);

    }
}
