package grupo1.client5605.logica;

import java.awt.List;
import java.util.Iterator;

import javax.management.Query;

import twitter4j.QueryResult;
import twitter4j.Tweet;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class HashTag {
	
	/*
	public void buscaTwitter(String info) {
        TwitterFactory twitterFactory = new TwitterFactory();
        Twitter twitter = twitterFactory.getInstance();

        Query query = new Query(info);

        QueryResult resultadoBusca = null;

        try {
            resultadoBusca = twitter.search(query);

            List listaTweets = resultadoBusca.getTweets();

            Iterator itTweet = listaTweets.iterator();

            while (itTweet.hasNext()) {
                Tweet tweet = itTweet.next();

                System.out.println(tweet.getFromUser() +
                        " - " +
                        tweet.getText());
                System.out.println("--------------------------------");
            }

        } catch (TwitterException e) {
            e.printStackTrace();
        }

	}*/
}
