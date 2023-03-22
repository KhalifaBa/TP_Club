package Entities;

import java.util.ArrayList;

public class Club implements Comparable<Club>{

   private ArrayList<Sport> lesSports;
   private int idClub;
   private String nomClub;
   private int nbPoint;

    public Club(int idClub, String nomClub, int nbPoint) {
        this.idClub = idClub;
        this.nomClub = nomClub;
        this.nbPoint = nbPoint;
        this.lesSports = new ArrayList<>();
    }

    public void AjouterSport(Sport unSport)
    {
        lesSports.add(unSport);
    }

    @Override
    public int compareTo(Club o) {
        return Integer.compare(o.nbPoint,this.nbPoint);
    }

    public ArrayList<Sport> getLesSports() {
        return lesSports;
    }

    public int getIdClub() {
        return idClub;
    }

    public String getNomClub() {
        return nomClub;
    }

    public int getNbPoint() {
        return nbPoint;
    }
}
