import java.util.Scanner;

public class tr2q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = entrada.nextDouble();

        // Cálculo do salário
        double salario = valorHora * horasTrabalhadas;

        // Exibição do resultado
        System.out.println("O seu salário neste mês é: R$ " + salario);

        entrada.close();
    }
}

