/*1) Faça um programa que apresente um menu de opções para o cálculo das seguintes
operações entre dois números: adição, subtração, multiplicação e divisão. O
programa deve usar laços de repetição para possibilitar ao usuário a escolha da
operação desejada, a exibição do resultado e a volta ao menu de opções. O
programa só termina quando for escolhida a opção de saída.*/



public class ExercicioAdicional01{
    public static void main(String[]args) {

        boolean sair = false;

        System.out.println("----CALCULADORA JAVA----");
        while (sair == false) {
            double numb1 = Entrada.leiaDouble("Escolha o primeiro número:");
            double numb2 = Entrada.leiaDouble("Escolha o segundo número:");
            System.out.println("1- Adição;");
            System.out.println("2- Subtração;");
            System.out.println("3- Multiplicação;");
            System.out.println("4- Divisão;");
            System.out.println("5- Sair.");
            int escolha = Entrada.leiaInt("\n\nEscolha a opção desejada:");

            switch (escolha) {
                case 1:
                    System.out.println("O resultado da soma dos números é: " + (numb1 + numb2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração dos números é: " + (numb1 - numb2));
                    break;
                case 3:
                    System.out.println("O produto da multiplicação entre os números é: " + (numb1 * numb2));
                    break;
                case 4:
                    System.out.println("O quociente da divisão entre os números é: " + (numb1 / numb2));
                    break;
                case 5:
                    sair = true;
                    System.out.println("Calculadora desligada!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }
    }
}
