import java.util.Scanner;

public class VerificaPositivoNegativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        char resultado = verificarNumero(numero);
        System.out.println("Resultado: " + resultado);
    }

    public static char verificarNumero(int n) {
        if (n > 0) {
            return 'P'; 
        } else {
            return 'N'; 
        }
    }
}
