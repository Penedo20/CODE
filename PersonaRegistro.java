package Com_acme;

public class PersonaRegistro {
    public record personaRegistro(String nombre, String apellidos){

        @Override
        public String toString(){
            return "%s %s".formatted(nombre,apellidos);
        }
    }
}
