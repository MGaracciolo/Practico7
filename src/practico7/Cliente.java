package practico7;

public class Cliente {

    private String nombre;
    
    private String apellido;

    private String ciudad;

    private String direccion;
    
    private long dni;

    public Cliente() {
    }
    
    public Cliente(String nombre, String apellido, String ciudad, String direccion, long dni) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.ciudad=ciudad;
        this.direccion=direccion;
        this.dni=dni;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad=ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" "+apellido+"\nDNI: "+dni+"\nDomicilio: "+direccion+", "+ciudad+"\n";
    }
    
    
    
}
