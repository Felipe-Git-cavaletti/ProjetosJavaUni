/*Um programa que recebe três valores e os exibe em ordem crescente. */

import java.util.Scanner;
import java.util.Arrays;//Importa a classe Arrays para usar o método sort() para ordenar os números;

public class Arrays3Valores{
    public static void main (String[]args){
        Scanner digite = new Scanner(System.in);
        int [] num = new int[3];//Cria um array de inteiros com capacidade para 3 números;
        for (int i = 0; i < 3; i ++)//Loop para ler os três números do usuário;
        {
           System.out.print("Digite o "+ (i+1) +"º número:");
           num[i] = digite.nextInt();//Lê o número e armazena no array na posição i;
        }
        Arrays.sort(num);//Ordena o array num em ordem crescente usando o método sort() da classe Arrays;

        System.out.print(num[0]+" , "+num[1]+" , "+num[2]);//Exibe os números em ordem crescente, acessando as posições do array.

    }
}