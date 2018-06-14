import java.util.Scanner;

public class LeanCode {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        CashRegister cashRegister = new CashRegister();

        while (true) {
            System.out.println("Enter a product (apple/banana/cherry): ");
            String product = reader.nextLine();

            cashRegister.add(product);

            System.out.println(product + " -> " + cashRegister.total());
        }

        //reader.close();
    }
}
