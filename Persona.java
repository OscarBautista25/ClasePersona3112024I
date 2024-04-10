public class Persona {
    String nombre;
    String apellido;
    String identificacion;
    int anioNacimiento;

    public Persona(String nombre, String apellido, String identificacion, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.anioNacimiento = anioNacimiento;
    }
    
    public void imprimir(){
        System.out.println("Nombre = " +nombre);
        System.out.println("Apellido = " +apellido);
        System.out.println("Cedula de Ciudadania = " +identificacion);
        System.out.println("Año de nacimiento = " +anioNacimiento);
        
    }

    public double calcularEdad(){
        return 2024-anioNacimiento;
    }

    
}