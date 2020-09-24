
package com.loiane.curso_java.aula30;


public class Carro {    
    
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double conCombustivel;
    
    // Construtor
    
    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double conCombustivel){
        this.marca = marca;
        this.modelo = "Ducato";
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.conCombustivel = conCombustivel;
    }

    // Gerando um construtor que instância valores
    
    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Construtor com 3 parâmetros!");        
    }
    
    public Carro(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Construtor com 2 parâmetros!");        
    }
    
    
    void mostraInfo(){
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(numPassageiros);
        System.out.println(capCombustivel);
        System.out.println(conCombustivel);
        
    }
    
}