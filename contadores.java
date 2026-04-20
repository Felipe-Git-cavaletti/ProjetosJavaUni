/*3) Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
Exemplo:
[0-25] - 3 números
[26-50] - 1 números
[51-75] - 4 números
[76-100] - 0 números
A entrada de dados deverá terminar quando for lido um número negativo.*/

import java.util.Scanner;

public class contadores{
  public static void main(String[]args){
    Scanner digite = new Scanner(System.in);
    
    int valor = 0;
    
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    
    while(valor >= 0){
      
      System.out.println("Digite um valor: ");
      valor = digite.nextInt();
      
      if(valor >= 0 && valor <= 25){
        cont1 = cont1 + 1; 
      }else if(valor >= 26 && valor <= 50){
        cont2 = cont2 + 1; 
      }else if(valor >= 51 && valor <= 75){
        cont3 = cont3 + 1; 
      }else if(valor >= 76 && valor <= 100){
        cont4 = cont4 + 1; 
      }
    }
    System.out.println("[0-25] - " + cont1);
    System.out.println("[26-50] - " + cont2);
    System.out.println("[51-75] - " + cont3);
    System.out.println("[76-100] - " + cont4);
    
  }
}

