package fundamentos.operadores;

public class Aritimeticos {
    public static void main(String[] args) {

    System.out.println(2 + 3);

    var x = 34.56;
    double y = 2.2;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);

    int a = 8;
    int b = 3;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / (double)b); // Em divisão de valores inteiros o resultavo vai ser inteiro

    // Foi usado um (double) ou (float) para o resultado da divisão dar um valor inteiro 

    System.out.println(8 % 3);
    System.out.println(a % b); // pode usar as váriaveis ao inves dos números 

    System.out.println(x + y - a * b); // Tem uma presedencia pela múltiplicação iniciar primeiro








}

}