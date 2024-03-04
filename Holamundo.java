package Com_acme;

public class Holamundo {


    public static void main(String[] args) {
        System.out.println("hola mundo");
        Mensaje msg=new Mensaje();
        String nombre=msg.solictaDatos("escribe tu nombrte: ");
        msg.saludar(nombre);

    }

}
