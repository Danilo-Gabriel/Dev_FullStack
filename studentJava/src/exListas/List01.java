package exListas;

import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {

        //Lista do tipo String e está sendo inicializada ArrayList

        java.util.List<String> list = new ArrayList<>();

        // Adicionando nomes da lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        //adicionando em uma posição especifiica
        list.add(2,"Marco");

        //Mostrar o tamanho de posiçoes
        System.out.println(list.size());

        list.remove(1);
        for (String nome: list) {
            System.out.println(nome);
        }
        System.out.println("---------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String nome: list) {
            System.out.println(nome);
        }

    }
}
