import java.util.Scanner;

public class NeuroConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?:");
        double amount = scanner.nextDouble();

        scanner.nextLine();
        converter(amount);
        scanner.close();

    }

    public static void converter(double amount) {
        // -- Write your code below
        int nueroCoins = (int) amount;
        int c49 = 0, c9 = 0, c1 = 0;
        int remaining = (int)Math.round((amount-nueroCoins)*100);

        while (remaining > 0) {
            if (remaining >= 49) {
                c49++;
                remaining -= 49;

            } else if (remaining >= 9) {
                c9++;
                remaining -= 9;
            } else if (remaining > 0) {
                c1 += remaining;
                remaining = 0;
            }
        }

        System.out.println(nueroCoins);
        System.out.println(c49);
        System.out.println(c9);
        System.out.println(c1);
        // Don't forget to print the output [check the requirements]

        // -- Write your code above
    }
}
