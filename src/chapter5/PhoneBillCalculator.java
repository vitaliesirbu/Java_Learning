package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double planFee = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double basePlan = getUserBasePlan();
        int overageMinutes = getUserOverageMinutes();

        double overMinutes = calculateOverage(planFee, overageMinutes);
        double totalTax = calculateTax(tax, basePlan, overMinutes);
        double totalDue = calculateTotal(totalTax, basePlan, overMinutes);

        displayBill(
                basePlan,
                overMinutes,
                totalTax,
                totalDue
        );
        scanner.close();

    }

    public static double getUserBasePlan() {
        System.out.println("Enter base cost of the plan:");
        double basePlan = scanner.nextDouble();
        return basePlan;
    }

    public static int getUserOverageMinutes() {
        System.out.println("Enter overage minutes:");
        int overage = scanner.nextInt();
        return overage;
    }

    public static double calculateOverage(double planFee, int overageMinutes) {
        return overageMinutes * planFee;
    }

    public static double calculateTax(double tax, double basePlan, double overageMinutes) {
        return (basePlan + overageMinutes) * tax;

    }

    public static double calculateTotal(double totalTax, double basePlan, double overMinutes) {
        return totalTax + basePlan + overMinutes;
    }

    public static void displayBill(double basePlan, double overMinutes, double totalTax, double totalDue) {
        System.out.println("Phone Bill Statement");
        String str1 = String.format("%.2f", basePlan);
        String str2 = String.format("%.2f", overMinutes);
        String str3 = String.format("%.2f", totalTax);
        String str4 = String.format("%.2f", totalDue);

        System.out.println("Plan: $" + str1);
        System.out.println("Overage: $" + str2);
        System.out.println("Tax: $" + str3);
        System.out.println("Total: $" + str4);
    }
}
