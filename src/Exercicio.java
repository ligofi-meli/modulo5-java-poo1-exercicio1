import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println("--- Exercício 1 ---");
        // String apelido = Gomez;
        String apelido = "Gomes";
        // int idade = "35";
        int idade = 35;
        // boolean = "false";
        boolean souAlto = false;
        // String saldo = 45857.90
        double saldo = 45857.90;
        // double nome = "Julián";
        String nome = "Filipe";
        System.out.println("Apelido: " + apelido);
        System.out.println("Idade: " + idade);
        System.out.println("Sou alto: " + souAlto);
        System.out.println("Saldo: $" + df.format(saldo));
        System.out.println("Nome: " + nome);

        System.out.println("--- Exercício 2 ---");
        // String 1nome;
        String  meuNome = "Filipe";
        // int idade;
        int minhaIdade = 30;
        // double $aldo;
        double meuSaldo = 1000000000;
        // String @pellido;
        String meuApelido = "Pé";
        // String direcao;
        String direcao = "Hidráulica";
        // boolean carteira de motorista;
        boolean carteiraDeMotorista = true;
        // double altura da pessoa;
        double minhaAltura = 1.80;
        // int quantidade-de-filhos;
        int quantidadeDeFilhos = 0;
        System.out.println("Meu nome: " + meuNome);
        System.out.println("Minha idade: " + minhaIdade);
        System.out.println("Meu Saldo: $" + df.format(meuSaldo));
        System.out.println("Meu Apelido: " + meuApelido);
        System.out.println("Direção: " + direcao);
        System.out.println("Carteira de motorista: " + carteiraDeMotorista);
        System.out.println("Minha altura: " + minhaAltura + " m");
        System.out.println("Quantidade de filhos: " + quantidadeDeFilhos);

        System.out.println("--- Exercício 3 ---");
        Scanner var17 = new Scanner(System.in);
        System.out.println("Digite o número de dias de campanha: ");
        int var18 = var17.nextInt();
        byte var19 = 2;
        int var20 = var19 * var18;
        System.out.println(var18 + " dias de campanha -> $ " + var19 + " * " + var18 + " = $" + var20);

        System.out.println("--- Exercício 4 ---");
        double valorBrutoPremio = 23563899;

        double imposto1 = 0.0245;   //
        double totalImposto1 = valorBrutoPremio * imposto1;

        double imposto2 = 0.15;
        double totalImposto2 = valorBrutoPremio * imposto2;

        double imposto3 = 0.03;
        double totalImposto3 = valorBrutoPremio * imposto3;

        double totalImposto = totalImposto1 + totalImposto2 + totalImposto3;
        double premioFinal = valorBrutoPremio - totalImposto;

        System.out.println("Valor bruto premio: $ " + (df.format(valorBrutoPremio)));
        System.out.println("Total de imposto: $" + (df.format(totalImposto)));
        System.out.println("Premio final: $ " + (df.format(premioFinal)));
    }
}
