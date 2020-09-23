package aula19;

import java.util.Arrays;
import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        
        int[] A = new int[5];
        int[] B = new int[5];
        
        Random ale = new Random();
        
        for (int i = 0; i < 5; i++){
            
            A[i] = ale.nextInt();
            B[i] = ale.nextInt();
        }        
        //B[0] = A[1];        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}