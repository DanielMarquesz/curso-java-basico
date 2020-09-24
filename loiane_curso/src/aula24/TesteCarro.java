
package aula24;

public class TesteCarro {
    public static void main(String[] args) {
        
        Carro car = new Carro();
        
        car.marca = "Fiat";
        car.modelo = "Ruim";
        car.numPassageiros = 2;
        car.capCombustivel = 2.0;
        car.conCombustivel = 1.5;
        
        System.out.println(car.toString());
        
    }
}
