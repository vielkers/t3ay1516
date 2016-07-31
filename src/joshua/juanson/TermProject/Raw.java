package tommy.lim.PROJECT;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Raw extends JFrame {
  private JPanel      panel;
  private JTable      table;
  private JScrollPane scrollPane;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    String[] columnNames= {"Number","Company","Material","Price"};
    String[][] data={   {"1", "Alloy Master Industrial", "Metal Sheet", "504.8"},
            {"2", "Asia Steel Corp.", "Metal Sheet", "478.5"},
            {"3", "Asia Steel Corp.", "Screws and Bolts", "316.5"},
            {"4", "Gold Industrial Gas", "Oxygen", "372.6"},
            {"5", "Linde Group", "Oxygen", "414.2"},
            {"6", "Air Liquide", "Oxygen", "379.7"},
            {"7", "Alloy Master Industrial", "Metal Pipes", "295.6"},
            {"8", "Wilmar Metal Products", "Metal Pipes", "276.7"},
            {"9", "Asia Steel Corp.", "Metal Pipes", "385.1"},
            {"10", "Alloy Master Industrial", "Metal Tubes", "1285.1"},
            {"11", "Wilmar Metal Products", "Metal Tubes", "1237.7"},
            {"12", "Asia Steel Corp.", "Metal Tubes", "1337.5"},
            {"13", "Alloy Master Industrial", "Screws and Bolts", "526.3"},
            {"14", "Wilmar Metal Products", "Screws and Bolts", "492.1"},
            {"15", "Bolt Depot", "Screws and Bolts", /*"463.9"*/}};



    public Raw(Eval eval) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object o= data[1][3];
                Float price =Float.parseFloat(o.toString());
                Raw r = new Raw(eval);



                switch(Integer.parseInt(textField1.getText().toString())){
                    case 1:price = Float.parseFloat(data[0][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 2:price = Float.parseFloat(data[1][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 3:price = Float.parseFloat(data[2][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 4:price = Float.parseFloat(data[3][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 5:price = Float.parseFloat(data[4][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 6:price = Float.parseFloat(data[5][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 7:price = Float.parseFloat(data[6][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 8:price = Float.parseFloat(data[7][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 9:price = Float.parseFloat(data[8][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 10:price = Float.parseFloat(data[9][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 11:price = Float.parseFloat(data[10][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 12:price = Float.parseFloat(data[11][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 13:price = Float.parseFloat(data[12][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 14:price = Float.parseFloat(data[13][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;
                    case 15:price = Float.parseFloat(data[14][3].toString()) * Float.parseFloat(textField2.getText().toString()); break;

                }

                JOptionPane.showMessageDialog(null,"total: "+ price);
                String evalLog = "Reference Number:"+textField1.getText().toString()+" Quantity:"+textField2.getText().toString()+" Total Amount:"+price.toString();


                eval.setData(evalLog);


            }
        });

    }

    public void init() throws HeadlessException {


    TableModel dataModel = new
      AbstractTableModel() {
        public int getColumnCount() {
          return 4;
        }

        public int getRowCount() {
          return 15;
        }

        public Object getValueAt(int row, int col) {
          return data[row][col];
        }

      };


    JTable myTable = new JTable(dataModel);
      for(int i=0;i<myTable.getColumnCount();i++) {
          TableColumn column1 = myTable.getTableHeader().getColumnModel().getColumn(i);
          column1.setHeaderValue(columnNames[i]);
      }
    myTable.setPreferredScrollableViewportSize(new Dimension(400, 100));
    scrollPane.setViewportView(myTable);
    setContentPane(panel);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
