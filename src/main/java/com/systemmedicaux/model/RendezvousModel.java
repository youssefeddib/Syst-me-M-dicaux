package model;

import java.sql.Time;
import java.util.Date;

public class RendezVous {
    private int id;
    private Date date;
    private Time heure;
    private String motif;
    private String statut;

    public RendezVous(int id, Date date, Time heure, String motif, String statut) {
        this.id = id;
        this.date = date;
        this.heure = heure;
        this.motif = motif;
        this.statut = statut;
    }

    public int getId() { return id; }
    public Date getDate() { return date; }
    public Time getHeure() { return heure; }
    public String getMotif() { return motif; }
    public String getStatut() { return statut; }

    public void setDate(Date date) { this.date = date; }
    public void setHeure(Time heure) { this.heure = heure; }
    public void setMotif(String motif) { this.motif = motif; }
    public void setStatut(String statut) { this.statut = statut; }
}
