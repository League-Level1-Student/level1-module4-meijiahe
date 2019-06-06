package fortune_teller;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_Mole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
int rr=0;
int rl=0;
Date nd=new Date();
int miss=0;
public static void main(String[] args) {
Whack_a_Mole dang=new Whack_a_Mole();
dang.run();
dang.draw();
}
void draw() {
	Random r=new Random();
	int ra=r.nextInt(15);
	for (int i = 0;i<15;i++) {
		JButton button=new JButton();
		button.addActionListener(this);
		panel.add(button);
		if (i==ra) {
			button.setText("Mole!");
		}
	}
}
void run() {
	frame.setTitle("Whack a Button for frame and Glory");
	frame.setVisible(true);
	frame.add(panel);
	JButton buttonm=new JButton();
	buttonm.setText("Mole!");
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
	JButton pressed=(JButton) e.getSource();
	if (pressed.getText().equals("Mole!")) {
		speak("You chose the correct button");
		frame.dispose();
		draw();
		rl++;
	}
	else {
		miss++;
	}
	if (miss>=5) {
	endGame(nd,rl);
	}
	rr++;
	if (rr>10) {
		endGame(nd,rl);
	}
	playSound("ma.wav");
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}

