package fortune_teller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
JButton button1=new JButton();
JButton button2=new JButton();
JButton button3=new JButton();
JButton button4=new JButton();
JTextField textfield1=new JTextField();
JTextField textfield2=new JTextField();
void run () {
	frame.setVisible(true);
	frame.setTitle("Simple Calculator");
	panel.add(textfield1);
	textfield1.setPreferredSize(new Dimension(100,25));
	textfield2.setPreferredSize(new Dimension(100,25));
	panel.add(textfield2);
	panel.add(button1);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(label);
	button1.setText("add");
	button2.setText("sub");
	button3.setText("mul");
	button4.setText("div");
	frame.add(panel);
	frame.pack();
}
int add(int num1, int num2) {
	return num1+num2;
}
int sub(int num1, int num2) {
	return num1-num2;
}
int mul(int num1, int num2) {
	return num1*num2;
}
int div(int num1, int num2) {
	return num1/num2;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton press=(JButton) e.getSource();
	String a=textfield1.getText();
	int a1=Integer.parseInt(a);
	String b=textfield2.getText();
	int b1=Integer.parseInt(b);
	if (press==button1) {
	label.setText(add(a1,b1)+"");
		frame.pack();
	}
	if (press==button2) {
		label.setText(sub(a1,b1)+"");
			frame.pack();
		}
	if (press==button3) {
		label.setText(mul(a1,b1)+"");
			frame.pack();
		}
	if (press==button4) {
		label.setText(div(a1,b1)+"");
			frame.pack();
		}
}
}
