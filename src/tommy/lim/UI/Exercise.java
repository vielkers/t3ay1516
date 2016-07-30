package tommy.lim.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IE on 7/14/2016.
 */
public class Exercise extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise");
        frame.setContentPane(new Exercise().Exercise);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel Exercise;
    private JButton PrimeButton;
    private JButton FactorialButton;
    private JButton FibonacciButton;
    private JTextField ValueField;

    public Exercise() {
        FactorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(ValueField.getText());

                long fact = Utility.Factorial(parsedInput);

                JOptionPane.showMessageDialog(null, "" + fact, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        PrimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(ValueField.getText());

                String prm = Utility.Prime(parsedInput);

                JOptionPane.showMessageDialog(null, "" + prm, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        FibonacciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(ValueField.getText());

                String fibo = Utility.Fibonacci(parsedInput);

                JOptionPane.showMessageDialog(null, "" + fibo, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }


}
