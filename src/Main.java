import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main extends JFrame {
    private JTextField input = new JTextField("", 5);
    private JTextField output = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");
    private JToggleButton toggle = new JToggleButton("Toggle");
    private JButton button = new JButton("Run");

    public Main() {
        super("Hi");
        this.setBounds(470,250,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2,2,2));
        container.add(label);
        container.add(input);
        container.add(output);
        container.add(toggle);
        button.addActionListener(new ButtonEventListener());
        container.add(button);


    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(toggle.isSelected()) {
                String in = input.getText();

                StringBuffer input1 = new StringBuffer();
                input1.append(in);

                input1 = input1.reverse();

                String out;
                out = input1.toString();
                output.setText(out);
            }
            else{
                String in = input.getText();

                StringBuffer input1 = new StringBuffer();
                input1.append(in);

                String out;
                out = input1.toString();
                output.setText(out);
            }

        }
    }
    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}
