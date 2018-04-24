package com.forwork.app.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.forwork.app.R;

import butterknife.OnClick;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    @OnClick(R.id.ivw_back)
    public void onBackClick() {
        finish();
    }
}