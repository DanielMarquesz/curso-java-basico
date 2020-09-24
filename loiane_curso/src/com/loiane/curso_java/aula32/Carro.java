
package com.loiane.curso_java.aula32;


public class Carro {
    
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double conCombustivel;
    
    
    public String getMarca(){ // Referência ao atributo, para mostrar o valor do atributo
        return marca;
    }
    
    public void setMarca(String marca){ // Referência ao atributo para a configuração de seu valor
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
    
}
