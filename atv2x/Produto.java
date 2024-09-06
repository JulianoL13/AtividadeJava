
public class Produto {
  private double valor;
  private String nome;
  private int quantidade;

  public Produto(double valor, String nome, int quantidade){
    this.valor = valor;
    this.nome = nome;
    this.quantidade = quantidade;
  }


  public double getValorTotal(){
    return this.valor *   this.quantidade;
  }

  public String getNome(){
    return this.nome;
  }
  
  public int getQuantidadeTotal (){
    return this.quantidade;
  }

  public void adicionarProduto(int quantAdd){
    this.quantidade += quantAdd;
    }

  public void removerProduto(int quantRem){
    this.quantidade -= quantRem;
    }
  }