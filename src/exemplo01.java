import java.util.Scanner;

public class exemplo01 {

    static void main(String[] args) {

        //Crie um vetor para captar cinco times de futebol

        Scanner entrada = new Scanner(System.in);

        //Tipo[ ] identificador = new Tipo[tamanho] -> declaração de vetor

        String [ ] times = new String[4];  //vetor do tipo String com 5 casas

        //para não chumbar o vetor, isso vai carregá-lo
        for (int i =0; i<4; i++) {
            System.out.println("Digite um time de futebol [" + i + "]: ");
            times [i] = entrada.nextLine();
        }

        //exibir vetor
        for (int i=0; i<4; i++) {
            System.out.println("Time ["+i+"]:"+times[i]);
        }
    }
}
