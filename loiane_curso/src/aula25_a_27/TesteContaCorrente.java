
package aula25_a_27;


public class TesteContaCorrente {
    public static void main(String[] args) {
        
        ContaCorrente bradesco = new ContaCorrente();
        
        bradesco.limite = 20.000;
        bradesco.numero = 1212;
        bradesco.saldo = 1000.0;
        bradesco.especial = false;        
        System.out.println(bradesco.realizaSaque(5.00));
        System.out.println(bradesco.realizaDeposito(20.00));
        bradesco.exibeSaldo();
        bradesco.usaCheque();
    }
}
