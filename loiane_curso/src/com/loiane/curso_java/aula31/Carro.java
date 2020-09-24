
package com.loiane.curso_java.aula31;

public class Carro {    
                        // Deixando os atributos como público conseguimos 
                        //acessalos em outras classes com o mesmo pacote.
    public String marca;
    public String modelo;
    public int numPassageiros;
    double capCombustivel;
    double conCombustivel;

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        
    }
    
    public void felicitaCliente(){
        System.out.println("Parabéns Amigo(a)! Voce acaba de comprar uma Carro 0Km");
    }
    
    
}
