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
    
    private static final int COSTE_CREDITO = 15;

    private long id = 0;
    private Estudiante persona;
    private int curs = 0;
    private Collection assignatures;
    
    /**
     * Constructor por defecto de la clase Matricula
     */
    public Matricula() {
    }
    
    
    /**
     * Contructor con todos los atributos de la clase Matricula
     * @param id Id de la matricula
     * @param persona Estudiante que entrega la matricula
     * @param curs Curso al que asiste el estudiante
     * @param assignatures Lista de asignaturas que va a cursar el estudiante
     */
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

    public Estudiante getPersona() {
        return persona;
    }

    public void setPersona(Estudiante persona) {
        this.persona = persona;
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
            credits = credits + element.getCredits();
        }

        cost = credits * COSTE_CREDITO;
        return cost;
    }
}
