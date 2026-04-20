/*1)Crie um jogo de JoKenPo (Pedra-Papel-Tesoura). O usuário digita a opção que quer
jogar e o algoritmo gera automaticamente a outra opção. Mostrar a mensagem informando
o que cada um jogou e quem ganhou. Ao final deve ser perguntado ao usuário se ele quer
jogar novamente ou não.*/

import java.util.Scanner;
import java.util.Random;

public class jokenpo{
  public static void main(String[]args){
    Scanner leia = new Scanner(System.in);
    
     boolean querer = true;
    
    while(querer == true){
       System.out.println("Digite o número de uma das opções: \n\n1 - Pedra; \n\n2 - Papel; \n\n3 - Tesoura;");
    int escolhaU = leia.nextInt();
    
    Random gerador = new Random();
    int escolhaC = gerador.nextInt(3) + 1;
   
    String resposta;
      
      if(escolhaU == escolhaC){
       System.out.println("EMPATE!");
      }else if(escolhaU == 1 && escolhaC == 2){
        System.out.println("DERROTA \nUsuário escolheu: Pedra; \nComputador escolheu: Papel;");
      }else if(escolhaU == 1 && escolhaC == 3){
        System.out.println("VITÓRIA \nUsuário escolheu: Pedra; \nComputador escolheu: Tesoura;");
      }else if(escolhaU == 2 && escolhaC == 3){
        System.out.println("DERROTA \nUsuário escolheu: Papel; \nComputador escolheu: Tesoura;");
      }else if(escolhaU == 3 && escolhaC == 2){
        System.out.println("VITÓRIA \nUsuário escolheu: Tesoura; \nComputador escolheu: Papel;");
      }else if(escolhaU == 3 && escolhaC == 1){
        System.out.println("DERROTA \nUsuário escolheu: Tesoura; \nComputador escolheu: Pedra;");
      }else if(escolhaU == 2 && escolhaC == 1){
        System.out.println("VITÓRIA \nUsuário escolheu: Papel; \nComputador escolheu: Pedra;");
      }
      
      System.out.println("\nDesejas continuar? (S/N)");
      resposta = leia.next();
      if(resposta.equalsIgnoreCase ("S")){
       querer = true; 
      }else{
       querer = false; 
      }
    }
    leia.close();
  }
}
