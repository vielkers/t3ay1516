package carvajal.vielka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IE on 7/14/2016.
 */
public class GUI extends JFrame {
    private JPanel panelOne;
    private JButton uselessButton;
    private JTextField textField1;

    public GUI() {
        uselessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());
                int output = parsedInput*2;
                /**long fact = Utilities.factorial();  make utilities java string factorial, fibonacci, Prime*/
               JOptionPane.showMessageDialog (null, "" + output, "Title", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Useless Me");
        frame.setContentPane(new GUI().panelOne);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
