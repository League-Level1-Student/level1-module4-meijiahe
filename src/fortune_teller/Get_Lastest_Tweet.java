package fortune_teller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Get_Lastest_Tweet implements ActionListener {
JFrame frame=new JFrame ();
JLabel label=new JLabel();
JPanel panel=new JPanel();
JButton button=new JButton();
JTextField textfield=new JTextField();

void run() {
frame.setVisible(true);
frame.setTitle("The Amazing Tweet Retriever");
panel.add(textfield);
button.setText("Search the Twitterverse");
button.addActionListener(this);
panel.add(button);
panel.add(label);
frame.add(panel);
frame.add(textfield);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
