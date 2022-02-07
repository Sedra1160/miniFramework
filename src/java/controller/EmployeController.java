/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Employe;
import utils.VueModel;

/**
 *
 * @author tendr
 */
public class EmployeController {
    Employe employe;

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    @Annotation(link="ajoutEmp")
    public VueModel formAjout() throws Exception {
        VueModel vm = new VueModel();
        if(this.employe!=null) {
            this.employe.insert();
            vm.setUrl("accueilAdmin");
        }

        return vm;
    }
    
    @Annotation(link="loginEmp")
    public VueModel login() throws Exception {
        VueModel vm = new VueModel();
        HashMap hm = new HashMap();
        if(this.employe.logEmp()) {
            hm.put("session",this.employe.getId());
            vm.setResult(hm);
            vm.setUrl("listeGlobale");
        } else {
            vm.setUrl("../index.jsp?error=0");
        }
        return vm;
    }
}
