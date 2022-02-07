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
import util.Connexion;

/**
 *
 * @author tendr
 */
public class Globale {
        Date DateEcrit;
        String Contenu;
        Date DateDebut;
        Date DateFin;
        String Lieu;
        String PathFichier;
        String Description;
        String Nom;
        String NomAdmin;
        Connexion c = new Connexion();

    public Globale(Date DateEcrit, String Contenu, Date DateDebut, Date DateFin, String Lieu, String PathFichier, String Description, String Nom, String NomAdmin) {
        this.DateEcrit = DateEcrit;
        this.Contenu = Contenu;
        this.DateDebut = DateDebut;
        this.DateFin = DateFin;
        this.Lieu = Lieu;
        this.PathFichier = PathFichier;
        this.Description = Description;
        this.Nom = Nom;
        this.NomAdmin = NomAdmin;
    }

    public Globale() {
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

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date DateDebut) {
        this.DateDebut = DateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date DateFin) {
        this.DateFin = DateFin;
    }

    public String getLieu() {
        return Lieu;
    }

    public void setLieu(String Lieu) {
        this.Lieu = Lieu;
    }

    public String getPathFichier() {
        return PathFichier;
    }

    public void setPathFichier(String PathFichier) {
        this.PathFichier = PathFichier;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
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
    public Vector<Globale> Liste()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<Globale> v= new Vector<Globale>();

        try{
            java.sql.Statement state = con.createStatement();
            String req = "SELECT * FROM GLOBALE ORDER BY Nom";
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                Globale glo = new Globale();
                glo.setDateEcrit(result.getDate("DateEcrit"));
                glo.setContenu(result.getString("Contenu"));
                glo.setDateDebut(result.getDate("DateDebut"));
                glo.setDateFin(result.getDate("DateFin"));
                glo.setLieu(result.getString("Lieu"));
                glo.setPathFichier(result.getString("PathFichier"));
                glo.setDescription(result.getString("Description"));
                glo.setNom(result.getString("Nom"));
                glo.setNomAdmin(result.getString("NomAdmin"));
               
                v.add(glo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
        con.close();
        }
        return v;
    }
    
    public Vector<Globale> Recherche() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<Globale> v= new Vector<Globale>();
        try{
            java.sql.Statement state = con.createStatement();
            String req="";
            String lie="";
            String nom="";
            String noma="";
            String req1 = "SELECT * FROM GLOBALE WHERE";
            String and= " AND ";
            if(this.getNom()!=null&&!this.getNom().isEmpty()){
                nom =" Nom like '%"+this.getNom()+"%'";
            }
            if(this.getLieu()!=null&&!this.getLieu().isEmpty()){
                if(this.getNom()!=null&&!this.getNom().isEmpty()){
                    lie =" and Lieu like '%"+this.getLieu()+"%'";
                } else lie =" Lieu like '%"+this.getLieu()+"%'"; 
            }
            if(this.getNomAdmin()!=null&&!this.getNomAdmin().isEmpty()){
                if(this.getNom()!=null&&!this.getNom().isEmpty()) {
                    noma =" and NomAdmin like '%"+this.getNomAdmin()+"%'";
                } else if(this.getLieu()!=null&&!this.getLieu().isEmpty()){ 
                    noma =" and NomAdmin like '%"+this.getNomAdmin()+"%'";
                } else noma =" NomAdmin like '%"+this.getNomAdmin()+"%'";

            }

            req=req1+nom+lie+noma;
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                Globale glo = new Globale();
                glo.setDateEcrit(result.getDate("DateEcrit"));
                glo.setContenu(result.getString("Contenu"));
                glo.setDateDebut(result.getDate("DateDebut"));
                glo.setDateFin(result.getDate("DateFin"));
                glo.setLieu(result.getString("Lieu"));
                glo.setPathFichier(result.getString("PathFichier"));
                glo.setDescription(result.getString("Description"));
                glo.setNom(result.getString("Nom"));
                glo.setNomAdmin(result.getString("NomAdmin"));
                v.add(glo); 
                }
                
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
        con.close();
        }
        return v;
    }
    
}
