import java.util.Scanner;

public class SomaImposto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do custo: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = scanner.nextDouble();

        double novoCusto = somaImposto(taxaImposto, custo);
        System.out.println("Custo com imposto: R$ " + novoCusto);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }
}
