package Com_acme;

public class persona {
    private String nombre, apellidos;

    public persona (String nombre,String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    public String getnombre(){
        return nombre;
    }
    public void getnombre(String nombre){
        this.nombre=nombre;
    }
    public void getapellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
}
