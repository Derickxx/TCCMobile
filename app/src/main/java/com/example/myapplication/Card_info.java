package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.Adapters.OnBoardinAdapter;
import com.example.myapplication.Helpers.SaveState;

public class Card_info extends AppCompatActivity {
CardView Next_card;
LinearLayout dotsLayout;
ViewPager slider;
TextView[] dots;
int currentPositon;
    SaveState saveState ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_info);

        Next_card = findViewById(R.id.Next_card);
        dotsLayout = findViewById(R.id.dotsLayout);
        slider = findViewById(R.id.slider);
        dotsFunction(0);


        OnBoardinAdapter adapter = new OnBoardinAdapter(this);
        slider.setAdapter(adapter);
Next_card.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        slider.setCurrentItem(currentPositon+1, true);

    }
});
slider.setOnPageChangeListener(onPageChangeListener);
    }

    private void dotsFunction( int pos){
        dots = new TextView[3];
        dotsLayout.removeAllViews();

        for(int i = 0; i < dots.length; i++){
            dots[i] = new TextView(this);
            dots[i].setTextColor(getColor(R.color.botao));
            dots[i].setTextSize(30);
            dotsLayout.addView(dots[i]);
        }
        if(dots.length > 0){
            dots[pos].setTextColor(getColor(R.color.botao));
            dots[pos].setTextSize(40);
        }

    }

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
dotsFunction(position);
currentPositon = position;
if( currentPositon <= 2  ){
    Next_card.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            slider.setCurrentItem(currentPositon+1);
        }
    });
}else{
    Next_card.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i= new Intent(Card_info.this, PreviewLogin.class);
            startActivity(i);
            finish();
        }
    });

            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}