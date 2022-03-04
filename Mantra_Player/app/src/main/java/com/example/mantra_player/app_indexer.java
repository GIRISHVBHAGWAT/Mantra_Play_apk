package com.example.mantra_player;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class app_indexer extends AppCompatActivity {
//    All_in_one_1.0
    int Color = 0;
    ImageButton M_v,k_v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_indexer);
        getSupportActionBar().hide();
        M_v=findViewById(R.id.Mantra_player);
        k_v=findViewById(R.id.key_value);
//        text_play=findViewById(R.id.text_play);
//        Mantra_play=findViewById(R.id.mantra_play);
//        key_value1=findViewById(R.id.key_value1);



//        text_play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(app_indexer.this,Mantra_play.class);
//                startActivity(intent);
//            }
//        });
        M_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,rec_play.class);
                startActivity(intent);
            }
        });
        k_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity2.class);
                startActivity(intent);
            }
        });
//

    }
}