package fundamentos;

import java.util.Scanner ;

public class console {



    //console

    public static void main(String[] args) {


            // cadastro 

            Scanner entrada = new Scanner(System.in);

            System.out.println("Olá, Seja Bem-vindo!\n");

            System.out.print("Digite o seu nome: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a sua idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite a sua id: ");
            int id = entrada.nextInt();

            System.out.print("Digite o seu cartão: ");
            int cartao = entrada.nextInt();

            System.out.print("\nVerifique os seus dados.");

            //organização de dados

            System.out.printf("\nNome --> %s\nIdade --> %d\nId --> %d\nCartão --> %s.",
                    nome, idade, id, cartao);


            // anos de empresa

            System.out.print("\n\nQuantos anos de traballho no empresa: ");
            int anosEmpresa = entrada.nextInt();

            int diasEmpresa = anosEmpresa * 365;

            System.out.printf("Que legal!!\n%d anos correspondem a %d dias de empresa, parabéns!",
                    anosEmpresa, diasEmpresa);

            entrada.close();







        }

    }