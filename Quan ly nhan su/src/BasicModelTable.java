import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Objects;

public class BasicModelTable extends AbstractTableModel {
    private static final String[] COLUMN_NAMES = {"ID", "Full Name", "Salary"};

    private static final int MAX_ROW = 100;
    private ArrayList<Object[]> list = new ArrayList<>();

   // private Object[][] data = new Object[MAX_ROW][COLUMN_NAMES.length];

//    private int rowCount = 0;

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] rowdata = list.get(rowIndex);
        return rowdata[columnIndex];
    }

    public void addRow(Object[] rowData) {


        list.add((rowData));
        fireTableDataChanged();
    }
    public void Delete(int rowIndex){
    if (rowIndex!= - 1 && rowIndex<list.size()){
        list.remove(rowIndex);
        fireTableDataChanged();

    }
    }
    public void Update(int rowIndex){

    }
}
