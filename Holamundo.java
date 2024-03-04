package Com_acme;

public class Holamundo {
    static int Persona;


    public static void main(String[] args) {
        System.out.println("hola mundo");
        Mensaje msg=new Mensaje();
        String nombre=msg.solictaDatos("escribe tu nombre: ");
        String apellidos= msg.solictaDatos("Escribe tus apellidos: ");
        persona p1=new persona(nombre,apellidos);
        msg.saludar(String.valueOf(p1));

    }

}
