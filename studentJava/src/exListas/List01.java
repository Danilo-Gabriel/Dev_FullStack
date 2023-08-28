package exListas;

import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {

        //Lista do tipo String e está sendo inicializada ArrayList
        java.util.List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());

        list.remove(1);
        for (String nome: list) {
            System.out.println(nome);
        }


    }
}
