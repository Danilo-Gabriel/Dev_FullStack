package heranca.application;

import heranca.entities.Employee;
import heranca.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

        public class ex01 {

            public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc =  new Scanner(System.in);
                List<Employee> employeeList = new ArrayList<>();

                int N;

                System.out.println("Enter the number of employees: ");
                N = sc.nextInt();

                sc.nextLine();

                for (int i = 1; i <= N; i++) {

                    System.out.println("Emplooye # "+i+" Data");
                    System.out.println("Outsourced (Y/N)");
                    char R = sc.next().charAt(0);
                    System.out.println("Nome: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Hours: ");
                    Double hours = sc.nextDouble();
                    System.out.println("Value per Hour: ");
                    Double valuePerHora = sc.nextDouble();
                    if(R == 'Y') {
                        System.out.println("Addiotinal charge: ");
                        Double addiotanalCharge = sc.nextDouble();
                        Employee emp = new OutsourcedEmployee(name, hours, valuePerHora,addiotanalCharge);
                        //employeeList.add(new OutsourcedEmployee(name, hours, valuePerHora,addiotanalCharge));
                        employeeList.add(emp);

                    }

                    else {
                        Employee emp = new Employee(name, hours, valuePerHora);
                        employeeList.add(emp);
                    }

                }

                for (Employee x: employeeList) {
                    System.out.println(x.toString());
                }
                sc.close();




    }
}
