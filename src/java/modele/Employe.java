/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import util.Connexion;

/**
 *
 * @author tendr
 */
public class Employe {
    String id ;
    String nom ;
    String email;
    String mdp ;
    Connexion con = new Connexion();

    public Employe(String id, String nom, String email, String mdp) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
    }

    public Employe() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    public boolean logEmp()throws Exception{
        Connection conn = con.getConnection();
        try{
            java.sql.Statement state = conn.createStatement();
            String req = "SELECT * FROM Employe WHERE email='"+this.getEmail()+"' AND mdp='"+this.getMdp()+"'";
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                this.setId(result.getString("id"));
                this.setNom(result.getString("nom"));
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
        conn.close();
        }
        return false;
    }
     
    public void insert() throws Exception {
        Connection conn = con.getConnection();
        try{
            java.sql.Statement state = conn.createStatement();
            String req = "INSERT INTO Employe VALUES ('Emp'||id_Employe.NEXTVAL,'"+this.getNom()+"','"+this.getEmail()+"','"+this.getMdp()+"')";
            state.executeQuery(req);
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            conn.close();
        }
    }
}
