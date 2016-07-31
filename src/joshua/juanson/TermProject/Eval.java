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
public class Eval extends JFrame {
    private JPanel      panel;
    private JScrollPane scrollPane;
    private JButton button1;
    private JTextArea textArea1;
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
            {"15", "Bolt Depot", "Screws and Bolts", "463.9"}};

        String[] log={"","","","","","","","","","",
                      "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","",""};


        public void setData(String s){
        int i=0;

        for (i = 0; i < 100; i++) {
                try {
                    if (this.log[i].equals("")) {
                        this.log[i] = s;
                        i = 100;

                    }
                }
                catch(NullPointerException e){

            }

    }
}
        public String getData(int i) {
                return this.log[i];
        }

    public Eval() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"total: ");

            }
        });

    }
    public Eval(String s){
        setData(s);
    }

    public void init() throws HeadlessException {

        scrollPane.setViewportView(textArea1);
        setContentPane(panel);
        textArea1.setText("");
        try {
            for (int i=0; i<100; i++){
                if (!log[i].equals("")){

                    textArea1.append(getData(i) + "\n");

                }
                else;
            }
        }
        catch (NullPointerException e){};
        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args){
        Eval form = new Eval();
        form.init();

    }

}
