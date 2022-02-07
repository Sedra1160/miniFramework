/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Admin;
import modele.Globale;
import utils.VueModel;

/**
 *
 * @author tsill
 */
public class AdminController {
    Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    @Annotation(link="accueilAdmin")
    public VueModel accueil() {
        VueModel mv = new VueModel();
        return mv;
    }
    
    @Annotation(link="listeAdmin")
    public VueModel liste() throws Exception {
        VueModel mv = new VueModel();
        Globale globale = new Globale();
        HashMap hm = new HashMap();
        hm.put("liste", globale.Liste());
        mv.setResult(hm);
        return mv;
    }
    
   
    
    @Annotation(link="LoginAdmin")
    public VueModel login() throws Exception {
        VueModel vm = new VueModel();
        HashMap hm = new HashMap();
        if(this.admin.logAdmin()) {
            hm.put("session",this.admin.getId());
            hm.put("nom", this.admin.getNom());
            vm.setResult(hm);
            vm.setUrl("accueilAdmin");
        } else {
            vm.setUrl("../loginAdmin.jsp?error=0");
        }
        
        return vm;
    }
}
