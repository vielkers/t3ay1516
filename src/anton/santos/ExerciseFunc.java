package anton.santos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IE on 7/14/2016.
 */
public class ExerciseFunc {
    private JPanel panel1;
    private JButton fibonacciButton;
    private JButton primeButton;
    private JButton factorialButton;
    private JTextField textField1;

    public ExerciseFunc() {
        factorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Get the value in the text field and convert to integer
                int parsedInput = Integer.parseInt(textField1.getText());

                //Factorial Equation
                long fact = 1;
                while (parsedInput > 1) {
                    fact *= parsedInput;
                    parsedInput--;}
                //Print Dialog Box
                JOptionPane.showMessageDialog(null,
                         "Factorial Value = " + fact,
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        primeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Primality Start");
                //Get the value in the text field and convert to integer
                int parsedInput = Integer.parseInt(textField1.getText());

                //Solve factorial based on the input
                //long fact = Utilities.factorial(parsedInput);

                int maxNumber = parsedInput;
                String s = "";

                //int maxNumber = 1000;
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
                    //Insert factorial value in the dialog box

                }
                JOptionPane.showMessageDialog(null,
                        "Primality Start \n"+ s,
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);
                }


        });
        fibonacciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());
                int n1 = 0, n2 = 1, n3, i, count = parsedInput;
                String f = "";
                //System.out.println("Fibonacci Start");
                //System.out.println(n1);
                //System.out.println(n2);
                for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
                {
                    n3 = n1 + n2;
                    //System.out.println(n3);
                    f = f + "\n" + n3;
                    n1 = n2;
                    n2 = n3;
                }
                JOptionPane.showMessageDialog(null,
                        "Fibobancci Start \n"+ f,
                        "Title",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise Builder");
        frame.setContentPane(new ExerciseFunc().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
