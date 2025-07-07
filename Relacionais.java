package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {


        double nota = 7.0;

        boolean bomComportamento = false;

        boolean passouPorMédia = nota >= 7; // nota tem que ser maio ou igual a 7

        boolean temDesconto = bomComportamento && passouPorMédia; 

        System.out.println("Tem desconto ?" + temDesconto);

    }
}