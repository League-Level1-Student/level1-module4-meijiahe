package fortune_teller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Get_Lastest_Tweet implements ActionListener {
JFrame frame=new JFrame ();
JLabel label=new JLabel();
JPanel panel=new JPanel();
JButton button=new JButton();
JTextField textfield=new JTextField();

void run() {
frame.setVisible(true);
frame.setTitle("The Amazing Tweet Retriever");
frame.setSize(200,100);
textfield.setSize(100,50);
panel.add(textfield);
button.setText("Search the Twitterverse");
button.addActionListener(this);
panel.add(button);
panel.add(label);
panel.add(textfield);
frame.add(panel);
frame.pack();
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
          System.err.print(e.getMessage());
          return "What the heck is that?";
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Tweet,Tweet.");
	String ob=textfield.getText();
	String answer=getLatestTweet(ob);
	System.out.println(answer);
}
}
