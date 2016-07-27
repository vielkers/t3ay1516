package src.matthew.reyes.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by victorreyes on 14/07/2016.
 */
public class UI extends JFrame {
    private JPanel Panel1;
    private JButton imPrettyCoolButton;
    private JTextField textField1;
    private JButton primeButton;
    private JButton factorialButton;

    public UI() {
        imPrettyCoolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());
                int n1 = 0, n2 = 1, n3, i, count = parsedInput;
                String fib = "";
                //System.out.println("Fibonacci Start");
                //System.out.println(n1);
                //System.out.println(n2);
                fib = n1 +"\n" + n2;
                for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
                {
                    n3 = n1 + n2;
                    //System.out.println(n3);
                    fib = fib + "\n" + n3;
                    n1 = n2;
                    n2 = n3;
                }

                JOptionPane.showMessageDialog(null,
                        "" + fib,
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        primeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());
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
                        //System.out.println(prime);
                        s = s + "\n" + prime;
                    }
                    JOptionPane.showMessageDialog(null,
                            "" + prime,
                            "Title",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        factorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());
                long fact = 1;
                while (parsedInput > 1) {
                    fact *= parsedInput;
                    parsedInput--;}
                JOptionPane.showMessageDialog(null,
                        "" + fact,
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("UI");
        frame.setContentPane(new UI().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
    }
}
