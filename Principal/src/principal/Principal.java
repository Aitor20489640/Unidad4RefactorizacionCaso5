/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import desenvolupament.*;
import java.util.ArrayList;

/**
 * Clase principal del programa
 *
 * @author aitgal
 */
public class Principal {

    /**
     * Metodo principal del programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matricula matricula1;
        ArrayList<Assignatura> listaAssignatura = new ArrayList();
        String nomAssig = "Assignatura ";
        Estudiante persona = new Estudiante(1, "20489640K", "Aitor", "Rodriguez");
        int hores = 3, credits = 5;
        boolean disponible = true;
        
        //For para añadir asignaturas a la lista
        for (int i = 1; i <= 5; i++) {
            listaAssignatura.add(new Assignatura(i, nomAssig + i, hores, credits, disponible));
        }

        matricula1 = new Matricula(1, persona, 5, listaAssignatura);

        System.out.print("Cost de la matricula " + matricula1.costMatricula());

    }

}
