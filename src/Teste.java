import java.util.Scanner;

public class Teste {
    public String readString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

}
