/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Globale;
import modele.Pv;
import utils.VueModel;

/**
 *
 * @author tendr
 */
public class PvController {
    Pv pv;
    
     public Pv getPv() {
        return pv;
    }

    public void setPv(Pv pv) {
        this.pv = pv;
    }
    
     public PvController(Pv pv) {
        this.pv = pv;
    }

    public PvController() {
    }
    @Annotation(link="listePv")
     public VueModel liste() throws Exception{
       HashMap hm = new HashMap();
       Pv pv= new Pv();
       VueModel mv = new VueModel();
       hm.put("liste",pv.Liste());
       mv.setResult(hm);
       return mv;
    } 
     
    @Annotation(link="ajoutPv")
    public VueModel ajout() throws Exception {
        VueModel mv = new VueModel("accueilAdmin");
        this.pv.insert();
        return mv;
    }
}
