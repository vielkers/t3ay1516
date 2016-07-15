package ryna.bato.Ex9;

import ryna.bato.UIDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rynabato on 7/14/2016.
 */

public class ex9 {
    private JButton Factorial;
    private JButton Fibonacci;
    private JButton Prime;
    private JTextField textField1;
    private JPanel exercise9;

    public ex9() {
        Factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c, fact=1;
                int n = Integer.parseInt(textField1.getText());

                if (n<0)
                    System.out.println("Number should be non-negative");
                else{
                    for (c=1; c<=n; c++)
                        fact = fact*c;

                    JOptionPane.showMessageDialog(null, "" + fact, "Factorial", JOptionPane.PLAIN_MESSAGE);
                }

                //JOptionPane.showMessageDialog(null, "" + n, "Factorial", JOptionPane.PLAIN_MESSAGE);
                //JOptionPane.showMessageDialog(null, "Hello.", "Title of Dialog Box", JOptionPane.PLAIN_MESSAGE);
            }
        });
        Fibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m=1;
                int prev, next, sum;
                int count = Integer.parseInt(textField1.getText());

                prev=next=1;

                while (m<=count){
                    JOptionPane.showMessageDialog(null, "" + prev, "Fibonacci", JOptionPane.PLAIN_MESSAGE);
                    sum=prev+next;
                    prev=next;
                    next=sum;
                    m++;
                }
                //JOptionPane.showMessageDialog(null, "" + prev, "Fibonacci", JOptionPane.PLAIN_MESSAGE);
            }
        });
        Prime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i=0;
                int number=0;
                String primeNum="";
                int maxNumber = Integer.parseInt(textField1.getText());

                for(i=1; i<=maxNumber; i++){
                    int counter=0;
                    for(number=i; number>=1; number--){
                        if(i%number==0){
                            counter=counter+1;
                        }
                    }
                    if(counter==2){
                        primeNum=primeNum + i + " ";
                    }
                }
                JOptionPane.showMessageDialog(null, "" + primeNum, "Prime", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Ex9");
        frame.setContentPane(new ex9().exercise9);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
