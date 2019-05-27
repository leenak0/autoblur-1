package com.leenak0.project.autoblur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChoosePic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_pic);

        ImageButton btn_gallery = (ImageButton)findViewById(R.id.btn_gallery);
        btn_gallery.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent choose_pic = new Intent(getApplicationContext(),ChoosePic.class);
                startActivity(choose_pic);
            }
        });
    }
}
