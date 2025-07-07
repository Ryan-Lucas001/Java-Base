package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Para que o úsuario coloque seus dados 

        System.out.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe outro número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String operaçao = entrada.next();

        // Lógica

        double resultado = "+".equals(operaçao) ? num1 + num2 : 0;

        resultado = "-".equals(operaçao) ? num1 - num2 : resultado; // : = caso contrario


        resultado = "/".equals(operaçao) ? num1 / num2 : resultado;

        resultado = "%".equals(operaçao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operaçao, num2, resultado);

        entrada.close();

    }
}