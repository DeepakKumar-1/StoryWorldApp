package android.example.storyworld;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryDataAdapter extends BaseAdapter {

    private Context mContext;

    public StoryDataAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return stories.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView= new TextView(mContext);
        return textView;
    }

    int []stories = {
            R.string.story1,
            R.string.story2,
            R.string.story3,
            R.string.story4,
            R.string.story5,
            R.string.story6,
            R.string.story7,
            R.string.story8,
            R.string.story9,
            R.string.story10,
            R.string.story11,
            R.string.story12,
            R.string.story13,
            R.string.story14,
            R.string.story15,
            R.string.story16,
            R.string.story17,
            R.string.story18,
            R.string.story19,
            R.string.story20,
            R.string.story21,
    };

}
