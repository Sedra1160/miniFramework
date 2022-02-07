/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author tendr
 */
public class NoteInterne {
    String NomAdmin;
    Date DateEcrit;
    String Contenu;
    String Nom;

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getNomAdmin() {
        return NomAdmin;
    }

    public void setNomAdmin(String NomAdmin) {
        this.NomAdmin = NomAdmin;
    }

    public Date getDateEcrit() {
        return DateEcrit;
    }

    public void setDateEcrit(Date DateEcrit) {
        this.DateEcrit = DateEcrit;
    }

    public String getContenu() {
        return Contenu;
    }

    public void setContenu(String Contenu) {
        this.Contenu = Contenu;
    }

    public NoteInterne(String NomAdmin, Date DateEcrit, String Contenu) {
        this.NomAdmin = NomAdmin;
        this.DateEcrit = DateEcrit;
        this.Contenu = Contenu;
    }

    public NoteInterne() {
    }
    
    
     public Vector<NoteInterne> Liste()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<NoteInterne> v= new Vector<NoteInterne>();

        try{
            java.sql.Statement state = con.createStatement();
            String req = "SELECT * FROM NOTEINTERNE WHERE NOM= 'Note interne'";
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                NoteInterne note = new NoteInterne();
                note.setDateEcrit(result.getDate("DateEcrit"));
                note.setContenu(result.getString("Contenu"));
                note.setNomAdmin(result.getString("NomAdmin"));
                note.setNom(result.getString("Nom"));
               
                v.add(note);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
        con.close();
        }
        return v;
    }
     
    public void insert() throws Exception {
        String req = "";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "TestFramework", "mdpprom13");
        try {
            req = "insert into detailContenu(idType,dateEcrit,contenu,idAdministrateur) values ('Type4',SYSDATE,'"+this.getContenu()+"','"+this.getNomAdmin()+"')";
            System.out.println(req);
            java.sql.Statement state = con.createStatement();
            state.executeQuery(req);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
}
