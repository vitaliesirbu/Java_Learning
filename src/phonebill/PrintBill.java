package phonebill;

import java.util.Random;
import java.util.Scanner;


public class PrintBill {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        PrintBill print = new PrintBill();

        PhoneBill bill = print.getBill();
        bill.printItemizedBill();

    }

    public PhoneBill getBill() {
        int id = (int)(Math.random()*100);
        System.out.println("Enter base plan: ");
        double plan = scanner.nextDouble();
        System.out.println("Enter alloted minutes: ");
        double alloted = scanner.nextDouble();
        System.out.println("Enter minutes used: ");
        double used = scanner.nextDouble();

        scanner.close();

        return new PhoneBill(id, plan, alloted, used);

    }
}
