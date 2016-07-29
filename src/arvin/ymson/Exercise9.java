package arvin.ymson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arvin_000 on 7/29/2016.
 */
public class Exercise9 {
    private JButton factorialButton;
    private JButton fibonacciButton;
    private JButton primeButton;
    private JTextField Input;
    private JPanel Exercise9;
    private JTextField output;

    public Exercise9() {
        fibonacciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(Input.getText());
                int a1 = 1, a2 = 1, a3, i;
                String answer = "";

                if (input == 1) {
                    answer = "1";
                } else if (input == 2) {
                    answer = "1 1";
                } else {
                    answer = "1 1";
                    System.out.println(a1 + "" + a2);
                    for (i = 3; i <= input; i++) {
                        a3 = a1 + a2;

                        answer = answer + " " + a3;
                        a1 = a2;
                        a2 = a3;
                    }
                }
                output.setText(answer);
            }

        });
        factorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(Input.getText());
                int answer = 1;
                for (int i = input; i >= 1; i--) {

                    answer = answer * i;
                }
                output.setText(Integer.toString(answer));
            }
        });

        primeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int parsedInput = Integer.parseInt(Input.getText());
                int maxNumber = parsedInput;
                String answer = "";
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
                        answer = answer + " " + prime;
                    }

                }
                output.setText(answer);

            }
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise9");
        frame.setContentPane(new Exercise9().Exercise9);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}