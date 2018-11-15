package com.example.azucena.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LlenarActivitdad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llenar_activitdad);
    }

    public void next(View view){
        Intent next = new Intent(this, ConstantK.class);
        startActivity(next);
    }
}
