package fundamentos;

import java.util.Scanner;

public class TipoString {
	

	public static void main(String[] args) {

        // Primeiro teste com entrada de usuário


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite qual o seu salário: ");
        int salario = scanner.nextInt();


        System.out.println("Olá %s, a sua idade é %d.\nO seu salario é %d"
                .formatted(nome, idade, salario));


        System.out.println("Nome --> %s\nIdade --> %d\nSalário --> %d."
                .formatted(nome, idade, salario));

        scanner.close();


        // segundo teste
        Scanner scanner1 = new Scanner(System.in);

        //nome
        System.out.println("Digite o seu nome: ");
        String nome1 = scanner1.nextLine();

        //idade
        System.out.println("Qual a sua idade: ");
        int idade1 = scanner1.nextInt();

        //salario
        System.out.println("Qual o seu salario: ");
        double salario1 = scanner1.nextDouble();

        //id
        System.out.println("Qual o seu id: ");
        int id = scanner1.nextInt();

        //finalização

        System.out.println("Nome: %s.\nIdade: %d.\nSalário: %d.0f\nID: %s."
                .formatted(nome1, idade1, salario1, id));

        scanner1.close();
// calculo de media anual 

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner2.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scanner2.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = scanner2.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double n4 = scanner2.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Media de " + media);

        scanner2.close();

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Qual mes voce faz aniversario: ");
        String mes = scanner.nextLine();

        System.out.println("Que massa que você faz aniversário em " + mes + ".");

        scanner3.close();

        // 4 instancia

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("cálculo de média anual.\n");

        System.out.println("Digite a primeira nota: ");
        double n11 = scanner4.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n22 = scanner4.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n33 = scanner4.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double n44 = scanner4.nextDouble();

        double media11 = (n11 + n22 + n33 + n44) / 4;

        // exibição
        
        System.out.printf("As notas anuais resultaram em uma média de %d."
                .formatted(media11));

        scanner4.close();

}

	}