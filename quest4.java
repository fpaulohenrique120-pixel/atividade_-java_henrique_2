import java.util.Scanner;

public class trf2q4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = entrada.nextDouble();

        // Cálculos
        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSindicato);

        // Exibição dos resultados
        System.out.println("\n--- Resumo do salário ---");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto IR (11%): R$ " + descontoIR);
        System.out.println("Desconto INSS (8%): R$ " + descontoINSS);
        System.out.println("Desconto Sindicato (5%): R$ " + descontoSindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        entrada.close();
    }
}
