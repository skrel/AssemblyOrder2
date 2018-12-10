package com.example.user.assemblyorder;

import android.content.Intent;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //addListenerOnButton();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SingIn.class);
                startActivity(intent);
                finish();
            }
        }, 2*1000);
       
    }

    //private void addListenerOnButton() {
        //button1 = (Button)findViewById(R.id.button1);
        //button1.setOnClickListener(
                //new View.OnClickListener() {
                    //@Override
                    //public void onClick(View v) {
                        //Intent intent = new Intent("com.example.user.assemblyorder.SelectAssembly");
                        //startActivity(intent);
                    //}
                //}
        //);
    //}
}
