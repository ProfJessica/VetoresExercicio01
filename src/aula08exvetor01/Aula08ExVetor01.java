package aula08exvetor01;


public class Aula08ExVetor01 {

   public static void main(String[] args) {

    //Crie um vetor A com 5 elementos inteiros. 
    //Após criado o vetor A faça A[i]=B[i].
        

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 47394, 52, 23846};
                                //10
        int[] vetorB = new int[vetorA.length];
     
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
           System.out.print(vetorA[i] + " ");
        }
        System.out.println(); // apenas para pular linha
//
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
           System.out.print(vetorB[i] + " ");
        }
        System.out.println(); // apenas para pular linha


    }
    
}
