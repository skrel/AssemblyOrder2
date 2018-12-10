package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class SelectABracketCaddy5 extends AppCompatActivity {

    ImageButton imageButton1;

    private Button button12, button13, button14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_abracket_caddy5);
        addListenerOnButton();


    }

    private void addListenerOnButton() {
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAConnector11");
                        startActivity(intent);
                    }
                }
        );

        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAccesories4");
                        startActivity(intent);
                    }
                }
        );

        button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.Order100");
                        startActivity(intent);
                    }
                }
        );

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

}
