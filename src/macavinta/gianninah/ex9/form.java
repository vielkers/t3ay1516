package macavinta.gianninah.ex9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IE on 7/29/2016.
 */
public class form {
    private JButton Factorial;
    private JButton Fibonacci;
    private JButton Prime;
    private JTextField textField1;
    private JPanel form;

    public form (){


        Factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, fact = 1;
                int n = Integer.parseInt(textField1.getText());

                if (n < 0)
                    System.out.println("number should be non negative!!");
                else {
                    for (a = 1; a <= n; a++)
                        fact = fact * a;
                    JOptionPane.showMessageDialog(null, "" + fact, "Factorial", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });


        Fibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=1;
                int pre, next, sum;
                int count = Integer.parseInt(textField1.getText());

                pre=next=1;

                while (n<=count) {
                    JOptionPane.showMessageDialog(null, "" + pre, "Fibonaccci", JOptionPane.PLAIN_MESSAGE);
                    sum=pre+next;
                    pre=next;
                    next=sum;
                    n++;
                }

            }
        });

        Prime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=0;
                int num=0;
                String primeNo="";
                int maxNumber = Integer.parseInt(textField1.getText());

                for(x=1; x<maxNumber; x++){
                    int counter=0;
                    for (num=x; num>=1; num--){
                        if(x%num==0){
                            counter=counter+1;
                        }
                        if (counter==2){primeNo=primeNo + x + " ";}
            }}
                    JOptionPane.showMessageDialog(null, "" + primeNo, "prime!", JOptionPane.PLAIN_MESSAGE);
            }
}  );

    }

public static void main(String[] args){
JFrame frame = new JFrame("form");
frame.setContentPane(new form().form);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);}
}
