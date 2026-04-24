/*2) Faça um programa que apresente o menu de opções a seguir, que permita ao
usuário escolher a opção desejada, receba os dados necessários para executar a
operação e mostre o resultado. Verificar a possibilidade de opção inválida.
Menu de opções:
1. Novo salário
2. Férias
3. Décimo terceiro
4. Sair
Digite a opção desejada:

Na opção 1: receber o salário de um funcionário, calcular e mostrar o novo
salário, usando as regras a seguir.
Salários Percentagem de aumento
Até R$ 1.500,00 15%
De R$ 1.500,00 a R$ 3.000,00 10%
Acima de R$ 3.000,00 5%

Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor de
suas férias. Sabe-se que as férias equivalem ao seu salário, acrescido de l/3.

Na opção 3: receber o salário de um funcionário e o número de meses de trabalho
na empresa, no máximo 12, calcular e mostrar o valor do décimo terceiro. Sabe-
se que o décimo terceiro equivale ao seu salário, multiplicado pelo número de
meses de trabalho, dividido por 12.

Na opção 4: sair do programa.*/

public class ExercicioAdicional02{
    public static void main (String[] args){
        boolean sair = false;

        double salario = Entrada.leiaDouble("Digite o seu salário: ");
        while(sair == false){
            System.out.println("\n\n\nMENU DE OPÇÕES: ");
            System.out.println("1. Novo Salário: ");
            System.out.println("2. Férias: ");
            System.out.println("3. Décimo Terceiro: ");
            System.out.println("4. Sair: ");
            int escolha = Entrada.leiaInt("Escolha a opção desejada: ");

            switch (escolha){
                case 1:
                    double novoSalario = 0;
                    System.out.println("Seu salário original era: R$" + salario);
                    if(salario <= 1500){
                        novoSalario = salario + (salario*0.15);
                    }else if(salario > 1500 && salario <= 3000){
                        novoSalario = salario + (salario*0.1);
                    }else if(salario > 3000){
                        novoSalario = salario + (salario*0.05);
                    }
                    System.out.printf("Seu novo saláro após o aumento é de: R$ %.2f", novoSalario);
                    salario = novoSalario;
                    break;
                case 2:
                    double valorFerias = 0;
                    valorFerias = salario + (salario/3);
                    System.out.printf("O valor de suas férias é de: R$ %.2f", valorFerias);
                    break;
                case 3:
                    double decimoTerceiro = 0;
                    int meses = Entrada.leiaInt("Digite o número de meses trabalhados no ano(máximo 12): ");
                    if (meses > 12 || meses <= 0){
                        System.out.println("VALOR INVÁLIDO");
                    }
                    decimoTerceiro = salario*meses/12;
                    System.out.printf("O valor do seu Décimo Terceiro é de: R$ %.2f", decimoTerceiro);
                    break;
                case 4:
                    sair = true;
                    System.out.println("*----PROGRAMA ENCERRADO!----*");
                    break;
                default:
                    System.out.println("ERRO! OPÇÃO INVÁLIDA!");
            }
        }
    }
}
