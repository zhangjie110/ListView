package com.bw.text.lianxizhoukao1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.bw.text.lianxizhoukao1.adapter.MyPagerAdapter;

import shanyao.tabpagerindictor.TabPageIndicator;

public class MainActivity extends AppCompatActivity {

    private TabPageIndicator indicator;
    private ViewPager viewPager;
    private MyPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indicator = (TabPageIndicator)findViewById(R.id.indicator);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        setTabPagerIndicator();
    }
    /**
     * 通过一些set方法，设置控件的属性
     */
    private void setTabPagerIndicator() {

        indicator.setIndicatorMode(TabPageIndicator.IndicatorMode.MODE_NOWEIGHT_EXPAND_SAME);// 设置模式，一定要先设置模式
        indicator.setDividerColor(Color.parseColor("#00bbcf"));// 设置分割线的颜色
        indicator.setDividerPadding(10);//设置
        indicator.setIndicatorColor(Color.parseColor("#43A44b"));// 设置底部导航线的颜色
        indicator.setTextColorSelected(Color.parseColor("#43A44b"));// 设置tab标题选中的颜色
        indicator.setTextColor(Color.parseColor("#797979"));// 设置tab标题未被选中的颜色
        indicator.setTextSize(16);// 设置字体大小
    }
}
