package com.bw.text.lianxizhoukao1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.text.lianxizhoukao1.R;
import com.bw.text.lianxizhoukao1.adapter.MyListAdapter;
import com.bw.text.lianxizhoukao1.bean.Bean;
import com.bw.text.lianxizhoukao1.okhttpclient.OkHttp;
import com.bw.text.lianxizhoukao1.view.XListView;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;

/**
 * Created by zhangjie on 2016/11/9.
 */
public class Fragment1 extends Fragment{

    private XListView xlv;
    private List<Bean.ResultBean.DataBean> list=new ArrayList<>();
    private List<Bean> bean = new ArrayList<Bean>();
    private MyListAdapter adapter;
    private String s="http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page=1&pagesize=10&sort=asc&time=1418745237";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.fragment1,null);
        xlv=(XListView)view.findViewById(R.id.xlv);
        OkHttp.getAsync(s, new OkHttp.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {

            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Gson gson=new Gson();
                Bean bean=gson.fromJson(result,Bean.class);
                Log.d("tag",result);
                list.addAll(bean.getResult().getData());
                adapter=new MyListAdapter(list,getActivity());
                xlv.setAdapter(adapter);
            }
        });

        return view;
    }
}
