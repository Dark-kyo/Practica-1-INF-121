package Ejercicio5;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;
    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }
    public void mostrar() {
        System.out.println("Laboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
    }
    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
    public void cantidadMuebles(String extraInfo, boolean mostrar) {
        if (mostrar) {
            System.out.println(extraInfo + ": " + cantidadMuebles());
        }
    }
}
