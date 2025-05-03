import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type odd or even");
        String input = scanner.next();
        while(true) {
            if (input.equalsIgnoreCase("even")) {
                for (int i = 2; i < 101; i += 2)
                    System.out.println(i);
                break;
            } else if (input.equalsIgnoreCase("odd")) {
                for (int i = 1; i < 100; i += 2)
                    System.out.println(i);
                break;
            } else {
                System.out.println("error input try again");
                input = scanner.next();
            }
        }

    }
}
