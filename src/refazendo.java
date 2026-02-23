import java.text.DecimalFormat;
import java.util.Scanner;

public class refazendo {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0; //fazendo armazenamento do n numeros de prod q serão cadastrados
        System.out.println("Quantos produtos deseja cadastrar? ");
        num = entrada.nextInt();

        double [ ] preco = new double[num];
        String [ ] nomeProd = new String[num];

        for (int i = 0;i < num;i++) {
            System.out.println("Nome do produto ["+ i + "]: ");
            nomeProd[i] = entrada.next();

            System.out.println("Preço do produto [" + i + "]: ");
            preco[i] = entrada.nextDouble();
        }

        System.out.println("\n Listagem de produtos cadastrados: ");
        //exibir listagens de produtos
        for (int i = 0;i < num;i++) {
            System.out.println("Produto ["+ i + "]: "
                    + nomeProd[i]+ " - R$" + preco[i]);
        }

        //fazendo a COMPARAÇÃO
        double maior = preco[0]; //usa o primeiro valor do vetor como base de comparação
        double menor = preco[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        double soma = 0;
        DecimalFormat fNum = new DecimalFormat("##0.00");

        for (int i = 0; i < num; i++) {

            soma += preco[i]; //acumula valores para depois calcular média

            if (preco[i] > maior) {
                maior = preco[i]; //se encontrar um preço maior que o atual maior atualiza o valor e guarda o índice

            }

            if (preco[i] < menor) {
                menor = preco[i]; //mesma lógica acima
                indiceMenor = i;
            }
        }

        double media = soma / num; //cálculo média

        System.out.println("\nProduto mais caro: "
                + nomeProd[indiceMaior] + " - R$" + maior);

        System.out.println("Produto mais barato: "
                + nomeProd[indiceMenor] + " - R$" + menor);

        System.out.println("Média dos preços: R$" + fNum.format(media));

        entrada.close(); //serve para fechar o Scanner

    }
}
