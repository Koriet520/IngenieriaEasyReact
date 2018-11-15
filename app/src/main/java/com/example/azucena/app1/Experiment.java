package com.example.azucena.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Experiment extends AppCompatActivity {
    private EditText exp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);

        exp=(EditText)findViewById(R.id.experimentofilas);
    }

    public void next(View view){

        String exper = exp.getText().toString();
        Intent next = new Intent(this, LlenarActivitdad.class);
        startActivity(next);
    }
}
