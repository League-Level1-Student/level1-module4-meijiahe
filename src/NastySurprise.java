import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
NastySurprise ns=new NastySurprise();
ns.setup();
	}
	JButton Trick=new JButton();
	JButton Treat=new JButton();
void setup() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pp=new JPanel();
	JLabel ll=new JLabel();
	pp.add(Trick);
	pp.add(Treat);
	frame.add(pp);
	pp.add(ll);
	frame.pack();
	Trick.addActionListener(this);
	Treat.addActionListener(this);
}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton press=(JButton) e.getSource();
		if (press==Trick){
			showPictureFromTheInternet("http://images6.fanpop.com/image/photos/40800000/shiba-inu-cute-puppies-puppies-40835578-600-400.jpg");
		}
		if(press==Treat) {
			showPictureFromTheInternet("http://www.quickmeme.com/img/77/7702bccc68b9e99ba70466c7db1cc12e1b5f37c8016193f57f77340708ca981e.jpg");
		}
	}
}
