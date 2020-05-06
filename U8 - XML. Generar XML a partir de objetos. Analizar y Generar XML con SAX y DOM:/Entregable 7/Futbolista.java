package Tarea7;

import java.util.ArrayList;

public class Futbolista {
    private  int id;
    private String nombre;
    private String equipo;
    private ArrayList<Estadistica> stats;

    public Futbolista(int id, String nombre, String equipo, ArrayList<Estadistica> stats) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.stats = stats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Estadistica> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Estadistica> stats) {
        this.stats = stats;
    }


    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", stats=" + stats +
                '}';
    }
}
