package com.example.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.myapplication.R;

public class OnBoardinAdapter extends PagerAdapter {
    Context context;
    LayoutInflater LayoutInflater;

    public OnBoardinAdapter(Context context) {
        this.context = context;
    }

    int titles[] = {
            R.string.title1,
            R.string.title1,
            R.string.title2,
            R.string.title3,
            R.string.title4,
    };
    int subtitles[] = {
            R.string.subtitle1,
            R.string.subtitle2,
            R.string.subtitle3,
            R.string.subtitle4,
    };
    int images[] = {
            R.drawable.icon_planet,
            R.drawable.person_icon,
            R.drawable.mulher,
            R.drawable.terra,

    };
    int bg[] = {
            R.drawable.bg1,
            R.drawable.bg2,
            R.drawable.bg3,
            R.drawable.bg4,

    };


    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View v = LayoutInflater.inflate(R.layout.activity_sidebar, container, false);

        ImageView image = v.findViewById(R.id.slideImg);
        TextView title = v.findViewById(R.id.TextTitle);
        TextView subtitle  = v.findViewById(R.id.subText);
        ConstraintLayout layout = v.findViewById(R.id.sliderLayuot);


    }

}
