package heranca.application;

import heranca.entities.LegalStaff;
import heranca.entities.PhysicalPersonnel;
import heranca.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.println("Enter number of tax payer: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            System.out.println("Tax payer #"+i+" data:");
            System.out.println("Individuo or company (i/c)");
            char R = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Anual income:");
            double annualIncome = sc.nextDouble();
            if(R == 'i'){
                System.out.println("Health expenditures:");
                double saude = sc.nextDouble();
                taxPayerList.add(new PhysicalPersonnel(name,annualIncome,saude));
            }
            if (R == 'c') {
                System.out.println("Number of employees:");
                int number = sc.nextInt();
                taxPayerList.add(new LegalStaff(name, annualIncome, number));
            }
        }

        double dum = 0.0;
        for (TaxPayer x : taxPayerList) {
            System.out.println(x.toString());
            dum += x.impostoApagar();
        }

        System.out.printf("TOTAL TAXES: $%.2f", dum);

        }
}
