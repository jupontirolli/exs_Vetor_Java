import java.util.Scanner;

public class exemplo03 {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Armazene as notas que a turma tirou na GS
        //Ao final das captações exiba uma listagem com as notas da turma
        //e a classificação da nota.
        //Exibir a média da turma;


        //CARREGA O VALOR DO TAMANHO DO VETOR EM UMA VARIÁVEL
        int num = 0;
        System.out.println("Digite o número de alunos da turma: ");
        num = entrada.nextInt();

        double [ ] notas = new double[num];
        String [] classificacao = new String[num];

        for (int i = 0; i<num; i++) {
            System.out.println("Digite a nota aluno [" + i + "]: ");
            notas[i]= entrada.nextDouble();
        }

        for (int i=0; i<num; i++) {
            if (notas[i]>= 9) {
                classificacao[i] = "Ótimo";
            } else if (notas[i] >= 8) {
                classificacao[i] = "Bom";
            } else if (notas[i] >= 6) {
                classificacao[i] = "Regular";
            } else {
                classificacao[i] = "Ruim";
            }
        }

        double soma =0;

        for (int i=0; i<num; i++) {
            System.out.println("Classificação Aluno ["+ i + "]: Nota " + notas[i] +" - " + classificacao[i]);
            soma += notas[i];
        }

        double media = soma/num;
        System.out.println("Média da turma: " + media);

    }
}
