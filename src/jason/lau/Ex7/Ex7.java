package jason.lau.Ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jason on 7/18/2016.
 */

public class Ex7 extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ex7");
        frame.setContentPane(new Ex7().Ex7);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton Fibonacci;
    private JButton Prime;
    private JButton Factorial;
    private JTextField Input;
    private JPanel Ex7;

    public Ex7() {
        Factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(Input.getText());

                long fact = Source.Factorial(parsedInput);

                JOptionPane.showMessageDialog(null, "" + fact, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        Prime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(Input.getText());

                String prm = Source.Prime(parsedInput);

                JOptionPane.showMessageDialog(null, "" + prm, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Fibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(Input.getText());

                String fibo = Source.Fibonacci(parsedInput);

                JOptionPane.showMessageDialog(null, "" + fibo, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}