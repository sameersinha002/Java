import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class tempGUI extends JFrame {
    public static void main(String[] args) {
        tempGUI frame = new tempGUI();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());

        TextField txt = new TextField();
        // txt.setBounds(100, 100, 100, 20);
        JRadioButton rc = new JRadioButton("C", true);
        // rc.setBounds(250, 100, 50, 20);
        JRadioButton rf = new JRadioButton("F");
        // rf.setBounds(300, 100, 50, 20);
        ButtonGroup bg = new ButtonGroup();
        JButton btn = new JButton("Convert");

        JLabel lbl = new JLabel();
        // lbl.setBounds(100, 150, 500, 20);
        lbl.setVisible(false);
        // btn.setBounds(350, 100, 100, 20);
        bg.add(rc);
        bg.add(rf);
        frame.add(txt);
        frame.add(rc);
        frame.add(rf);
        frame.add(btn);
        frame.add(lbl);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float temp = Float.parseFloat(txt.getText().equals("") ? "0" : txt.getText());
                float converted = rc.isSelected() ? (9 / 5) * temp + 32 : (temp - 32) * 5 / 9;
                lbl.setText("Converted temp: " + converted);
                lbl.setVisible(true);
            }
        });
    }
}
