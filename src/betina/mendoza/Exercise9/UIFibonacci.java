// TODO: Fix errors
/*
package betina.mendoza.Exercise9;

import betina.mendoza.Exercise2.Fibonacci;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class UIFibonacci {
    private JTextField txtInput;
    private JTextField txtOutput;
    private JButton submitButton;
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fibonacci");
        frame.setContentPane(new Fibonacci().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Fibonacci() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //get input from user
                int limit = Integer.parseInt(txtInput.getText());

                //create int array for the fibonacci series based on user input
                int[] series = new int[limit];

                //create first 2 series elements
                series[0] = 0;
                series[1] = 1;

                //create the Fibonacci series and store it in an array
                for(int i = 2; i < limit; i++){
                    series[i] = series[i-1] + series[i-2];
                }

                //convert int array to string array
                txtOutput.setText(Arrays.toString(series));

            }
        });
    }
}
*/
