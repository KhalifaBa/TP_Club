package Entities;

public class SportRelais extends Sport
{
    private int distance;

    public SportRelais(String nomSport, int nbJoueurs,int distance) {
        super(nomSport, nbJoueurs);
        this.distance = distance;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Distance = " + distance;
    }

    public int getDistance() {
        return distance;
    }
}
