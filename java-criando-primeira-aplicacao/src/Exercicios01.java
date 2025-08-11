public class Exercicios01 {
    public static void main(String[] args) {
//      Exercicios:
//      2.1 Faça como eu fiz: conversão de temperaturas

        double celcius = 30.5;
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit e " + fahrenheit);

//      Desafio: hora da prática
//      1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 6.5;
        double nota2 = 7.4;
        double media = (nota2 + nota1) / 2;
        System.out.println("A media e de " + media);
//      2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double decimal = 10.1;
        int inteiro = (int) decimal;
        System.out.printf("Casting double para inteiro " + inteiro);

//      3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
//      Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'a';
        String palavra = "palavr";
        System.out.println("Palavra Completa: " + palavra + letra);

//      4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
//      Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 49.90;
        int quantidade = 15;
        double valorTotal = quantidade * precoProduto;
        System.out.println("Preco Total: " + valorTotal);
//      5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
//      Considere que o valor de 1 dólar é equivalente a 4.94 reais.
//      Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 100;
        double dolar = 4.94;
        double valorEmReais = valorEmDolares * dolar;
        System.out.println("Preco Em Reais: " + valorEmReais);

//      6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
//      Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
//      Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 499.90;
        double percentualDesconto = 15;
        double valorDesconto =  (precoOriginal * percentualDesconto) / 100;
        double valorFinal = precoOriginal - valorDesconto;
        System.out.println("Preco Final: " + valorFinal);
    }
}
