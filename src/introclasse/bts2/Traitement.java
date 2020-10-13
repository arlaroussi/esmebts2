
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introclasse.bts2;

import java.lang.*;
import java.util.*;
/**
 *
 * @author rlaroussi
 */
public class Traitement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Personnage avatar1 = new Personnage( "Luke" , false , 3 ) ;
       System.out.println(avatar1.toString());
       
       Personnage sherif = new Personnage("Patt Garet",true,7);
       Personnage horsLaLoi = new Personnage("Billy le Kid",true,3);
       
       String nomSherif = sherif.getNom();
       String nomHLL = horsLaLoi.getNom();
       
       if (sherif.estPlusFatigue(horsLaLoi) == true ) 
           System.out.println(nomSherif + " est plus fatigué que " + nomHLL);
       else
           System.out.println(nomSherif + " est moins fatigué que " + nomHLL);
       
       
       //Création d'une liste
       
       ArrayList liste = new ArrayList<Personnage>();
       
       liste.add(sherif);
       liste.add(horsLaLoi);
       
       for (Object pers : liste) {
            System.out.println(pers.toString());
       }
       
}
}
   