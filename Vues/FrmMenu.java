package Vues;

import Entities.Club;
import Entities.Sport;
import Entities.SportBallon;
import Entities.SportRelais;

import javax.swing.*;
import java.util.ArrayList;

public class FrmMenu  extends JFrame{
    private JPanel pnlRoot;

    private ArrayList<Club> lesClubs;

    public FrmMenu()
    {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setContentPane(pnlRoot);
        this.setTitle("Les Clubs");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        // Les Clubs
        Club c1 = new Club(1,"Dijon",63);
        Club c2 = new Club(2,"PSG",75);
        Club c3 = new Club(3,"Nantes",83);

        // Les Sports
        SportBallon sb = new SportBallon("Basketball",5,45,35);

        c1.AjouterSport(sb);

        // PSG
        Sport s1 = new Sport("Javelot", 1);
        Sport s2 = new Sport("Judo", 2);
        SportBallon sb1 = new SportBallon("Football",11,105,68);
        SportBallon sb2 = new SportBallon("Handball",7,65,35);
        SportRelais sr1 = new SportRelais("4 * 100",4,400);

        c2.AjouterSport(s1);
        c2.AjouterSport(s2);
        c2.AjouterSport(sb1);
        c2.AjouterSport(sb2);
        c2.AjouterSport(sr1);

        Sport s3 = new Sport("Cyclisme",1);
        SportBallon sb3 = new SportBallon("Football",11,105,68);
        SportBallon sb4 = new SportBallon("Rugby",15,115,65);
        SportRelais sr2 = new SportRelais("100 m",1,100);

        c3.AjouterSport(s3);
        c3.AjouterSport(sb3);
        c3.AjouterSport(sb4);
        c3.AjouterSport(sr2);


        lesClubs.add(c1); lesClubs.add(c2); lesClubs.add(c3);

    }
}
