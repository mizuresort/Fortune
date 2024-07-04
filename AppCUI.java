public class AppCUI {
    public static void main(String[] args) throws Exception {
       CUI cui= new CUI();
       GuessingGame game= new GuessingGame(cui);
       game.start();
        }
}
