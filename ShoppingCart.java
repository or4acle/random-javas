import java.util.Scanner;

// 25/06/2025
// isso é definitivamente muito épico

public class ShoppingCart {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        int quantidade;
        char currency = '$';

        System.out.print("Seja bem-vindo! Que item você gostaria de comprar?: ");
        item = scanner.nextLine();

        System.out.print("Qual seria o preço para cada?: ");
        preco = scanner.nextDouble();

        System.out.print("Quantos você gostaria comprar?: ");
        quantidade = scanner.nextInt();

        double total = preco * quantidade;

        System.out.println("\nVocê comprou " + quantidade + " " + item + "/s");
        System.out.println("O seu total é de " + currency + total + ".");

        scanner.close();
    }
}
