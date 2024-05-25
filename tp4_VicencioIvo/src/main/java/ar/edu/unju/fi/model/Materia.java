package ar.edu.unju.fi.model;

public class Materia {
    private String codigo;
    private String nombre;
    private int anio;
    private int semestre;
    private String modalidad;
    private Docente docente;
    private Carrera carrera;

    // Constructor
    public Materia(String codigo, String nombre, int anio, int semestre, String modalidad, Docente docente, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
        this.semestre = semestre;
        this.modalidad = modalidad;
        this.docente = docente;
        this.carrera = carrera;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
