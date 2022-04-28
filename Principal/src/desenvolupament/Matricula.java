/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvolupament;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase para crear matriculas
 *
 * @author aitgal
 */
public class Matricula {
    
    private static final int COSTECREDITOS = 15;

    public long id = 0;
    private Estudiante persona;
    private int curs = 0;
    private Collection assignatures;

    public Matricula() {
    }

    public Matricula(long id, Estudiante persona, int curs, Collection assignatures) {
        this.id = id;
        this.persona = persona; 
        this.curs = curs;
        this.assignatures = assignatures;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return persona.getNom();
    }

    public void setNom(String nom) {
        this.persona.setNom(nom);
    }

    public String getCognoms() {
        return persona.getCognom();
    }

    public void setCognoms(String cognoms) {
        this.persona.setCognom(cognoms);
    }

    public String getDni() {
        return persona.getDni();
    }

    public void setDni(String dni) {
        this.persona.setDni(dni);
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public Collection getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(Collection assignatures) {
        this.assignatures = assignatures;
    }

    /**
     * Metodo para calcular el coste de la matricula
     *
     * @return Devuelve el coste de la matricula
     */
    public float costMatricula() {

        float cost;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * COSTECREDITOS;
        return cost;
    }
}
