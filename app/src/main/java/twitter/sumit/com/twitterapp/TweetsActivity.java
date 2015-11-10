package twitter.sumit.com.twitterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TweetsActivity extends AppCompatActivity {
    private ListView tweetsView;
    private String[] stringArray ;
    private ArrayAdapter tweetsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweets);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        populateTweets();
    }

    private void populateTweets() {
        stringArray = new String[20];
        for(int i=0; i < stringArray.length; i++){
            stringArray[i] = "String " + i;
        }

        tweetsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
        tweetsView = (ListView) findViewById(R.id.tweets);
        tweetsView.setAdapter(tweetsAdapter);
    }

}
