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

    private String dni = "";
    private String nom = "";
    private String cognom = "";
    private int edad = 5;//Asumimos que la edad minima para matricularse es 5 años

    public Estudiante() {
    }

    public Estudiante(String dni, String nom, String cognom, int edad) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
