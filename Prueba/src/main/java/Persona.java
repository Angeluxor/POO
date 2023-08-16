public class Persona {

    private int DNI;

    private String nombre;

    private int edad;

    private String pais;

    public Persona(int DNI, String nombre, int edad, String pais) {
    }

    public Persona() {
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + '}';
    }

    
  
 
}
