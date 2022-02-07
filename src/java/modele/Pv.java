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
public class Pv {
    Date DateEcrit;
    String Contenu;
    String PathFichier;
    String Nom;
    String NomAdmin;

    public Pv(Date DateEcrit, String Contenu, String PathFichier, String Nom, String NomAdmin) {
        this.DateEcrit = DateEcrit;
        this.Contenu = Contenu;
        this.PathFichier = PathFichier;
        this.Nom = Nom;
        this.NomAdmin = NomAdmin;
    }

    public Pv() {
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

    public String getPathFichier() {
        return PathFichier;
    }

    public void setPathFichier(String PathFichier) {
        this.PathFichier = PathFichier;
    }

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
    public Vector<Pv> Liste()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<Pv> v= new Vector<Pv>();

        try{
            java.sql.Statement state = con.createStatement();
            String req = "SELECT * FROM PV WHERE NOM= 'PV'";
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                Pv pv = new Pv();
                pv.setDateEcrit(result.getDate("DateEcrit"));
                pv.setContenu(result.getString("Contenu"));
                pv.setPathFichier(result.getString("PathFichier"));
                pv.setNom(result.getString("Nom"));
                pv.setNomAdmin(result.getString("NomAdmin"));              
                v.add(pv);
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
            req = "insert into detailContenu(idType,dateEcrit,contenu,pathFichier,idAdministrateur) values ('Type1',SYSDATE,'"+this.getContenu()+"','"+this.getPathFichier()+"','"+this.getNomAdmin()+"')";
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
