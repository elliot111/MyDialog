package com.qianniao.mydialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.qianniao.dialog.MessageDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MessageDialog.show(this,"提示","提示信息","关闭",null);
    }
}