package anton.santos.LimSantosTP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Anton on 7/28/2016.
 */
public class PRadd extends JPanel{

    //Item List is Static for it to be universal
    static ArrayList<Items> itemlist = new ArrayList<>();
    static ArrayList<PR> PRsum = new ArrayList<>();
    static String department;
    int FinalPR;

    public PRadd() {
        requestOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String PRinput1 = textField1.getText();
                float PRinput2 = Float.parseFloat(textField2.getText());
                String PRinput3 = textField3.getText();
                String PRinput4 = textField4.getText();

                department = PRinput4;
                itemlist.add(new Items(PRinput1, PRinput2, PRinput3));
                PRsum.add(new PR(itemlist,PRinput4));




            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PRadd");
        frame.setContentPane(new PRadd().PRadd);
        frame.pack();
        frame.setVisible(true);




    }

    public JPanel PRadd;
    //Text Field Values
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;


    private JTextPane desiredItemTextPane;
    private JTextPane quantityToBeOrderedTextPane;
    private JTextPane unitOfMeasureTextPane;
    private JButton requestOrderButton;
    private JTextPane requestingDepartmentTextPane;


}
