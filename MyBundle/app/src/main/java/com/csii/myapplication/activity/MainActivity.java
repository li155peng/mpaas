package com.csii.myapplication.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.csii.myapplication.R;
import com.csii.myapplication.databinding.MainBinding;


/**
 * Created by mPaaS on 16/9/28.
 */
public class MainActivity extends Activity {
    private MainBinding mBing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        mBing = DataBindingUtil.setContentView(this, R.layout.main);

        mBing.tvInfo.setText("Binding text");
    }
}
