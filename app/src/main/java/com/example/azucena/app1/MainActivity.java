package com.example.azucena.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner SpinnerPhase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner1=(Spinner)findViewById(R.id.spinner);
        SpinnerPhase=(Spinner)findViewById(R.id.SpinnerPhaseR);
        String[] options={"Type1", "Type2", "Type3", "Type4"};
        String[] phases={"Líquida", "Phase2", "Phase3", "Phase4"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, phases);
        spinner1.setAdapter(adapter);
        SpinnerPhase.setAdapter(adapter2);
    }

    //Método Botón
    public void ShowMe(View view){
        String selectedEc, selectedPhase;
                selectedEc=spinner1.getSelectedItem().toString();
                selectedPhase=SpinnerPhase.getSelectedItem().toString();
        Intent next = new Intent(this, ConstantVariablesValues.class);
        startActivity(next);
    }

}
