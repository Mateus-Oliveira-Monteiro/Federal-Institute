import java.util.Scanner;

public class VerificacaoNumerosPares {
    public static void main(String[] args) {

        System.out.println("Começando a listar os numeros pares até 100! ");
        int i = 100;

        while(i != 0){
            if (i%2 == 0){
                System.out.println(i);
                i--;
            }i--;
        }
    }
}
