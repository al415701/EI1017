package Estructura;

import Exepciones.NoDataException;

import java.util.ArrayList;
import java.util.List;

public class TableWithLabels extends Table{
    public TableWithLabels(){
        super();
    }

    @Override
    public RowWithLabels getRowAt(int rowNumber) {
        return (RowWithLabels) super.getRowAt(rowNumber);
    }


    @Override
    public String toString() {
        String tmp = "";
        tmp += super.getAllHeaders();
        for (int i =0; i < super.size(); i++) {
            RowWithLabels row = (RowWithLabels)  super.getRowAt(i);
            tmp += ("\n" + row);
        }
        return tmp;
    }
}
