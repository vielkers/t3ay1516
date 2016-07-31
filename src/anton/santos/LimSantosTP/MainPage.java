package anton.santos.LimSantosTP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Anton on 7/28/2016.
 */
public class MainPage extends JPanel {

    public MainPage() {

        MainPage.setSize(1000,600);

        //Initial Items in PR
        //ArrayList<Items> itemlist = new ArrayList<Items>();
        //PRadd.itemlist.add(new Items("Red Foil", 2, "rolls", 50));
        //PRadd.itemlist.add(new Items("Silver Foil", 1, "rolls", 120));

        //Printing Current PR List
        viewPRListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //Print Function for "View PR"
                JOptionPane.showMessageDialog(null,
                        "Sun Gleam Items for Purchasing:\n\n" + PR.listItems(PRadd.itemlist),
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);

            }
            }
        );
        newPRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //Popout of new PR class
                    PRadd req = new PRadd();
                    req.add(new PRadd());
                    PRadd.main(new String[0]);

                }
        });
        newPOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    POadd.main(new String[0]);

                //Print Function for "View PR"



            }
        });
        viewPOListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Sun Gleam Items for Purchasing:\n\n" + PO.listPO(POadd.orderfinal),
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainPage");
        frame.setContentPane(new MainPage().MainPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton viewPRListButton;
    private JButton viewPOListButton;
    private JButton newPRButton;
    private JButton newPOButton;
    private JPanel MainPage;
    private JTextPane sunGleamIncPurchasingTextPane;
}
