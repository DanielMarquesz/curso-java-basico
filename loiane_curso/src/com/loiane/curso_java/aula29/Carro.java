
package com.loiane.curso_java.aula29;


public class Carro {    
    
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double conCombustivel;
    
    // Uma Classe pode ter vários Construtores
    
    public Carro(){ //Um construtor que já seta valores padrões, sem necessidade de instancia de atributos
        marca = "Robalo";
    }
    
    public Carro(String modelo_){  // Permite a inserção de Atributos via instânciação de um novo Objeto
        modelo = modelo_;
    }
    
    void mostraInfo(){
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(numPassageiros);
        System.out.println(capCombustivel);
        System.out.println(conCombustivel);
        
    }
    
}