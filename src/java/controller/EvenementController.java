/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Evenement;
import utils.VueModel;

/**
 *
 * @author tendr
 */
public class EvenementController {

    
    Evenement evenement;

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    public EvenementController(Evenement evenement) {
        this.evenement = evenement;
    }
    public EvenementController() {
    }
    
    @Annotation(link="listeEvenement")
     public VueModel liste() throws Exception{
       HashMap hm = new HashMap();
       Evenement eve= new Evenement();
       VueModel mv = new VueModel();
       hm.put("liste",eve.Liste());
       mv.setResult(hm);
       return mv;
    } 
     
    @Annotation(link="ajoutEvent") 
    public VueModel ajout() throws Exception {
        VueModel mv = new VueModel("accueilAdmin");
//        System.out.println(this.evenement.getLieu());
//        System.out.println(this.evenement.getDescription());
//        System.out.println(this.evenement.getDateDebut().getDate()+"/"+(this.evenement.getDateDebut().getMonth()+1)+"/"+(this.evenement.getDateDebut().getYear()+1900));
//        System.out.println(this.evenement.getDateFin());
//        System.out.println(this.evenement.getPathFichier());
        this.evenement.insert();
        return mv;
    }
}
