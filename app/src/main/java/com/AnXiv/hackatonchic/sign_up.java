package com.AnXiv.hackatonchic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void profile_activity(View view){
        Intent intent = new Intent(this, profile.class);
        Button button = (Button) findViewById(R.id.button);
        startActivity(intent);

    }
}
