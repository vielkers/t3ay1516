package instructor.ui;

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

  public static void main(String[] args) {
    JFrame frame = new JFrame("UserInterface");
    frame.setContentPane(new UserInterface().mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

  public UserInterface() {
    super("Main Interface");
    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Value in textbox: " + n.getText());
      }
    });
  }
}
