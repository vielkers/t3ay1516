package keith.lim.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kiiiiibble on 7/20/2016.
 */
public class Numbers extends JFrame {
    private JPanel thePanel;
    private JTextField valueField;
    private JButton factorialButton;
    private JButton fibonacciButton;
    private JButton primeButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Numbers");
        frame.setContentPane(new keith.lim.UI.Numbers().thePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public Numbers() {
        factorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(valueField.getText());

                int fact = Utilities.factorial(parsedInput);
                JOptionPane.showMessageDialog(null, "" + fact, "Factorial of " + parsedInput, JOptionPane.INFORMATION_MESSAGE);

            }
        });

        fibonacciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int parsedInput = Integer.parseInt(valueField.getText());

                int fib = Utilities.fibonacci(parsedInput);
                JOptionPane.showMessageDialog(null, "" + fib, "Fibonacci number of " + fib, JOptionPane.INFORMATION_MESSAGE);

            }
        });

        primeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(valueField.getText());

                String primes = Utilities.prime(parsedInput);
                JOptionPane.showMessageDialog(null, primes, "List of primes until " + parsedInput, JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }
}
