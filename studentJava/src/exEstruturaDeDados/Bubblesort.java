package exEstruturaDeDados;

import java.util.Random;

public class Bubblesort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length ; i++) {

             int N = random.nextInt(100);
             vetor[i] = N;
        }

        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + " ");

        }
        System.out.println();
        System.out.println("--------------------------------------");
        

    }


    public void Bubblesort (int vet[]){

        int aux;
        int tamanhoVetor = vet.length;

        for (int i = 0; i < tamanhoVetor ; i++) {
            for (int j = 0; j < (tamanhoVetor - 1); j++) {

                if(vet[j] < vet[j+1]){
                    aux = vet

                }
                
            }

        }

    }


}
