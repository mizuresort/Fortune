import java.util.Scanner;
public class CUI implements UI {
    private Scanner scanner;

    public CUI(){
        scanner = new Scanner(System.in);
    }
public void showMessage(String message){
    System.out.println(message);
}

public String getInput(String prompt){
    System.out.print(prompt);
    return scanner.nextLine();
}

}
