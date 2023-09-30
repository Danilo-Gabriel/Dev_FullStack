package heranca.application;

import heranca.entities.LegalStaff;
import heranca.entities.PhysicalPersonnel;
import heranca.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        taxPayerList.add(new LegalStaff("Danilo",1000.0, 0.0));
        taxPayerList.add(new PhysicalPersonnel("Gabriel",1000.0,0.0));

        for (TaxPayer x: taxPayerList) {
            System.out.println(x.TotalArrecado());
        }
    }
}
