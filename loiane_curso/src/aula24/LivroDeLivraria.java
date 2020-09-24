package aula24;


public class LivroDeLivraria {
    public static void main(String[] args){
                
        Livro harryP = new Livro();
        
        harryP.autorLivro = "Augusto Cury";
        harryP.pagsLivro = 110;
        harryP.titLivro = "A pedra filosofal";
        harryP.editorLivro = "Livre";
        harryP.preco = 12.99;
        
        int jojo = harryP.lerMetadade(2);
//        System.out.println(harryP.preco);
        System.out.println(jojo);
        
    }
}
