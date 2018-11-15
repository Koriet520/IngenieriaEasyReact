package com.example.azucena.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IhaveK extends AppCompatActivity {

    private EditText valueK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ihave_k);

        valueK=(EditText)findViewById(R.id.txtk);
    }

    public void next(View view){
        String k = valueK.getText().toString();
        Intent next = new Intent(this, ConstantK.class);
        startActivity(next);
    }
}
