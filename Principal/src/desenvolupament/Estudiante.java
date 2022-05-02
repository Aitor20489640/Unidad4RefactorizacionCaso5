/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvolupament;

/**
 * Clase para crear Estudiantes
 *
 * @author aitgal
 */
public class Estudiante {
    
    private long id = 0;//Ponemos id a Estudiante porque lo tienen matricula y assignatura
    private String dni = "";
    private String nom = "";
    private String cognom = "";
    
    /**
     * Constructor por defecto para la clase Estudiante
     */
    
    public Estudiante() {
    }
    
    /**
     * Contructor con todos los atributos de la clase Estudiante
     * @param id ID del Estudiante
     * @param dni DNI del Estudiante
     * @param nom Nombre del Estudiante
     * @param cognom Apellidos del Estudiante
     */
    public Estudiante(long id, String dni, String nom, String cognom) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

}
