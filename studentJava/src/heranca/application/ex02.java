package heranca.application;

import heranca.entities.ImportedProduct;
import heranca.entities.Product;
import heranca.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> ProductList = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {

            System.out.println("Product #"+i+" Data:");
            System.out.println("Common, used of imported (c/u/i)");
            char R = sc.next().charAt(0);
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();
            if (R == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY)");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ProductList.add(new UsedProduct(name, price, date));
            } else if (R == 'i') {
                System.out.println("Customs Fee: ");
                double frete = sc.nextDouble();
                ProductList.add(new ImportedProduct(name, price, frete));

            } else {
                ProductList.add(new Product(name, price));
            }

        }
        for (Product x: ProductList) {
            System.out.println(x.priceTag());
        }


    }
}
