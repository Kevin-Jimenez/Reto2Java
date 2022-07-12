package Programa;

public class Pregrado extends Estudiante{
    private String cantidad_creditos;

    public Pregrado(String nombre, String edad, String programa, String tipo_etnia, String cantidad_creditos) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantidad_creditos = cantidad_creditos;
    }


    public String getCantidad_creditos() {
        return cantidad_creditos;
    }

    public void setCantidad_creditos(String cantidad_creditos) {
        this.cantidad_creditos = cantidad_creditos;
    }

    @Override
    public String toString() {
        return "\t\t\tEstudiante Pregrado\n"+super.toString()+
                "\t\t\tCreditos: " + cantidad_creditos;
    }
}
