import java.util.Scanner;

/* 25/06/2026
   testando user input WOOHOOOOOOOOO
/* espere por mim, microsoft 🤑😈

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Insira um número decimal aleatório: ");
        double rand = scanner.nextDouble();

        // eu nn sabo o pq de colocar um boolean, mas ok, né :///
        System.out.print("Você gosta de anime? (true/false): ");
        boolean gostaAnime = scanner.nextBoolean();

        System.out.println("Olá, " + nome + ";");
        System.out.println("Você tem " + idade + " anos;");
        System.out.println("Você escolheu " + rand + " como seu número decimal aleatório;");

        if(gostaAnime){
            System.out.print("E você gosta de anime.");
        }
        else{
            System.out.print("E você não gosta de anime.");
        }

        scanner.close();
    }
}

// aahhhhh W codes (ohio respect)
