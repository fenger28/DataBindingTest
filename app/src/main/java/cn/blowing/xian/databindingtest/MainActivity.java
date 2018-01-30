package cn.blowing.xian.databindingtest;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.blowing.xian.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        TestViewModel model = new TestViewModel();
        dataBinding.setViewmodel(model);
    }
}
