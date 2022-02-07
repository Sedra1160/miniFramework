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
public class Mission {
    String NomAdmin;
    String Lieu;
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

    public String getLieu() {
        return Lieu;
    }

    public void setLieu(String Lieu) {
        this.Lieu = Lieu;
    }

    public String getContenu() {
        return Contenu;
    }

    public void setContenu(String Contenu) {
        this.Contenu = Contenu;
    }

    public Mission(String NomAdmin, String Lieu, String Contenu) {
        this.NomAdmin = NomAdmin;
        this.Lieu = Lieu;
        this.Contenu = Contenu;
    }

    public Mission() {
    }
    public Vector<Mission> Liste()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<Mission> v= new Vector<Mission>();

        try{
            java.sql.Statement state = con.createStatement();
            String req = "SELECT * FROM MISSION WHERE NOM= 'Rapport de mission'";
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                Mission mission = new Mission();
                mission.setContenu(result.getString("Contenu"));
                mission.setLieu(result.getString("Lieu"));
                mission.setNomAdmin(result.getString("NomAdmin"));
                mission.setNom(result.getString("Nom"));
               
                v.add(mission);
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
            req = "insert into detailContenu(idType,dateEcrit,contenu,lieu,idAdministrateur) values ('Type3',SYSDATE,'"+this.getContenu()+"','"+this.getLieu()+"','"+this.getNomAdmin()+"')";
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
