package com.forwork.app.activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.forwork.app.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SignInActivity extends AppCompatActivity {
    @BindView(R.id.til_email) TextInputLayout emailTextInputLayout;
    @BindView(R.id.tie_email) TextInputEditText emailTextInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    private boolean validate() {
        if (TextUtils.isEmpty(emailTextInputEditText.getText())) {
            emailTextInputLayout.setError("teste");
            return false;
        }
        return true;
    }

    @OnClick(R.id.ivw_enter)
    public void onEnterClick(View view) {
        if (validate()) {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}