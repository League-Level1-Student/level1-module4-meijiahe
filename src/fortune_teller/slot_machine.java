package fortune_teller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slot_machine implements ActionListener {
JButton spin=new JButton();
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
JLabel labela=new JLabel();
JLabel labelb=new JLabel();
void run() {
	frame.setTitle("Slot Machine");
	frame.setVisible(true);
	panel.add(spin);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	spin.addActionListener(this);
	try {
	createLabelImage("Cherries-512.jpg");
	createLabelImage("Orange-512.jpg");
	createLabelImage("Watermelon-512.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void spin() {
Random r1=new Random();
int num=r1.nextInt(3);
if (num==0) {
	
}
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed=(JButton) e.getSource();
	if (spin==pressed) {
		
	}
}

}
