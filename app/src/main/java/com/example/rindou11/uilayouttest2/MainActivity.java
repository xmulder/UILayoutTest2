package com.example.rindou11.uilayouttest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_1;
    private Button button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1=(Button)findViewById(R.id.button_1);
        button_2=(Button)findViewById(R.id.button_2);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_1:
                Intent intent1=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2=new Intent();
                intent2.setAction("android.intent.layout.rlayout");
                startActivity(intent2);

            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
