public class Isis {
    public static void main(String[] args) {
        System.out.println("Angelica");

        String name = "Juan";
        System.out.println(name);

        int numerito = 15;
        System.out.println(numerito);

        boolean falsito = false;
        System.out.println(falsito);
        char verdadero = 'v';
        System.out.println(verdadero + name);

        if (3 > 6) {
            System.out.println("Es verdadero");
        } else {
            System.out.println("Es falso");
        }

        if (falsito) {
            System.out.println(false);
        } else {
            System.out.println(verdadero);
        }

        int entero = 5;
        int enterito = 5;

        if (entero == enterito) {
            System.out.println("igualito");
        } else {
            System.out.println("Que te pasa llave");
        }

        if (entero!=enterito){
            System.out.println("enteritos");
        } else {
            System.out.println(entero+enterito);
        }

        if (!(enterito==entero)) {
            System.out.println("Holis");
        } else {
            System.out.println("Negando ando");
        }


        Angelica angelica = new Angelica();
        Angelica juan = new Angelica();

        juan.apodo = "Hola";

        System.out.println(juan.apodo);
        System.out.println(angelica.apodo);

    }


}
