import java.util.Scanner;

// 25/06/2026

public class MadLibs {
    public static void main(String[] args){

        // MAD LIBS GAME WTFF WOOOHOOOOO

        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String substantivo1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.print("Escreva um adjetivo (descrição): ");

        adjetivo1 = scanner.nextLine();

        System.out.print("Escreva um substantivo (algo bizarro): ");

        substantivo1 = scanner.nextLine();

        System.out.print("Escreva outro adjetivo (descrição): ");

        adjetivo2 = scanner.nextLine();

        System.out.print("Escreva um verbo: ");

        verbo1 = scanner.nextLine();

        System.out.print("Escreva outro adjetivo (descrição): ");

        adjetivo3 = scanner.nextLine();

        System.out.println("Hoje eu joguei um vídeo-game muito " + adjetivo1 + ".");
        System.out.println("Nesse jogo, eu vi um " + substantivo1 + ". Isso foi definitivamente algo.");
        System.out.println("Esse " + substantivo1 + " era " + adjetivo2 + " e " + verbo1 + "!");
        System.out.println("Eu fiquei " + adjetivo3 + "!");

        scanner.close();
    }

}
