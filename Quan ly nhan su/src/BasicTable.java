import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicTable extends JFrame{
    private JPanel rootPanel;
    private JPanel Nv_Panel;
    private JTextField txtF_ID;
    private JTextField txtF_fullname;
    private JTextField txtF_Salary;
    private JButton btn_Add;
    private JTable table1;
    private JButton btn_delete;
    private JButton btn_update;

    public BasicTable() {
        setTitle("Basic Table" );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(800, 600));
        pack();

        BasicModelTable model = new BasicModelTable();
        table1.setModel(model);
        table1.setPreferredSize(new Dimension(800,600));
        model.addRow(new String[]{"01", "ABC", "1000"});
        btn_Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txtF_ID.getText();
                String fullname = txtF_fullname.getText();
                String Salary = txtF_Salary.getText();
                model.addRow(new String[]{id,fullname,Salary});
            }
        });
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int SelectRowIndex = table1.getSelectedRow();
                if(SelectRowIndex != -1){
                    model.Delete(SelectRowIndex);
                }
            }
        });
        btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[]args){
        BasicTable jframe = new BasicTable();
        jframe.setVisible(true);
    }
}
