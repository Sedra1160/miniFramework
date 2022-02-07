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
public class Evenement {
     Date DateDebut;
     Date DateFin;
     String Lieu;
     String Description;
     String Nom;
     String PathFichier;
     String NomAdmin;

    public String getNomAdmin() {
        return NomAdmin;
    }

    public void setNomAdmin(String NomAdmin) {
        this.NomAdmin = NomAdmin;
    }

    public Evenement() {
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

    public String getPathFichier() {
        return PathFichier;
    }

    public void setPathFichier(String PathFichier) {
        this.PathFichier = PathFichier;
    }

    public Evenement(Date DateDebut, Date DateFin, String Lieu, String Description, String Nom, String PathFichier) {
        this.DateDebut = DateDebut;
        this.DateFin = DateFin;
        this.Lieu = Lieu;
        this.Description = Description;
        this.Nom = Nom;
        this.PathFichier = PathFichier;
    }
    public Vector<Evenement> Liste()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TestFramework","mdpprom13");
        con.setAutoCommit(false);
        Vector<Evenement> v= new Vector<Evenement>();

        try{
            java.sql.Statement state = con.createStatement();
            String req = "SELECT * FROM EVENEMENT WHERE NOM= 'Evenement'";
            ResultSet result = state.executeQuery(req);
            while(result.next()) {
                Evenement evenmt = new Evenement();
                evenmt.setDateDebut(result.getDate("DateDebut"));
                evenmt.setDateFin(result.getDate("DateFin"));
                evenmt.setLieu(result.getString("Lieu"));
                evenmt.setPathFichier(result.getString("PathFichier"));
                evenmt.setDescription(result.getString("Description"));
                evenmt.setNom(result.getString("Nom"));
                
               
                v.add(evenmt);
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
        String debut = "";
        String fin = "";
        if(this.getDateDebut().getMonth()<10) {
            if(this.getDateDebut().getDate()<10) debut = (this.getDateDebut().getYear()+1900)+"/0"+(this.getDateDebut().getMonth()+1)+"/0"+this.getDateDebut().getDate();
            else debut = (this.getDateDebut().getYear()+1900)+"/0"+(this.getDateDebut().getMonth()+1)+"/"+this.getDateDebut().getDate();
        } else debut = (this.getDateDebut().getYear()+1900)+"/"+(this.getDateDebut().getMonth()+1)+"/"+this.getDateDebut().getDate();
        if(this.getDateFin().getMonth()<10) {
            if(this.getDateFin().getDate()<10) fin = (this.getDateFin().getYear()+1900)+"/0"+(this.getDateFin().getMonth()+1)+"/0"+this.getDateFin().getDate();
            else fin = (this.getDateFin().getYear()+1900)+"/0"+(this.getDateFin().getMonth()+1)+"/"+this.getDateFin().getDate();
        } else fin = (this.getDateFin().getYear()+1900)+"/"+(this.getDateFin().getMonth()+1)+"/"+this.getDateFin().getDate();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "TestFramework", "mdpprom13");
        try {
            req = "insert into detailContenu(idType,dateEcrit,dateDebut,dateFin,description,pathFichier,lieu,idAdministrateur) values ('Type2',SYSDATE,TO_DATE('"+debut+"','yyyy/mm/dd'),TO_DATE('"+fin+"','yyyy/mm/dd'),'"+this.getDescription()+"','"+this.getPathFichier()+"','"+this.getLieu()+"','"+this.getNomAdmin()+"')";
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
