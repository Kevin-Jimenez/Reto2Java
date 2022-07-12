package Programa;

public abstract class Estudiante {
    private String nombre;
    private String edad;
    private String programa;
    private String tipo_etnia;

    public Estudiante(String nombre, String edad, String programa, String tipo_etnia){
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTipo_etnia() {
        return tipo_etnia;
    }

    public void setTipo_etnia(String tipo_etnia) {
        this.tipo_etnia = tipo_etnia;
    }

    @Override
    public String toString() {
        return "\t\t\tNombre: " + nombre + "\n"+
                "\t\t\tEdad: " + edad +" anios\n"+
                "\t\t\tPrograma: " + programa + "\n" +
                "\t\t\tEtnia: " + tipo_etnia + "\n";
    }

}
