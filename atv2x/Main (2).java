
public class Main {
    public static void main(String[] args) {
      
        Produto produto1 = new Produto(10.0, "Produto 1", 5);
        produto1.adicionarProduto(3);       System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Valor total do produto: " + produto1.getValorTotal());
        System.out.println("Quantidade total do produto: " + produto1.getQuantidadeTotal());
        
        
    }
}
