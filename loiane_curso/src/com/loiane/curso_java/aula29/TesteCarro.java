
package com.loiane.curso_java.aula29;

public class TesteCarro {
    public static void main(String[] args) {
        
        Carro car = new Carro("Modelopika");
        
        car.marca = "Fiat";  // Caso o Valor não seja Setado retorna Robalo
        //car.modelo = "Ruim";
        car.numPassageiros = 2;
        car.capCombustivel = 2.0;
        car.conCombustivel = 1.5;
        
        car.mostraInfo();
        
        System.out.println("\n");
        // ------------------------------------------------------------------ //
        
        Carro car1 = new Carro("Modelo Brabodemais");
        
        car1.marca = "Volkevaguem";  // Caso o Valor não seja Setado retorna Robalo
        //car1.modelo = "Brabo";
        car1.numPassageiros = 4;
        car1.capCombustivel = 87.0;
        car1.conCombustivel = 2.0;
        
        car1.mostraInfo();
        
        
    }
}
