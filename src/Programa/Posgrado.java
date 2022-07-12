package Programa;

public class Posgrado extends Estudiante{
    private String modalidad;

    public Posgrado(String nombre, String edad, String programa, String tipo_etnia, String modalidad) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "\t\t\tEstudiante Posgrado\n"+super.toString()+
                "\t\t\tModalidad: " + modalidad;
    }
}
