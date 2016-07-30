package tommy.lim.PROJECT;//package tommy.lim.PROJECT;//package jason.lau.Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.BorderFactory;
public class Login extends JFrame {


   JTextField Username,Password;
    JLabel username, password;
    JFrame frame = new JFrame("Login");
    JButton Login;
    public Login() {
    }

    private void init(){

        frame.setSize(250,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel(new GridBagLayout());
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        GridBagConstraints c = new GridBagConstraints();


        Username = new JTextField(10);
        username= new JLabel();
        password=new JLabel();
        c.gridx = 0;
        c.gridy = 1;
        username.setText("Input Username:");
        panel.add(username,c);
        c.gridx = -1;
        c.gridy = 1;
        panel.add(Username,c);


        Password= new JPasswordField(10);
        c.gridx = 0;
        c.gridy = 2;
        password.setText("Input Password:");
        panel.add(password,c);
        c.gridx = -1;
        c.gridy = 2;
        panel.add(Password,c);

        JButton loginInput = new JButton("Login");
        c.gridx = 1;
        c.gridy = 3;
        LoginButton logger=new LoginButton();
        loginInput.addActionListener(logger);
        panel.add(loginInput,c);





        frame.setVisible(true);

    }
    public static void main(String[] args){
        Login form = new Login();
        form.init();

    }
    class LoginButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            boolean logged=false;

                if(1==1){
                    JOptionPane.showMessageDialog(null,"Authentication Success! ");
                    MainMenu mainmenu = new MainMenu();
                    mainmenu.init();


                    frame.setVisible(false);


            }
            }

    }
}

