package com.dreamcool.xmz.threechess;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Chess extends AppCompatActivity {

    long s,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //获取加载开始时的时间s
        s = System.currentTimeMillis();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);


        //隐藏标题栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //获取加载完界面后的时间
        e = System.currentTimeMillis();
        //计算加载界面所用的时间并输出到日志中
        Log.d("时间2：",(e-s)+"");
    }
}
