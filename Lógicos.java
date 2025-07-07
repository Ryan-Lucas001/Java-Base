package fundamentos.operadores;

public class LogicosJava {

    public static void main(String[] args) {

        boolean condicao1 = true; // verdadeiro 
        boolean condicao2 = 3 > 7; // falso 

        // Para mostrar a Tabela verdade

        System.out.println(condicao1 && condicao2); // && = comercial 

        System.out.println(condicao1  condicao2); //  = ou 

        System.out.println(condicao1 ^ condicao2); // ^ = ou exclusivo 

        System.out.println(!condicao1); // && = comercial 


        // Tabela Verdado E

        // && Operador binario 

        System.out.println(true && true);
        System.out.println(true && false);
        //System.out.println(false && true ); // Dead cod 
        //System.out.println(false && false );

        // Tabela verdade OU 

        //   Operador binario 

        //System.out.println(true  true);
        //System.out.println(true  false);
        System.out.println(false  true ); // Dead cod 
        System.out.println(false || false );

        // Tabela verdade OU EXCLUSIVO (xor)

        // ^ Operador Unario

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true ); // Dead cod 
        System.out.println(false ^ false );





    }

}