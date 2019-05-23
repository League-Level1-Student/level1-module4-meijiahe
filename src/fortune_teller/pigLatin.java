package fortune_teller;

import java.awt.Dimension;
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
PigLatinTranslator pig=new PigLatinTranslator();

void run() {
frame.setVisible(true);
frame.setTitle("Grace's Pig Latin Translator");
panel.add(label);
panel.add(textfield1);
panel.add(button);
button.addActionListener(this);
button.setText("Translate");
frame.add(panel);
frame.setSize(50, 100);
textfield1.setPreferredSize(new Dimension(100,20));
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String input =textfield1.getText();
String translate=pig.translate(input);
label.setText(translate);
frame.pack();
}
}
