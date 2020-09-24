
package com.loiane.curso_java.aula32;


public class TesteCarro {
    public static void main(String[] args) {
        
        Carro van = new Carro();
        
        van.setMarca("Wolksvagem"); // Para atribuir Valores
        van.setModelo("FOsca");
        van.setNumPassageiros(4);
        
        System.out.println(van.getMarca()); // Para Exibir Valores
        System.out.println(van.getModelo());
        System.out.println(van.getNumPassageiros());
        
    }
}
