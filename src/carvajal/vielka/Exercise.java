package carvajal.vielka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IE on 7/14/2016.
 */
public class Exercise {
    private JButton Fibonacci;
    private JButton Prime;
    private JButton Factorial;
    private JTextField Field2;
    private JPanel Panel2;

    public Exercise() {
        Fibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Fibo = Integer.parseInt(Field2.getText());
                int n1 = 0, n2 = 1, n3, i, count = Fibo;
                String fiboOutput = "";
                fiboOutput = n1 +"\n" + n2;
                for (i = 2; i < count; ++i)
                {
                    n3 = n1 + n2;
                    fiboOutput = fiboOutput + "\n" + n3;
                    n1 = n2;
                    n2 = n3;
                }

                JOptionPane.showMessageDialog (null, "" + fiboOutput, "Fibonacci Answer", JOptionPane.PLAIN_MESSAGE);

            }
        });
        Prime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(Field2.getText());
                int maxNumber = parsedInput;
                String s = "";
                int x, y;
                int prime = 0;
                for (x = 1; x <= maxNumber; ++x) {
                    prime = x;
                    for (y = 2; y < x; y++) {
                        if (x % y == 0) {
                            prime = 0;
                        }
                    }
                    if (prime != 0) {
                        s = s + "\n" + prime;
                    }

                }
                JOptionPane.showMessageDialog(null, ""+ s, "Prime Answer", JOptionPane.PLAIN_MESSAGE);
            }
        });
        Factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Fact = Integer.parseInt(Field2.getText());
                long fact2 = 1;
                while (Fact > 1) {
                    fact2 *= Fact;
                    Fact--;
                }
                JOptionPane.showMessageDialog (null, "" + fact2, "Factorial Answer", JOptionPane.PLAIN_MESSAGE);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise");
        frame.setContentPane(new Exercise().Panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
