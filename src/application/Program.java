package application;

import model.entities.Company;
import model.entities.Individual;
import model.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double annual = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Individual(name, annual, health));
            } else {
                System.out.print("Number of employees: ");
                int number = sc.nextInt();
                list.add(new Company(name, annual, number));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + " $ "
                    + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ "
                + String.format("%.2f", sum));

        sc.close();
    }
}
