import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeroInformado = 0;
        System.out.println("Digite um número e eu irei mostrar o fatorial desse número: ");
        numeroInformado = scanner.nextInt();
        int num = numeroInformado -1;
        numeroInformado = numeroInformado * (numeroInformado-1);
        System.out.println(numeroInformado);
        while( num != 1){
            numeroInformado = numeroInformado * (num-1);
            num--;

            System.out.println(numeroInformado);
        }
    }
}