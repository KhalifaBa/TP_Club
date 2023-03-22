package Tools;

import Entities.Club;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] nomColonnes;
    private Object[][] ligneDatas;


    @Override
    public int getRowCount() {
        return ligneDatas.length;
    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return ligneDatas[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nomColonnes[column];
    }

    public void LoadDataClubs(ArrayList<Club> lesClubs)
    {
        nomColonnes = new String[]{"Numéro","Nom","Nombre de points"};
        ligneDatas = new Object[lesClubs.size()][3];
        int i = 0;

        for (Club clb : lesClubs)
        {
            ligneDatas[i][0] = clb.getIdClub();
            ligneDatas[i][1] = clb.getNomClub();
            ligneDatas[i][2] = clb.getNbPoint();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadDataSports(){}

}
