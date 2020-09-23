package aula19;

import java.util.Arrays;
import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        
        int[] A = new int[8];
        int[] B = new int[8];
        Random random = new Random();
        
        for(int i = 0; i < 8; i++){
            
            A[i] = random.nextInt()*5;    
        }
        
        for (int i = 0;i < A.length; i++){
            B[i] = A[i]*2;
        }
        
        System.out.println("Valores de A: " + Arrays.toString(A));
        System.out.println("Valores de A dobrados: " + Arrays.toString(B));
    }
}
