/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Globale;
import utils.VueModel;

/**
 *
 * @author tendr
 */
public class GlobaleController {
       Globale globale;

    public GlobaleController(Globale globale) {
        this.globale = globale;
    }

    public GlobaleController() {
    }

    public Globale getGlobale() {
        return globale;
    }

    public void setGlobale(Globale globale) {
        this.globale = globale;
    }
    @Annotation(link="listeGlobale")
    public VueModel liste() throws Exception{
       HashMap hm = new HashMap();
       Globale glo= new Globale();
       VueModel mv = new VueModel();
       hm.put("liste",glo.Liste());
       mv.setResult(hm);
//       mv.setUrl("liste");
       return mv;
    }
    
    @Annotation(link="recherche")
    public VueModel recherche() throws Exception{
        HashMap hm = new HashMap();
        VueModel mv = new VueModel();
        return mv;
    }
    
    @Annotation(link="resultat")
    public VueModel resultat() throws Exception{
        HashMap hm = new HashMap();
        VueModel mv = new VueModel("resultat");
        if(this.globale!=null) {
            hm.put("resultatrecherche",this.globale.Recherche());
            mv.setResult(hm);
        }
        return mv;
    } 
}
