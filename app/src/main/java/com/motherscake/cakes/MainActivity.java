package com.motherscake.cakes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    //btn initiation
    Button btnCatalog;
    Button btnConstructor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout); //setContentView(int)

        btnCatalog = findViewById(R.id.button_catalog);
        btnConstructor = findViewById(R.id.button_construct);

        //Catalog action
        //btnCatalog.setOnClickListener(this);//method OnClick below

        //Construction action
        //btnConstructor.setOnClickListener(this);

        //Switch-case for buttons. Better then individual method, because it dont get memory for each button, only in call
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button_catalog:
                        break;
                    case R.id.button_construct:
                        break;
                }

            }
        };

        btnCatalog.setOnClickListener(onClickListener);
        btnConstructor.setOnClickListener(onClickListener);
    }

    //override interface onClickListener
    @Override
    public void onClick(View view) {

    }
}
