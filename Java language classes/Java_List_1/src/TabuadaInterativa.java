import java.util.Scanner;

public class TabuadaInterativa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();
        int i = 1;
        while (i < 11){
            System.out.println(numero + " * " + i + " = " + (i*numero));
            i++;
        }
    }
}
