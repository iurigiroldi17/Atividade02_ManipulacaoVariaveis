public class Main {
    public static void main(String[] args) {
        // Criação de variáveis
        String nome = "Iuri"; // Nome da pessoa
        int idade = 17; // Idade da pessoa
        double salarioBrutoMensal = 3500.00; // Salário bruto mensal
        int mesesTrabalhados = 12; // Quantidade de meses trabalhados
        int quantidadeProdutos = 10; // Quantidade de produtos comprados

        // Operações Simples
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados; // Salário anual bruto
        double desconto = 2000.00; // Valor fixo de desconto
        double salarioAnualLiquido = salarioAnualBruto - desconto; // Salário anual líquido

        double valorTotalCompras = 5000.00; // Valor total de compras
        double mediaGastoPorProduto = valorTotalCompras / quantidadeProdutos; // Média do valor gasto por produto

        String mensagem = "Olá, " + nome + "! Seu salário anual líquido é R$ " + salarioAnualLiquido + "."; // Mensagem personalizada

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário bruto mensal: " + salarioBrutoMensal);
        System.out.println("Meses trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de produtos comprados: " + quantidadeProdutos);
        System.out.println("Salário anual bruto: " + salarioAnualBruto);
        System.out.println("Salário anual líquido: " + salarioAnualLiquido);
        System.out.println("Média do valor gasto por produto: " + mediaGastoPorProduto);
        System.out.println(mensagem);
    }
}