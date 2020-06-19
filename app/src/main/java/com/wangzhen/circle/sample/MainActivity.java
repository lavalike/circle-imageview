package com.wangzhen.circle.sample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wangzhen.circle.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private CircleImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.imageView);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_reset:
                mImageView.setOval(false);
                mImageView.setRadius(0);
                break;
            case R.id.btn_oval:
                mImageView.setOval(true);
                break;
            case R.id.btn_corner:
                mImageView.setRadius(300, 300, 0, 0);
                break;
        }
    }
}