package exListas;

import exPOO.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List01 {
    public static void main(String[] args) {

        //Lista do tipo String e está sendo inicializada ArrayList

        List<String> list = new ArrayList<>();



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
        list.removeIf(x -> x.charAt(0) == 'M'); //Remove os nomes iniciado com M
        for (String nome: list) {
            System.out.println(nome);
        }
        System.out.println("----------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //Pesquisa dentro de lista
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // -1 Não encontrado
        System.out.println("-------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x: result) {
            System.out.println(x);
        }
        System.out.println("---------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
