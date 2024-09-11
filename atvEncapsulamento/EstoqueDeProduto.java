public class EstoqueDeProduto {
  private String nome;
  private int quantidade;
  private double valor;
  private Boolean cadastrado;

  public EstoqueDeProduto() {
    this.nome = null;
    this.quantidade = 0;
    this.valor = 0.0;
    this.cadastrado = false;
  }

  public String getNome() {
    return this.nome;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public double getValor() {
    return this.valor;
  }

  public double setValor(double valor) {
    this.valor = valor;
    return this.valor;
  }

  //
  public void cadastrar(String nome, int quantidade, double valor) {
    if (this.cadastrado) {
      System.out.println("Já existe um produto cadastrado. Exclua o cadastro atual para cadastrar um novo.");
    }
    if (!this.cadastrado) {
      this.nome = nome;
      this.quantidade = quantidade;
      this.valor = valor;
      this.cadastrado = true;
    }

  }

  public void excluirCadastro() {
    this.nome = null;
    this.quantidade = 0;
    this.valor = 0.0;
    this.cadastrado = false;
  }

  public void removerQuantidade(int quantidade) {
    this.quantidade -= quantidade;
  }

  public void adicionarQuantidade(int quantidade) {
    this.quantidade += quantidade;
  }

  public void exibirEstoque() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Quantidade: " + this.quantidade);
    System.out.println("Valor do produto: " + this.valor);
  }
}