package Com_acme;

import java.util.Scanner;

public class Mensaje {

    public String solictaDatos(String mensaje){
        System.out.println(mensaje);
        Scanner scn=new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String nombre){
        System.out.println("hola %s, benvido a java");
    }
}
