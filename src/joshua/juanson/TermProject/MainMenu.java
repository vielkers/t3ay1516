package tommy.lim.PROJECT;//package tommy.lim.PROJECT;//package jason.lau.Project;

import javax.swing.*;
import java.awt.event.*;


/**
 * Created by Jason on 7/25/2016.
 */
public class MainMenu extends JFrame {
    private JButton CreateQuotation;
    private JButton View;
    private JButton RequestRawMats;
    private JPanel MainMenu;
    JFrame frame = new JFrame("MainMenu");
    Eval eval=new Eval();

    public MainMenu() {

        CreateQuotation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quotation PO = new Quotation(eval);
                PO.init(eval);

            }
        });
        RequestRawMats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raw raw = new Raw(eval);
                raw.init();

            }
        });
        View.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                eval.init();
            }
        });}

    public void init(){
        frame.setSize(300,300);
        frame.setContentPane(new MainMenu().MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
