//import java.util.Scanner;

public class GuessingGame{
   private UI ui;

    public GuessingGame(UI ui){
     //this.ui=ui;
    }

    public void start() {
        
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;

        ui.showMessage("数当てゲームを開始します。1から100の間の数字を当ててください。");

        while (!win) {
            String input = ui.getInput("数字を入力してください: ");
            guess = Integer.parseInt(input);
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                ui.showMessage("大きい数字を試してみてください。");
            } else {
                ui.showMessage("小さい数字を試してみてください。");
            }
        }

        ui.showMessage("おめでとうございます！正解は " + numberToGuess + " でした。");
        ui.showMessage("あなたは " + numberOfTries + " 回で正解しました。");
    }

  

}

