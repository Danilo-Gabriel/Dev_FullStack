package Heranca.application;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex",1000.0);
        Account y = new SavingsAccount(2023, "Maria", 1100.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

    }
}
