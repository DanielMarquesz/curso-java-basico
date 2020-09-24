
package aula24;

public class Livro {
    
    public String titLivro;
    public String autorLivro;
    public String editorLivro;
    public int pagsLivro; 
    public double preco;
    
    
    public String obterPaginas(){
        System.out.print("O número de páginas do livro é de: ");
        
        return pagsLivro + " Páginas";
    }
    
    public int lerMetadade(int Metade){ // Recebe um parâmetro 
        int totalPaginas = pagsLivro / Metade; // Faz a operação
        return  totalPaginas;           // Retorna um valor
    }
    
}
