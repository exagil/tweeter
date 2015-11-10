package twitter.sumit.com.twitterapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TweetsActivity extends ListActivity {
    private String[] stringArray ;
    private ArrayAdapter tweetsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweets);

        populateTweets();
    }

    protected void onListItemClick(ListView listView, View v, int position, long id) {
        TextView textView = (TextView) v.findViewById(R.id.tweet_owner);
        textView.setText("Batman");
    }

    private void populateTweets() {
        stringArray = new String[20];
        for(int i=0; i < stringArray.length; i++){
            stringArray[i] = "String " + i;
        }

        tweetsAdapter = new TweetAdapter(this, new String[20]);
        setListAdapter(tweetsAdapter);
    }

}
