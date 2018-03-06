/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author clement
 */
public class Algo_tp_pyramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        if (sc.hasNextInt()) {
            int hauteur = sc.nextInt();
            
            // Tant que le principal est inférieur à la hauteur
            for (int principal = 0; principal < hauteur; principal++) {
                // Espace est inférieur à la hauteur - la boucle principal
                for (int espace = 0; espace < hauteur - principal; espace++) {
                    // On affiche l'espace
                    System.out.print("b");
                }
                // L'etoile est inférieur à 2 x la boucle principal
                for (int etoile = 0; etoile <= 2 * principal; etoile++) {
                    // On l'affiche l'étoile
                    System.out.print("*");
                }
                // Retour à la ligne après chaque ligne
                System.out.println("");
            }
        }        
    }
    
}
