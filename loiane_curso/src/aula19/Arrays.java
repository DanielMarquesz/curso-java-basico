package aula19;

import java.util.Random;

public class Arrays {
    public static void main(String[] args){
        
        double[] temperaturas = new double[10];
        
        Random random = new Random();
        
        
        for (int i = 0; i < 10; i++){
            
            temperaturas[i] = random.nextDouble()*10;
            
        }
     
        System.out.println(java.util.Arrays.toString(temperaturas));
        System.out.println(temperaturas.length);
    }
}
