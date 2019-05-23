package fortune_teller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Whack_a_Mole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
void draw() {
	for (int i = 0;i<16;i++) {
		JButton button=new JButton();
		button.addActionListener(this);
	}
}
void run() {
	frame.setTitle("Whack a Button for frame and Glory");
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
