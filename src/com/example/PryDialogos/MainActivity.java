package com.example.PryDialogos;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    Button btnDialogoAlerta=null;
    Button btnDialogoConfirmacion =null;
    Button btnDialogoSeleccion1 = null;
    Button btnDialogoSeleccion2 = null;
    Button btnDialogoSeleccion3 = null;
    Button btnDialogoPersonalizado = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnDialogoAlerta.setOnClickListener(this);
        btnDialogoConfirmacion.setOnClickListener(this);
        btnDialogoSeleccion1.setOnClickListener(this);
        btnDialogoSeleccion2.setOnClickListener(this);
        btnDialogoSeleccion3.setOnClickListener(this);
        btnDialogoPersonalizado.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idBtnDialogoAlerta:
                break;
            case R.id.idBtnDialogoConfirmacion:
                break;
            case R.id.idBtnDialogoSeleccion1:
                break;
            case R.id.idBtnDialogoSeleccion2:
                break;
            case R.id.idBtnDialogoSeleccion3:
                break;
            case R.id.idBtnDialogoPersonalizado:
                break;
        }

    }
}
