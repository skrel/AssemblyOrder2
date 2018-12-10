package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectABox extends AppCompatActivity {

    private Button button21;

    ImageButton imageButton8, imageButton6, imageButton1, imageButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_abox);
        addListenerOnButton();

        imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        imageButton6 = (ImageButton)findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton)findViewById(R.id.imageButton7);

        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent("com.example.user.assemblyorder.SelectAccesories4");
                startActivity(intent);
            }

        }

        );

        imageButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent("com.example.user.assemblyorder.Type4sqBox");
                startActivity(intent);
            }
        }

        );

        imageButton7.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v){
                                                Intent intent = new Intent("com.example.user.assemblyorder.ManualCreatedAssembly");
                                                startActivity(intent);
                                            }
                                        }

        );

    }

    private void addListenerOnButton() {
        button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAssembly");
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
