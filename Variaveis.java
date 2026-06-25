// 24/06/2026. primeira atividade da série de java do bro code (variables).
// bem tosco.... OwO

public class Variaveis {
    public static void main(String[] args) {

        boolean isSigma = true;
        boolean isGay = false; // é ÓBVIO q isso é falso... wtf??? '-'
        int idade = 69;
        double randNumb = 3.14159;
        char genero = 'M';

        String nome = "or4acle";
        String personagens = "futaba e zero two";
        String comida = "parmegiana de frango";
        String animeFav = "darling in the franxx";
        String jogoFav = "persona 5 royal";
        String gayWtf = "é gay!!";

        System.out.println("Oi, seu nome deve ser " + nome + "..? E você deve ter " + idade + ".");
        System.out.println("Ah! É um prazer te conhecer.");
        System.out.println("Meio aleatório, mas aqui vai; " + randNumb + "! eu não sei o pq eu fiz isso.");
        System.out.println("Seu sexo é " + genero + "!");
        System.out.println("Vou adivinhar: suas personagens favoritas são a " + personagens + "!");
        System.out.println("Haha! Eu sei de tudo! E, sua comida favorita é " + comida + ".");
        System.out.println("Seu anime favorito é " + animeFav + ", e seu jogo favorito é " + jogoFav + ".");
        System.out.println("Enfim, chega de adivinhações. Adeus!! :)");

        if(isGay){
            System.out.println("Ah! Também esqueci de fazer uma última adivinhação: você " + gayWtf + " e, é " + isSigma + " a afirmação de você ser sigma. Desculpe!");
        }
        else{
            System.out.println("Ah! Também esqueci de fazer uma última adivinhação: você NÃO " + gayWtf + " e, é " + isSigma + " a afirmação de você ser sigma.");
        }

    }
}
