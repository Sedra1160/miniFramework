/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Globale;
import modele.Mission;
import utils.VueModel;

/**
 *
 * @author tendr
 */
public class MissionController {

    public MissionController() {
    }
    Mission mission;

    public MissionController(Mission mission) {
        this.mission = mission;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }
     @Annotation(link="listeMission")
     public VueModel liste() throws Exception{
       HashMap hm = new HashMap();
       Mission mis= new Mission();
       VueModel mv = new VueModel();
       hm.put("liste",mis.Liste());
       mv.setResult(hm);
       return mv;
    } 
     
    @Annotation(link="ajoutMission")
    public VueModel ajout() throws Exception {
        VueModel vm = new VueModel("accueilAdmin");
        this.mission.insert();
        return vm;
    }
}
