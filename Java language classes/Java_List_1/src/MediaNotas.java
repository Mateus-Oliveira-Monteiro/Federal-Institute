import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numeroDeAlunos = scanner.nextInt();

        double[] notas = new double[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = calcularMedia(notas);

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }

    private static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
