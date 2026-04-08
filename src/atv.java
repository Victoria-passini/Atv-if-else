import java.util.Scanner;

public class atv {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(" seja bem vindo! " +
            "Digite o primeiro número:  ");
    int primeiroNumero = scanner.nextInt();

    System.out.println("Digite o segundo numero: ");
    int segundoNumero = scanner.nextInt();

    if (primeiroNumero > segundoNumero) {
        System.out.print("O maior numero digitado é :  " + primeiroNumero);
    } else if (segundoNumero > primeiroNumero) {
        System.out.println("o maior numero é: " + segundoNumero);
    } else {
        System.out.println("os numero são iguais!");
    }
    scanner.close();


}
