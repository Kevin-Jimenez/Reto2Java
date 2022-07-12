package Programa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Registro {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public Registro() {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    static Scanner sc = new Scanner(System.in);
    static String line;
    static  String [] s;
    public static void agregarEstudiante(){
        s = line.split("&");
        if (s[1].equals("Posgrado")){
            Posgrado pos = new Posgrado(s[2],s[3],s[4],s[5],s[6]);
            estudiantes.add(pos);
        }else{
            Pregrado pre = new Pregrado(s[2],s[3],s[4],s[5],s[6]);
            estudiantes.add(pre);
        }
        procesarComandos();
    }

    public static void listarEstudiantes(){
        ArrayList<Estudiante> response = new ArrayList<>();
        for(int i = 0; i < estudiantes.size(); i++){
            response.add(estudiantes.get(i));
        }
        String str = "";
        for (Estudiante l: response){
            str += l+"\n";
        }
        System.out.println(str);
        procesarComandos();
    }

    public static void procesarComandos(){
        line = sc.nextLine();
        s = line.split("&");
        String opcion = null;
        do {
            if (s[0].equals("1")) {
                opcion = "1";
            } else if (s[0].equals("2")) {
                System.out.println("\t\t*** Listado de estudiantes ***");
                opcion = "2";
            } else if (s[0].equals("3")) {
                opcion = "3";
            }
            switch (opcion){
                case "1":{
                    agregarEstudiante();
                    break;
                }
                case "2":{
                    listarEstudiantes();
                    break;
                }
                case "3":{
                    System.exit(0);
                    break;
                } default:{
                    System.out.println("No existe opcion");
                }
            }
        } while (!s[0].equals(3));
    }


    public static void main(String[] args) {
        procesarComandos();
    }
}