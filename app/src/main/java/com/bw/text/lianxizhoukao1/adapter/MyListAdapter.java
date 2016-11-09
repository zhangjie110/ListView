package com.bw.text.lianxizhoukao1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bw.text.lianxizhoukao1.R;
import com.bw.text.lianxizhoukao1.bean.Bean;

import java.util.List;

/**
 * Created by zhangjie on 2016/11/9.
 */
public class MyListAdapter extends BaseAdapter {

    private Context context;
    private List<Bean.ResultBean.DataBean> list;

    public MyListAdapter(List<Bean.ResultBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(context, R.layout.list_item,null);
        TextView tv=(TextView) view.findViewById(R.id.tv_title);
        TextView tv1=(TextView) view.findViewById(R.id.tv_time);
        tv.setText(list.get(i).getContent());
        tv1.setText(list.get(i).getUpdatetime());

        return view;
    }
}
