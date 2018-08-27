package com.example.rindou11.uilayouttest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1=(Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_1:
                Intent intent1=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent1);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
