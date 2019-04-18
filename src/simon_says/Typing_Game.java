package simon_says;

import javax.swing.JFrame;

public class Typing_Game {
public static void main(String[] args) {
JFrame frame=new JFrame("Type or Die");	

char currentLetter;

currentLetter = generateRandomLetter();
}
static char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}




private static char generateRandomLetter() {
	// TODO Auto-generated method stub
	return 0;
}
}
