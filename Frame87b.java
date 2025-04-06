// In this Frame we can compare two Strings


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame87b extends JFrame implements ActionListener {

    
    JLabel Strings = new JLabel("Enter two Strings to compare ");

    JLabel String1 = new JLabel("First String");
    JTextField Stringa = new JTextField(7);


    JLabel String2 = new JLabel("Second String");
    JTextField String2a = new JTextField(7);

    

    JLabel resultLabel = new JLabel("Result will appear here");

    JButton greaterButton = new JButton("Which is Greater?");
    JButton differenceButton = new JButton("Difference");

    JLabel lengthLabel = new JLabel("  Length difference will appear here  ");

    
    Container z;
    FlowLayout flow = new FlowLayout();

    public Frame87b() {
        setSize(400, 300);
        setTitle("String Comparison");

        z = getContentPane();
        z.setLayout(flow);
        z.setBackground(Color.GRAY);

        
        Strings.setForeground(Color.BLACK);
        z.add(Strings);

        String1.setForeground(Color.BLACK);
        z.add(String1);
        Stringa.setForeground(Color.BLACK);
        z.add(Stringa);

        String2.setForeground(Color.BLACK);
        z.add(String2);
        String2a.setForeground(Color.DARK_GRAY);
        z.add(String2a);

       

        resultLabel.setForeground(Color.GREEN);
        z.add(resultLabel);

        lengthLabel.setForeground(Color.BLACK);
        z.add(lengthLabel);

greaterButton.setForeground(Color.darkGray);
z.add(greaterButton);

differenceButton.setForeground(Color.DARK_GRAY);
z.add(differenceButton);
        
        
        String2a.addActionListener(this);
greaterButton.addActionListener(this);
differenceButton.addActionListener(this);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
       
        String string1 = Stringa.getText();
        String string2 = String2a.getText();

        
        if (e.getSource() == greaterButton || e.getSource() == String2a) {
            // Determine which string is greater
            if (string1.compareTo(string2) > 0) {
                resultLabel.setText("String 1 is greater.");
            } else if (string1.compareTo(string2) < 0) {
                resultLabel.setText("String 2 is greater.");
            } else {
                resultLabel.setText("Both strings are equal.");
            }

        
        } else if (e.getSource() == differenceButton) {
            // Calculate the ASCII difference
            int difference = Math.abs(string1.compareTo(string2));
            resultLabel.setText("Difference: " + difference);
        }
    }

    public static void main(String[] args) {
        
        new Frame87b();
    }
}