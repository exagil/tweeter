package twitter.sumit.com.twitterapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        Intent intent = new Intent(TweetsActivity.this, TweetActivity.class);
        startActivity(intent);
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
