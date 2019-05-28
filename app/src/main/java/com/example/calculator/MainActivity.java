package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spr;
    private EditText num1;
    private EditText num2;
    private TextView Result;
    private Button btn;
    private String selectedoperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btncal);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if(spr.getSelectedItem().toString().equals("Add"))
                {
                    float result = Float.parseFloat(num1.getText().toString())  + Float.parseFloat(num2.getText().toString());
                    Result.setText(Float.toString(result));
                }
                else if ( spr.getSelectedItem().toString().equals("Subtract"))
                {
                    float result = Float.parseFloat(num1.getText().toString()) - Float.parseFloat(num2.getText().toString());
                    Result.setText(Float.toString(result));
                }
                else if(spr.getSelectedItem().toString().equals("Multiply"))
                {
                    float result = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
                    Result.setText(Float.toString(result));
                }
                else if (spr.getSelectedItem().toString().equals("Divide"))
                {
                    float result = Float.parseFloat(num1.getText().toString()) / Float.parseFloat(num2.getText().toString());
                    Result.setText(Float.toString(result));
                }
            }
        });
        spr = (Spinner) findViewById(R.id.spinner1);
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        Result = (EditText) findViewById(R.id.tvresult);

        String[] Operators = new String[]{
                "Add","Subtract","Multiply","Divide"
        };

        spr = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,Operators );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spr.setAdapter(adapter);
        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if(spr.getItemAtPosition(position).equals("Add"))
                {
                    String text = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
                }
                else if(spr.getItemAtPosition(position).equals("Subtract"))
                {
                    String text = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
                }
                else if(spr.getItemAtPosition(position).equals("Multiply"))
                {
                    String text = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
                }
                else if(spr.getItemAtPosition(position).equals("Divide"))
                {
                    String text = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }

}

