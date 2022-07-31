package android.example.storyworld;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(2, 2, 2, 2);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(images[position]);
        return imageView;
    }

    // References to Images
    public Integer[]images = {
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile,
            R.drawable.adam_and_the_dragon_treasure,
            R.drawable.ali_baba_and_the_forty_thieves,
            R.drawable.master_twardowski,
            R.drawable.stone_soup,
            R.drawable.the_fern_flower,
            R.drawable.the_golden_duck,
            R.drawable.the_monkey_and_the_crocodile

    };
}
