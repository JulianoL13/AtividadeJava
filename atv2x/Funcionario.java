public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Funcionario(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public double calcularSalario(double porcentagem) {
        double salarioLiquido = this.salarioBruto - this.taxa;
        double acrescimo = (this.salarioBruto * porcentagem) / 100;
        return salarioLiquido + acrescimo;
    }

    public void imprimir(double porcentagem) {
        double salarioAtualizado = calcularSalario(porcentagem); 
        System.out.println("O nome é: " + this.nome);
        System.out.println("Salario atualizado: " + salarioAtualizado);
    }
}