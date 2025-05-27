import java.util.Scanner;

public class SomaTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        int resultado = somarTresNumeros(a, b, c);
        System.out.println("A soma dos três números é: " + resultado);
    }

    public static int somarTresNumeros(int x, int y, int z) {
        return x + y + z;
    }
}
