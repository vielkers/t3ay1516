package joshua.juanson.FinalVersionsExercises.Exercise9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Exercise9GUI extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise");
        frame.setContentPane(new Exercise9GUI().Exercise9GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel Exercise9GUI;
    private JButton primalityTestButton;
    private JButton fibonacciSequenceButton;
    private JButton factorialButton;
    private JTextField textField1;

    public Exercise9GUI() {
        factorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());

                long fact = Operations.Factorial(parsedInput);

                JOptionPane.showMessageDialog(null, "" + fact, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        primalityTestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());

                String primenumber = Operations.Prime(parsedInput);

                JOptionPane.showMessageDialog(null, "" + primenumber, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        fibonacciSequenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(textField1.getText());

                String fibo = Operations.Fibo(parsedInput);

                JOptionPane.showMessageDialog(null, "" + fibo, "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }


}