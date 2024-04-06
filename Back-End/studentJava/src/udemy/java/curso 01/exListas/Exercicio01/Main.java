package exListas.Exercicio01;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many Employees Will be registered? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
         int idSalary = sc.nextInt();
         Integer pos = hasId(list, idSalary);

         if(pos == null){
             System.out.println("This id does not exist!");
         }
         else{
             System.out.println("Enter the Percentage:");
             double x = sc.nextDouble();
             list.get(pos).increaseSalary(x);
         }

        System.out.println();
        System.out.println("List of employees: ");

        for (Employee x: list
             ) {
            System.out.println(x);

        }
         /* METODO ALTERNATIVO PARA BUSCAR DE IDs EM UMA LISTA

         // Eu vou querer somente os funcionarios x tal que o x.getId seja igual o id,
          pegue o primeiro se não existir retorne null
         Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
         if(emp == null){
         System.out.println("This id does not exist!");
         }
         else{
             System.out.println("Enter the percentage: ");
         }
         */

        sc.close();
    }

    // METODO ALTERNATIVO PARA BUSCAR DE IDs EM UMA LISTA
    public static Integer hasId(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
