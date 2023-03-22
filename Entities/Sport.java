package Entities;

public class Sport implements ISport, ISportCollectif
{
    protected String nomSport;
    protected int nbJoueurs;


    public Sport(String nomSport, int nbJoueurs) {
        this.nomSport = nomSport;
        this.nbJoueurs = nbJoueurs;
    }


    @Override
    public String getDescription() {
        return "Sport = " + nomSport + " Nombre de joueur" + nbJoueurs ;
    }

    @Override
    public String getNomSport() {
        return nomSport;
    }

    @Override
    public int getNbJoueurs() {
        return nbJoueurs;
    }
}
