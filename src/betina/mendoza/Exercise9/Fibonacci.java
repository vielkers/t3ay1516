package betina.mendoza.Exercise9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by Betina Mendoza on 7/28/2016.
 */
public class Fibonacci {
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

                int limit = Integer.parseInt(txtInput.getText());

                int[] series = new int[limit];

                series[0] = 0;
                series[1] = 1;

                for(int i = 2; i < limit; i++){
                    series[i] = series[i-1] + series[i-2];
                }

              
                txtOutput.setText(Arrays.toString(series));

            }
        });
    }
}
