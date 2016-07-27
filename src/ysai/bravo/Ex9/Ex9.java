package ysai.bravo.Ex9;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by IE on 7/26/2016.
 */
public class Ex9 extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JButton factButton;
    private JButton fiboButton;
    private JButton primeButton;


    public Ex9() {

        factButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(textField1.getText());
                int m;
                int a = 1;

                if (n < 0)
                    JOptionPane.showMessageDialog(null, "Number should be non-negative!", "Factorial", JOptionPane.PLAIN_MESSAGE);
                else {
                    for(m=1; m<=n; m++)
                        a = a * m;

                    JOptionPane.showMessageDialog(null, n + "! = " + a, "Factorial Results", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });


        fiboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(textField1.getText());
                int X1 = 0, X2 = 1, xn, c;

                for (c = 0; c < n; c++) {
                    if (c <= 1)
                        xn = c;
                    else {
                        xn = X1 + X2;
                        X1 = X2;
                        X2 = xn;
                    }

                    int o = c+1;

                    JOptionPane.showMessageDialog(null, "#"+o + " term = " + xn, "Fibonacci Results", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        primeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(textField1.getText());
                int maxNumber = n;
                int i = 2;

                for (i = 2; i <= maxNumber; i++) {
                    if ((i == 2) || (i % 2 != 0)) {
                        int p = i;
                        for (int j = 2; j <= (1 / 2); j++) {
                            if (i % j == 0) {
                                p = 0;
                            }
                        }
                        if (p != 0) {
                            JOptionPane.showMessageDialog(null, p, "Primality test Results", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ex9");
        frame.setContentPane(new Ex9().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}