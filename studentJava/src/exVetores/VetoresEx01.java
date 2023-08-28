package exVetores;


import java.util.Locale;
import java.util.Scanner;

public class VetoresEx01 {
    public static void main(String[] args) {
/*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas:");
        int N = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[N];

        for(int i = 0; i < pessoa.length; i++){
            System.out.printf("Altura da %da pessoa:", i + 1);
            sc.nextLine();
            double altura = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);

            pessoa[i] = new Pessoa(altura, genero);

        }
        double menorAltura = pessoa[0].getAltura();
        double maiorAltura = pessoa[0].getAltura();

        for(int i = 0; i < pessoa.length; i++){
            if(pessoa[i].getAltura() > maiorAltura){
                maiorAltura = pessoa[i].getAltura();
            }
            if(pessoa[i].getAltura() < menorAltura){
                menorAltura = pessoa[i].getAltura();
            }
        }
            System.out.printf("Menor altura: %.2f  ", menorAltura);
            System.out.println();
            System.out.printf("Maior altura: %.2f  ", maiorAltura);

            double avg;
            int qntHomens = 0;
            int qntMulheres = 0;
            double sum = 0;

            for(int i = 0; i < pessoa.length; i++){
                if(pessoa[i].getGenero() == 'F' || pessoa[i].getGenero() ==  'f'){

                            sum += pessoa[i].getAltura();
                            qntMulheres++;
                }else{
                    qntHomens++;

                }

            }
            System.out.println();
            avg = sum / qntMulheres;
            System.out.printf("Media das alturas das mulheres %.2f = ",avg);
            System.out.println("Numeros de Homens = "+qntHomens);
        }

*/
    }

}

