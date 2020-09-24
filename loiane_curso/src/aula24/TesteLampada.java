
package aula24;


public class TesteLampada {
    public static void main(String[] args) {
        
        Lampada longa = new Lampada();
        
        longa.corLamp = "Azul";
        longa.estadoLamp = true;
        longa.potLamp = 110;
        longa.precoLamp = 15;
        longa.qntdLamp = 1;
        
        Lampada redonda = new Lampada();
        
        redonda.corLamp = "Amarela";
        redonda.estadoLamp = false;
        redonda.potLamp = 220;
        redonda.precoLamp = 10;
        
        System.out.println(redonda.corLamp);
        
    }
}
