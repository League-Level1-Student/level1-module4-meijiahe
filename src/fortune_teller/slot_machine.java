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
	JButton spin = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel labela = new JLabel();
	JLabel labelb = new JLabel();

	void run() {
		frame.setTitle("Slot Machine");
		frame.setVisible(true);
		panel.add(spin);
		frame.add(panel);
		frame.pack();
		spin.addActionListener(this);
		try {
			label=createLabelImage("Cherries-512.png");
			labela=createLabelImage("Orange-512.png");
			labelb=createLabelImage("Watermelon-512.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void spin() {
		panel.removeAll();
		panel.add(spin);
		Random r1 = new Random();
		int num = r1.nextInt(3);
		if (num == 0) {
panel.add(label);
		}
		if (num==1) {
			panel.add(labela);
		}
		if (num==2) {
			panel.add(labelb);
		}
		int num1= r1.nextInt(3);
		if (num1 == 0) {
panel.add(label);
		}
		if (num1==1) {
			panel.add(labela);
		}
		if (num1==2) {
			panel.add(labelb);
		}
		int num2 = r1.nextInt(3);
		if (num2 == 0) {
panel.add(label);
		}
		if (num2==1) {
			panel.add(labela);
		}
		if (num2==2) {
			panel.add(labelb);
		}
		frame.pack();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
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
		JButton pressed = (JButton) e.getSource();
		if (spin == pressed) {
spin();
		}
	}

}
