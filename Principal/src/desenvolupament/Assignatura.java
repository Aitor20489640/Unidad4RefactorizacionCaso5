/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvolupament;

/**
 * Clase para crear assignaturas
 *
 * @author aitgal
 */
public class Assignatura {

    private long id = 0;
    private String nom = "";
    private int hores = 0;
    private int credits = 0;
    private boolean disponible = false;
    
    
    /**
     * Contructor con todos los atributos de la clase Assignatura
     * @param id Id de la asignatura
     * @param nom Nombre de la asignatura
     * @param hores Horas que hay que cursar de la asignatura
     * @param credits Creditos que da la asignatura
     * @param disponible Booleano para saber si la asignatura esta disponible
     */
    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
