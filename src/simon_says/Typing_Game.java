package simon_says;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Typing_Game implements KeyListener {
public static void main(String[] args) {
	Typing_Game typegame=new Typing_Game();
	typegame.createUI();
}
JFrame frame=new JFrame("Type or Die");	
static JLabel label=new JLabel();
static JPanel panel=new JPanel();
char currentLetter;
public void createUI () {
	frame.addKeyListener(this);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	frame.pack();
	

	currentLetter = generateRandomLetter1();
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
label.setText(currentLetter+"");
}
static char generateRandomLetter1() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}




private static char generateRandomLetter() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
if (e.getKeyChar()==currentLetter) {
	System.out.println("correct");
	panel.setBackground(Color.GREEN);
}
else {
	panel.setBackground(Color.red);
}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
Date timeAtStart = new Date();

private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
      Date timeAtEnd = new Date();
      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
      long gameInSeconds = (gameDuration / 1000) % 60;
      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
      int charactersPerMinute = (int) (charactersPerSecond * 60);
      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}

}
