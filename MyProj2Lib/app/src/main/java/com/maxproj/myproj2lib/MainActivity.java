package com.maxproj.myproj2lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.maxproj.mylibrary.MyLibFunctions;

public class MainActivity extends AppCompatActivity {

    TextView add_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_result = (TextView)findViewById(R.id.add_result);
        int c = new MyLibFunctions().myLibAdd(1, 2);
        add_result.setText(""+c);

    }
}
