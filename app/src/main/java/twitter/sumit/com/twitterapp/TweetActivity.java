package twitter.sumit.com.twitterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TweetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonAction("Reply, baby!", R.id.tweet_reply_btn);
        buttonAction("Retweet, baby!", R.id.tweet_rt_btn);
        buttonAction("Favorite, baby!", R.id.tweet_fav_btn);
    }

    private void buttonAction(final String message, int id) {
        TextView button;
        button = (TextView) findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), message,
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
