package com.night.wz.randomcodeview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.night.wz.randomcodeview.R;
import com.night.wz.randomcodeview.view.RandomCodeView;

public class TestActivity extends Activity {

    private static final String TAG = TestActivity.class.getSimpleName();

    private EditText mEditText;
    private RandomCodeView mCodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
    }

    private void initView() {
        mEditText = (EditText) findViewById(R.id.editText);
        mCodeView = (RandomCodeView) findViewById(R.id.randomCodeView);
        mCodeView.setOnClickRefresh(true);
    }

    public void check(View view) {
        String code = mEditText.getText().toString();
        Log.d(TAG, "etCode : " + code);
        Log.d(TAG, "code : " + mCodeView.getRandomCode());
        Toast.makeText(this, "check : " + mCodeView.checkRes(code), Toast.LENGTH_LONG).show();
    }
}
