import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class FortuneTeller implements ActionListener {
    private String[] fortunes = {"大吉",
                                "吉", "吉",
                                "小吉",
                                "凶",
                                "スペシャルハイパー大吉"};
    private Random random;

    public FortuneTeller() {
        random = new Random();
    }

    public void tellFortune() {
        int index = random.nextInt(fortunes.length);
        String fortune = fortunes[index];
        sayFortune(fortune);
    }

    private void sayFortune(String fortune) {
        String s = "あなたの運勢は" +
                    pauseTag(2000) +
                    fortune +
                    pauseTag(200) +
                    "です。";
        try {
            Process process=Runtime.getRuntime().exec(new String[]{"say", "-v", "Kyoko", s});
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String pauseTag(int msec) {
        return "[[slnc "+msec+"]]";
    }

   
    public void actionPerformed(ActionEvent e){
        tellFortune();
    }

    public static void main(String[] args) {
        FortuneTeller ft = new FortuneTeller();
        ft.tellFortune();
    }
}
