package Entities;

public class SportBallon extends Sport implements ITerrain
{
    private int longueur;
    private int largueur;

    public SportBallon(String nomSport, int nbJoueurs,int longueur, int largueur) {
        super(nomSport, nbJoueurs);
        this.largueur = largueur;
        this.longueur = longueur;
    }

    @Override
    public int getLongueur() {
        return longueur;
    }

    @Override
    public int getLargueur() {
        return largueur;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription() +  " Longueur = " + longueur + " Largueur = " + largueur;
    }
}
