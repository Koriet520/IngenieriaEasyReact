package com.example.azucena.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConstantK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constant_k);
    }

    public void K(View view){
        Intent change = new Intent(this, ConstantVariablesValues.class);
        startActivity(change);
    }

    public void Experiment(View view){
        Intent change = new Intent(this, IhaveK.class);
        startActivity(change);
    }
}
