import java.util.Scanner;

public class VerificacaoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int maiorNumero = Math.max(Math.max(numero1, numero2), numero3);

        System.out.println("O maior número é: " + maiorNumero);

        verificarSinal(numero1);
        verificarSinal(numero2);
        verificarSinal(numero3);

        scanner.close();
    }

    private static void verificarSinal(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println(numero + " é igual a zero.");
        }
    }
}
