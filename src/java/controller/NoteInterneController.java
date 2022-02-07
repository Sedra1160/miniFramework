/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import annotation.Annotation;
import java.util.HashMap;
import modele.Globale;
import modele.NoteInterne;
import utils.VueModel;

/**
 *
 * @author tendr
 */
public class NoteInterneController {
    NoteInterne noteInterne;

    public NoteInterne getNoteInterne() {
        return noteInterne;
    }

    public void setNoteInterne(NoteInterne noteinterne) {
        this.noteInterne = noteinterne;
    }

    public NoteInterneController(NoteInterne noteinterne) {
        this.noteInterne = noteinterne;
    }

    public NoteInterneController() {
    }
     @Annotation(link="listeNote")
     public VueModel liste() throws Exception{
       HashMap hm = new HashMap();
       NoteInterne note= new NoteInterne();
       VueModel mv = new VueModel();
       hm.put("liste",note.Liste());
       mv.setResult(hm);
       return mv;
    } 
     
    @Annotation(link="ajoutNote")
    public VueModel ajout() throws Exception {
        VueModel mv = new VueModel("accueilAdmin");
        this.noteInterne.insert();
        return mv;
    }
}
