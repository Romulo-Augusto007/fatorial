import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        int fatorial = 0;
        System.out.println("Digite um número e eu irei mostrar o fatorial desse número: ");
        fatorial = scanner.nextInt();
        int multiplicador = fatorial;
        while (multiplicador > 0) {
            resultado = fatorial * (multiplicador - 1);
            multiplicador--;
            System.out.println(resultado);
        }
    }
}