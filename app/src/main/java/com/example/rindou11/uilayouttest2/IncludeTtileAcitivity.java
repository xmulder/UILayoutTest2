package com.example.rindou11.uilayouttest2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IncludeTtileAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incloude_title);

        ActionBar iBar=getSupportActionBar();
        if (iBar!=null){
            iBar.hide();
        }
    }
}
