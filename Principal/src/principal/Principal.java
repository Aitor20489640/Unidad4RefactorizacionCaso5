/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import desenvolupament.*;
import java.util.ArrayList;

/**
 *
 * @author aitgal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matricula matricula1 = new Matricula();
        ArrayList<Assignatura> lista = new ArrayList();
        
        
        System.out.print("Cost de la matricula " + matricula1.costMatricula());
        
    }

}
