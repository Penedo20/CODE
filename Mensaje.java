package Com_acme;

import java.util.Scanner;

public class Mensaje {

    private Object persona;

    public String solictaDatos(String mensaje){
        System.out.println(mensaje);
        Scanner scn=new Scanner(System.in);
        return scn.nextLine();
    }

    public String saludar(String nombre){
        System.out.println("hola %s, benvido a java");
        return nombre;
    }
}
