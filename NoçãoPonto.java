package fundamentos;

public class NoçãoPonto {

    public static void main(String[] args) {

        // Uso do ponto para mostrar os possíveis met().

        String s = "Vamos para à praia";

        s = s.toUpperCase();
        s = s.concat(" de carro");
        s = s.toUpperCase();
        s = s.toLowerCase();

        System.out.println(s);

        String d = "Bom dia";

        d = d.toLowerCase();



        System.out.println(d);
        System.out.println(d.contains("cara"));

        String f = "Coperfield";

        f = f.toLowerCase();
        System.out.println("Vamos lá, %s ".formatted(f));




    }
}