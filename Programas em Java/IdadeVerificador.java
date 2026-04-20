/*Um programa capaz de verificar com base no Ano de Nascimento e na Idade da pessoa (ambos os dados providenciados por ela),se a idade informada é correta. */

import java.util.Scanner;
import java.time.LocalDate;//Importação da biblioteca para obter o ano atual;

public class IdadeVerificador {
    public static void main (String[]args){
        Scanner informe = new Scanner(System.in);
        System.out.println ("Digite o seu ano de nascimento:");
        int anonasc = informe.nextInt();
        System.out.println ("Digite a sua idade:");
        int idade = informe.nextInt();
        int ano = LocalDate.now().getYear();//Obtendo o ano atual usando a biblioteca LocalDate;
        String mensagem = "";//Variável para armazenar a mensagem de resultado;
        
        if(idade == ano - anonasc){
            mensagem = "Idade correta!";
        }else{
            mensagem = "Idade incorreta!";
        }
        System.out.println(mensagem);
        
        informe.close();
    }
}