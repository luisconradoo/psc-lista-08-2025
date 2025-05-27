import java.util.Scanner;

public class ConversorHora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora24 = scanner.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();

            char amPm = 'A'; // 'A' = A.M., 'P' = P.M.
            int hora12 = converterHora(hora24, amPm);

            amPm = (hora24 >= 12) ? 'P' : 'A'; // Determina A.M./P.M.
            exibirHora(hora12, minutos, amPm);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');
    }

    public static int converterHora(int hora24, char amPm) {
        if (hora24 == 0) {
            return 12;
        } else if (hora24 > 12) {
            return hora24 - 12;
        } else {
            return hora24;
        }
    }

    public static void exibirHora(int hora, int minutos, char amPm) {
        String periodo = (amPm == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora no formato de 12 horas: %d:%02d %s\n", hora, minutos, periodo);
    }
}
