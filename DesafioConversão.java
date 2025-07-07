package fundamentos;

import java.util.Scanner;

public class DesafioConversão {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu 1° salário: ");
        String salario = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o seu 2° salário: ");
        String salario2 = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o seu 3° salário: ");
        String salario3 = entrada.nextLine().replace(",", ".");

        double sal1 = Double.parseDouble(salario);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);


        Double mediasal = (sal1 + sal2 + sal3) / 3;


        System.out.println("A média dos seus 3 salários é R$" + mediasal + ".");

        entrada.close();


        //Conversão

        Double c = 4342.5767;
        String d = c.toString();
        System.out.println(d);



    }
}