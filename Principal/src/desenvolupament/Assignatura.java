/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvolupament;

/**
 *
 * @author aitgal
 */
public class Assignatura {

    public long id = 0;
    private String nom = "";
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;


    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    
    
    
}
