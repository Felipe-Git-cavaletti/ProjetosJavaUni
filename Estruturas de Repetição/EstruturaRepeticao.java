/*30) FUP que receba o nome e a idade de 6 pesso*/

    import java.util.Scanner;

        public class EstruturaRepeticao {
            public static void main(String[]args) {
                Scanner digite = new Scanner(System.in);
                 int idadeMaisNova = 999;
                 int idadeMaisVelha = 0;
                 String nomeMaisNova = "";
                 String nomeMaisVelha = "";

                for (int i = 0; i <= 5; i ++){
                    System.out.println("Digite o seu nome: ");
                    String nome = digite.nextLine();

                    System.out.println("Digite a sua idade: ");
                    int idade = digite.nextInt();
                    digite.nextLine();

                    System.out.println("Nome: " + nome + "\nIdade: " + idade);//Exibe o nome e a idade da pessoa.

                    if (idade < idadeMaisNova) {
                        nomeMaisNova = nome;
                        idadeMaisNova = idade;
                    }//Verifica se a idade é maior que a idade mais velha, caso seja, armazena o nome e a idade da pessoa mais velha.

                    if (idade > idadeMaisVelha) {
                        nomeMaisVelha = nome;
                        idadeMaisVelha = idade;
                    }//Verifica se a idade é menor que a idade mais nova, caso seja, armazena o nome e a idade da pessoa mais nova.

                }

                System.out.println("A pessoa mais velha é: " + nomeMaisVelha + ". Ele(a) possuí " + idadeMaisVelha + " anos.");//Exibe o nome e a idade da pessoa mais velha.
                System.out.println("A pessoa mais nova é: " + nomeMaisNova + ". Ele(a) possuí " + idadeMaisNova + " anos.");//Exibe o nome e a idade da pessoa mais nova.

                digite.close();
            }

        }