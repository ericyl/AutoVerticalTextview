package com.paradoxie.autoverticaltextview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import com.paradoxie.autoscrolltextview.VerticalTextView;
import com.paradoxie.autoscrolltextview.model.TextModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private VerticalTextView TextView;
    private ArrayList<TextModel> titleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        TextView = (VerticalTextView) findViewById(R.id.text);
        titleList.add(new TextModel("你是天上最受宠的一架钢琴"));
        titleList.add(new TextModel("我是丑人脸上的鼻涕"));
        titleList.add(new TextModel("你发出完美的声音"));
        titleList.add(new TextModel("我被默默揩去"));
        titleList.add(new TextModel("你冷酷外表下藏着诗情画意"));
        titleList.add(new TextModel("我已经够胖还吃东西"));
        titleList.add(new TextModel("你踏着七彩祥云离去"));
        titleList.add(new TextModel("我被留在这里"));
        TextView.setTextList(titleList);
        TextView.setText(26, 5, Color.RED);//设置属性
        TextView.setTextStillTime(3000);//设置停留时长间隔
        TextView.setAnimTime(300);//设置进入和退出的时间间隔
        TextView.setOnItemClickListener(new VerticalTextView.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "点击了 : " + titleList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView.startAutoScroll();
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView.stopAutoScroll();
    }
}
