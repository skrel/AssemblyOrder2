package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.ToggleButton;

public class SelectAConnector11 extends AppCompatActivity {

    ImageButton imageButton1;

    Button button12;

    Switch switch1, switch2, switch3;

    Spinner spinner3, spinner4, spinner5, spinner, spinner6, spinner2, spinner9, spinner8, spinner7, spinner28, spinner29, spinner30, spinner33, spinner31, spinner32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_aconnector11);
        addListenerOnClick();

        switch1 = (Switch)findViewById(R.id.switch1);
        switch2 = (Switch)findViewById(R.id.switch2);
        switch3 = (Switch)findViewById(R.id.switch3);

        spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<?> adapter0 = ArrayAdapter.createFromResource(this,R.array.Connectors,android.R.layout.simple_spinner_item);
        adapter0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adapter0);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.Connectors);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4 = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<?> adapter1 = ArrayAdapter.createFromResource(this,R.array.Connectors,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(adapter1);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.Connectors);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner5 = (Spinner)findViewById(R.id.spinner5);
        ArrayAdapter<?> adapter2 = ArrayAdapter.createFromResource(this,R.array.Connectors,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner5.setAdapter(adapter2);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.Connectors);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setEnabled(true);
        ArrayAdapter<?> adapter3 = ArrayAdapter.createFromResource(this,R.array.mc_type,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.mc_type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner6 = (Spinner)findViewById(R.id.spinner6);
        spinner6.setEnabled(true);
        ArrayAdapter<?> adapter6 = ArrayAdapter.createFromResource(this,R.array.mc_type,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner6.setAdapter(adapter6);
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.mc_type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner2.setEnabled(true);
        ArrayAdapter<?> adapter20 = ArrayAdapter.createFromResource(this,R.array.mc_type,android.R.layout.simple_spinner_item);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adapter20);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.mc_type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner9 = (Spinner)findViewById(R.id.spinner9);
        spinner9.setEnabled(true);
        ArrayAdapter<?> adapter9 = ArrayAdapter.createFromResource(this,R.array.mc_jacket,android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner9.setAdapter(adapter9);
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.mc_jacket);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner8 = (Spinner)findViewById(R.id.spinner8);
        spinner8.setEnabled(true);
        ArrayAdapter<?> adapter8 = ArrayAdapter.createFromResource(this,R.array.mc_jacket,android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner8.setAdapter(adapter8);
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.mc_jacket);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner7 = (Spinner)findViewById(R.id.spinner7);
        spinner7.setEnabled(true);
        ArrayAdapter<?> adapter7 = ArrayAdapter.createFromResource(this,R.array.mc_jacket,android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner7.setAdapter(adapter7);
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.mc_jacket);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner28 = (Spinner)findViewById(R.id.spinner28);
        spinner28.setEnabled(false);
        ArrayAdapter<?> adapter28 = ArrayAdapter.createFromResource(this,R.array.conduit_size,android.R.layout.simple_spinner_item);
        adapter28.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner28.setAdapter(adapter28);
        spinner28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.conduit_size);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner30 = (Spinner)findViewById(R.id.spinner30);
        spinner30.setEnabled(false);
        ArrayAdapter<?> adapter30 = ArrayAdapter.createFromResource(this,R.array.conduit_size,android.R.layout.simple_spinner_item);
        adapter30.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner30.setAdapter(adapter30);
        spinner30.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.conduit_size);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner29 = (Spinner)findViewById(R.id.spinner29);
        spinner29.setEnabled(false);
        ArrayAdapter<?> adapter29 = ArrayAdapter.createFromResource(this,R.array.conduit_size,android.R.layout.simple_spinner_item);
        adapter29.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner29.setAdapter(adapter29);
        spinner29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.conduit_size);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner33 = (Spinner)findViewById(R.id.spinner33);
        spinner33.setEnabled(false);
        ArrayAdapter<?> adapter33 = ArrayAdapter.createFromResource(this,R.array.conduit_type,android.R.layout.simple_spinner_item);
        adapter33.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner33.setAdapter(adapter33);
        spinner33.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.conduit_type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner31 = (Spinner)findViewById(R.id.spinner31);
        spinner31.setEnabled(false);
        ArrayAdapter<?> adapter31 = ArrayAdapter.createFromResource(this,R.array.conduit_type,android.R.layout.simple_spinner_item);
        adapter31.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner31.setAdapter(adapter31);
        spinner31.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.conduit_type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner32 = (Spinner)findViewById(R.id.spinner32);
        spinner32.setEnabled(false);
        ArrayAdapter<?> adapter32 = ArrayAdapter.createFromResource(this,R.array.conduit_type,android.R.layout.simple_spinner_item);
        adapter32.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner32.setAdapter(adapter32);
        spinner32.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.conduit_type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked())
                {
                    spinner32.setEnabled(true);
                    spinner29.setEnabled(true);
                    spinner7.setEnabled(false);
                    spinner.setEnabled(false);
                }
                else {
                    spinner32.setEnabled(false);
                    spinner29.setEnabled(false);
                    spinner7.setEnabled(true);
                    spinner.setEnabled(true);
                }
            }
        });

        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked())
                {
                    spinner31.setEnabled(true);
                    spinner30.setEnabled(true);
                    spinner8.setEnabled(false);
                    spinner2.setEnabled(false);
                }
                else {
                    spinner31.setEnabled(false);
                    spinner30.setEnabled(false);
                    spinner8.setEnabled(true);
                    spinner2.setEnabled(true);
                }
            }
        });

        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked())
                {
                    spinner33.setEnabled(true);
                    spinner28.setEnabled(true);
                    spinner9.setEnabled(false);
                    spinner6.setEnabled(false);
                }
                else {
                    spinner33.setEnabled(false);
                    spinner28.setEnabled(false);
                    spinner9.setEnabled(true);
                    spinner6.setEnabled(true);
                }
            }
        });

        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAssembly");
                        startActivity(intent);
                    }
                }
        );

    }

    private void addListenerOnClick() {
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectADevice");
                        startActivity(intent);
                    }
                }
        );
    }
}
