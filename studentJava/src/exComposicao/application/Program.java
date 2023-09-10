package exComposicao.application;

import exComposicao.Entities.Department;
import exComposicao.Entities.HourContract;
import exComposicao.Entities.Worker;
import exComposicao.Enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fm1 = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter work data:");
        System.out.println("Name: ");
        String workName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workName, WorkLevel.valueOf(workerLevel), baseSalary,new Department (departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + "data:");
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = fm1.parse(sc.next());
            System.out.println("Value per hour");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (Hours)");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
