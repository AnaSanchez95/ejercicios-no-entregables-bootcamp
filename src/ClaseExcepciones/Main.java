package ClaseExcepciones;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = null;
        try {
            registrar(usuario);
        } catch (Exception e){
        }


    }
    public static void registrar(Usuario usuario) throws Exception {
        if(usuario.getEmail() == null){
            throw new Exception("Email obligatorio");
        }
        System.out.println("Registrar");
    }
}
class Usuario{
    private String email;
    private String nombre;
    private String apellido;
    private  String telefono;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
