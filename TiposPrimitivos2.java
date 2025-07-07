package fundamentos;

public class TiposPrimitivos2 {


public static void main(String[] args) {

        // informações de funcionário

        byte anosDeEmpresa = 25;
        short numerosDeVoo = 455;
        int in = 54632;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numéricos reais
        float salario = 11_455.44f;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false;

        // tipo de caractere
        char status = 'A';

        // INSTÂNCIAS/USO APOS A INICIALIZAÇÃO

        // numeros de viagens
        System.out.println("A quantidade de viagens é de " + numerosDeVoo / 2);

        // dias de empresa
        System.out.println("Os dias de empresa desse funcionáio foram de " + anosDeEmpresa * 365 + ".");

        // A identificação do funcionário
        System.out.println("A identificação do funcionário é " + in + ".");

        // Pontuação do funcionário
        System.out.println("A pontuação do funcioário é " + pontosAcumulados + ".");

        // Salário
        System.out.println("O salário dele é " + salario + ".");

        // Quantidade de vendas acumuladas
        System.out.println("Vendas acumuladas, no total de  " + vendasAcumuladas + ".");

        // Está de férias
        System.out.println("Ele está de férias: " + estaDeFerias + ".");

        // Qual o status atual
        System.out.println("O status atual dele é " + status + ".");

        // Pontos acumulados
        System.out.println("Pontos acumulados por vendas: " + pontosAcumulados / vendasAcumuladas + ".");

        // Referência
        System.out.println(in + " ganha ---> " + salario + ".");


    }
}