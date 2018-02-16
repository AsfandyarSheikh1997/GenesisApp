package com.example.mcb.genesisapp.Views.market;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mcb.genesisapp.R;

/**
 * Created by asfandyarsheikh on 2/16/18.
 */

public class MarketActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_market2);

        Button button = (Button) this.getWindow().getDecorView().findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MarketActivity2.this, MarketActivity3.class);
                startActivity(myIntent);
            }
        });

    }
}
