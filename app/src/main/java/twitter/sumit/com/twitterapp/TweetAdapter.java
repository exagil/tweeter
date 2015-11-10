package twitter.sumit.com.twitterapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TweetAdapter extends ArrayAdapter{

    private LayoutInflater inflater;

    public TweetAdapter(Activity activity, String[] items){
        super(activity, R.layout.tweet_list_item, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return inflater.inflate(R.layout.tweet_list_item, parent, false);
    }

}
