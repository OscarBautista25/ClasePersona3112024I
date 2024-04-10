public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", "1234567", 1988);
        System.out.println("Datos Persona 1");
        persona1.imprimir();
        System.out.println("La edad de la persona 1 es " +persona1.calcularEdad() + " años");
        Persona persona2 = new Persona("Maria", "López", "7654321", 1993);
        System.out.println("Datos Persona 2");
        persona2.imprimir();
        System.out.println("La edad de la persona 2 es " +persona2.calcularEdad() + " años");
    }
}
