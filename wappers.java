package fundamentos;

public class Wrappers {
    public static void main(String[] args) {

        //Wrappers

        //--> São conjuntos dod tipos primitivos que podem exercerem comportamentos
        // --> Assim como os Objetos naturais do Java

        //São eles:

        //int ---> Integer

        Integer a = 435;
        System.out.println(a.toString());
        System.out.println("Integer por ser um wrapper de int foi possível converter em string.\n\n");


        //byte ---> Byte

        Byte b = 34;
        System.out.println(b.toString());
        System.out.println("Mesmo princípio.\n\n");


        //short ---> Short

        Short c = 567;
        System.out.println(c.toString());
        System.out.println("Também/n/n");


        //long ---> Long

        Long d = (long) 65433456;
        System.out.println(d.toString());

        //float ---> Float

        Float e = 34.5f;
        System.out.println(e.toString());


        //char ---> Character

        Character f = 'f';
        System.out.println(f.toString().toUpperCase());

        //boolean ---> Boolean

        Boolean g = Boolean.parseBoolean("true");
        System.out.println(g.toString().toUpperCase());

        //double ---> Double

        Double h = 4534.675;
        System.out.println(h.toString());

        //Foram os 8 tipos primtivos.









    }

}