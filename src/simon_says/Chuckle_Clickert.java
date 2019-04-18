package simon_says;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clickert implements ActionListener {
public static void main(String[] args) {
	Chuckle_Clickert instantiate = new Chuckle_Clickert();
	instantiate.makeButtons();
}
static JButton kk=new JButton();
static JButton ll=new JButton();
void makeButtons(){
	JFrame bb=new JFrame();
	bb.setVisible(true);
	JPanel hh=new JPanel();
	kk.setText("joke");
	ll.setText("punchline");
	hh.add(kk);
	hh.add(ll);
	bb.add(hh);
	bb.pack();
	kk.addActionListener(this);
	ll.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if (e.getSource()==kk) {
JOptionPane.showMessageDialog(null, "Hi!");
JOptionPane.showMessageDialog(null, "Joke Button");
	}
if (e.getSource()==ll) {
	JOptionPane.showMessageDialog(null, "Hi!");
	JOptionPane.showMessageDialog(null, "Punchline Button");
}

}
}
