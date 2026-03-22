import java.util.Scanner;

public class Calculadora{
    public static void main(String[]args){
        Scanner digite = new Scanner(System.in);//Cria um objeto Scanner para ler a entrada do usuário;
        System.out.println("Digite o primeiro número:");
        double  numb1 = digite.nextDouble();//Lê o primeiro número;
        System.out.println("Digite o segundo número:");
        double  numb2 = digite.nextDouble();//Lê o segundo número;

        digite.nextLine();//Limpa o buffer do teclado;

        System.out.println("Digite a operação a ser utilizada:");
        String  operacao = digite.nextLine();

        if(operacao.equals ("+")){
            System.out.print("A soma entre os números é: "+(numb1 + numb2));
        } else if (operacao.equals ("-")){
            System.out.print("A diferença entre os números é: "+(numb1 - numb2));
        }else if (operacao.equals ("/") | operacao.equals (":")){
            System.out.print("O queociente entre os números é: "+(numb1 / numb2));
        }else if (operacao.equals ("*") | operacao.equals ("x")){
            System.out.print("O produto entre os números é: "+(numb1 * numb2));
        }else {
            System.out.print("Operação inválida");
        }
        digite.close();//Fecha o scanner para evitar vazamento de recursos.
    }
}
