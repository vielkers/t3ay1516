package instructor.ui;

import instructor.solutions.Ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
  private JPanel mainPanel;
  private JPanel west;
  private JPanel east;
  private JPanel south;
  private JButton button1;
  private JLabel nLabel;
  private JTextField n;

  public UserInterface() {
    super("Main Interface");
    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Ex1 e1 = new Ex1();

        int val = Integer.parseInt(n.getText());
        if (val <= 0) {
          System.out.println("Invalid number. Only positive nos. allowed.");
        } else {
          int currentProduct = 1;

          while (val > 1) {
            currentProduct = currentProduct * val;
            val--;
          }
          JOptionPane.showMessageDialog(null, n.getText() + "! = " + currentProduct, "Value",
              JOptionPane.PLAIN_MESSAGE);
        }
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("User Interface Demo");
    frame.setContentPane(new UserInterface().mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
