package com.bw.text.lianxizhoukao1.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bw.text.lianxizhoukao1.fragment.Fragment1;

/**
 * Created by zhangjie on 2016/11/9.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    String []title={"推荐","热点","本地","视频","订阅","社会","娱乐","科技","汽车","体育","财经","军事","国际","段子","趣图","美女","健康","正能量"};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                return new Fragment1();

            default:
                return new Fragment1();
        }
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
