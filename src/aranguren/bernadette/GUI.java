package aranguren.bernadette;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
    private JPanel GUIexercise;
    private JTextField textField1;
    private JButton Factorial;
    private JButton fibonacciButton;
    private JButton primeButton;

    public GUI() {
        Factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());
                int n = parsedInput;
                int m = n;
                int a = 1;
                String b = "";

                while(n > 1) {
                    a = a * n;
                    n--;
                }
                b = a + "\n";

                JOptionPane.showMessageDialog (null, "Factorial\n" + b, "Title", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        fibonacciButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());

                int n = parsedInput, x1 = 0, x2 = 1, a = 0, b = 1, xn, c;
                String f = "";

                for ( c = 0 ; c < n ; c++ )
                {
                    if ( c <= 1 )
                        xn = c;
                    else
                    {
                        xn = x1 + x2;
                        f = f + "\n" + xn;
                        x1 = x2;
                        x2 = xn;
                    }

                }

                JOptionPane.showMessageDialog(null, "Fibonacci" + "\n" + a+ "\n" + b + f, "Title", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        primeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int parsedInput = Integer.parseInt(textField1.getText());
                int maxNumber = parsedInput;
                String m = "";

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
                        m = m + "\n" + prime;
                    }
                }

                JOptionPane.showMessageDialog(null, "Prime"+ m, "Title", JOptionPane.INFORMATION_MESSAGE);



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Exercise");
        frame.setContentPane(new GUI().GUIexercise);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

