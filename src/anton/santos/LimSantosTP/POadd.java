package anton.santos.LimSantosTP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Anton on 7/29/2016.
 */
public class POadd extends JPanel{



    static ArrayList<Supplier> orderfinal = new ArrayList<>();
    static ArrayList<Items> transfer = new ArrayList<>();
    ArrayList<Items>checkPR;

    public POadd() {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int POinput1 = Integer.parseInt(textField1.getText());
                int POinput2 = Integer.parseInt(textField2.getText());
                String POinput3 = textField3.getText();
                String POinput4 = textField4.getText();
                Float POinput5 = Float.parseFloat(textField5.getText());
                Float TotCost;
                for (int i = 0; i < PR.prNumCount; i++) {


                    //Method to remove from PR and add to PO, Also a checker if PR exists
                if(POinput1==PRCheck.CheckPR.get(i)){
                        TotCost = POinput5*PRCheck.PriceCalc.get(i);
                        orderfinal.add(new Supplier(POinput2, POinput3, POinput4,TotCost,PRCheck.PriceCalc.get(i),PRCheck.ItemName.get(i),PRCheck.CheckPR.get(i)));
                        PO.poNumCount++;
                         PRCheck.CheckPR.put(i,0);
                }

}          }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("POadd");
        frame.setContentPane(new POadd().POadd);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel POadd;
    private JTextPane PRNumberTextPane;

    private JTextPane supplierNameTextPane;
    private JTextPane costPerPieceTextPane;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField2;
    private JTextField textField4;
    private JButton createButton;
    private JTextPane supplierAddressTextPane;
    private JTextPane supplierIDTextPane;

}
