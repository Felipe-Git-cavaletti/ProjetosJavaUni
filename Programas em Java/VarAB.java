/*FUP que leia um número inteiro. Se for MAIOR que zero armazene na variável A se for MENOR que zero na variável B. 
Ao final escreva o valor das duas variáveis.*/

import java.util.Scanner;

public class VarAB{
    public static void main (String[]args){
       Scanner digite = new Scanner(System.in);
       System.out.print("Digite um número inteiro:");
       int numb = digite.nextInt();
       String A = "nulo";
       String B = "nulo";

       if (numb > 0){;
           A = String.valueOf(numb);//Converte o número inteiro para string;
       }else if (numb < 0){
           B = String.valueOf(numb);
       }
       System.out.println ("O valor de A é: "+ A + "\nO valor de B é: "+ B);
    }
}