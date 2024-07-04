public class AppGUI {
    public static void main(String[] args){
        GUI gui= new GUI();
        GuessingGame game= new GuessingGame(gui);
        game.start();
    }
}