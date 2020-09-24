
package aula25_a_27;


public class ContaCorrente {
    
    public int numero;
    public double saldo;
    public boolean especial;
    public double limite;
    
    
    public double realizaSaque(double valor){
        
        if (saldo <= 0){
            System.out.println("Impossível realizar saque! \nSaldo insuficiente");
            return saldo;
        }else{
            
            saldo = saldo -valor;
            System.out.println("O novo Saldo é de: ");
            return saldo;
        }
        
    }
    
    public double realizaDeposito(double deposito){
        
        if (deposito <= 0){
            System.out.println("Operação não realizada, Algum valor precisa ser depositado!");
            return deposito;
        }else{
            saldo += deposito;
            System.out.println("Operação realizada com Sucesso!\nNovo Saldo:");
            return saldo;
        }
    }
    
    public void exibeSaldo(){
        System.out.println("O cliente: "+ numero +" Possui saldo de: " + saldo);
    }
    
    public void usaCheque(){
        if (especial == true){
            System.out.println("O cliente: " + numero+ " utiliza cheque especial!");
        }else{
            System.out.println("O cliente: " + numero+ " não utiliza cheque especial!");
        }
    }
    
}
