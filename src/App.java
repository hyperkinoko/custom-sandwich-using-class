import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ham = scanner.nextInt();
        int lettuce = scanner.nextInt();

        Sandwich sand = new Sandwich(ham, lettuce);
        System.out.println(sand);
    }
}
