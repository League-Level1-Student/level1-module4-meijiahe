package fortune_teller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
JButton button=new JButton();
JTextField textfield1=new JTextField();
JTextField textfield2=new JTextField();

void run() {
frame.setVisible(true);
frame.setTitle("Grace's Pig Latin Translator");
panel.add(label);
panel.add(textfield1);
panel.add(button);
button.addActionListener(this);
button.setText("Translate");
panel.add(textfield2);
frame.add(panel);
frame.setSize(50, 100);
textfield1.setSize(25, 13);
textfield2.setSize(25, 13);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
