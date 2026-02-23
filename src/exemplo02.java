import java.util.Scanner;

public class exemplo02 {

    static void main(String[] args) {

        //Armazene o nome de cinco atletas e a idade, somente após a
        //captação exiba quem tem idade superior 21 anos

        Scanner entrada = new Scanner(System.in);

        String [] nome = new String[5];
        int [] idade = new int[5];

        for (int i = 0; i<5; i++) {
            System.out.println("Digite o nome do atleta [" + i + "]: ");
            nome[i] = entrada.next();

            System.out.println("Digite a idade do atleta ["+ i + "]: ");
            idade[i] = entrada.nextInt();
        }

        //checar vetor, faz outra repetição
        for (int i = 0;i<5; i++) {
            if (idade[i] >= 21) {
                System.out.println("Atleta " + nome[i]);
            }
        }
    }
}
