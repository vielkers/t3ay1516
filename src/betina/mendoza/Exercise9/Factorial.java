package betina.mendoza.Exercise9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial {
    private JTextField txtInput;
    private JButton submitButton;
    private JTextField txtOutput;
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial");
        frame.setContentPane(new Factorial().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Factorial() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int num = Integer.parseInt(txtInput.getText());
                int ans = 1;


                while(num != 1){
                    ans = ans * num;
                    num--;
                }

                txtOutput.setText(String.valueOf(ans));
            }
        });
    }
}
