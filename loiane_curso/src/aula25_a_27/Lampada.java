package aula25_a_27;

public class Lampada {

    public String voltagem;
    public String cor;
    public boolean ligada;   
    
    
//    public void acendeLampada(){
//        ligada = true;
//        System.out.println("A lampada está acesa!");
//        
//    }
//    
//    public void desligaLampada(){
//        ligada = false;
//        System.out.println("A lampada está apagada!");
//    }
    
    public boolean botaoLampada(boolean botao){
        
        if(botao){            
           
            System.out.println("Lampada Ligada");
            return ligada = true;
            
        }else{            
            
            System.out.println("Lampada Desligada");
            return ligada = false;
            
        }
        
    }
    
}

