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

/**
 *
 * @author tendr
 */
public class Admin {
    String Id;
    String Nom;
    String Identifiant;
    String Mdp;
    String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    public String getIdentifiant() {
            return this.Identifiant;
    }

    public void setIdentifiant(String Identifiant) {
            this.Identifiant = Identifiant;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getMdp() {
        return this.Mdp;
    }

    public void setMdp(String Mdp) {
        this.Mdp = Mdp;
    }
    public Admin(){

    }
    public Admin(String Nom,String Mdp,String Identifiant){
        this.setNom(Nom);
        this.setMdp(Mdp);
        this.setIdentifiant(Identifiant);
    }



      public boolean logAdmin() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<Admin> v= new Vector<Admin>();

        try{
            java.sql.Statement state = con.createStatement();
            String req = "SELECT * FROM Admin WHERE email='"+this.getEmail()+"' AND mdp='"+this.getMdp()+"'";
            System.out.println(req);
            ResultSet result = state.executeQuery(req);
            
                while(result.next()) {
                    this.setId(result.getString("id"));
                    this.setNom(result.getString("nomadmin"));
                    return true;
                }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
        con.close();
        }
        return false;
        

    }

}

