package com.example.PryDialogos;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import com.example.PryDialogos.Dialogos.DialogoAlerta;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    // Declaramos los botones
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

        // Enlazamos los Botones
        btnDialogoAlerta =(Button)findViewById(R.id.idBtnDialogoAlerta);
        btnDialogoConfirmacion = (Button)findViewById(R.id.idBtnDialogoConfirmacion);
        btnDialogoSeleccion1 = (Button)findViewById(R.id.idBtnDialogoSeleccion1);
        btnDialogoSeleccion2 = (Button)findViewById(R.id.idBtnDialogoSeleccion2);
        btnDialogoSeleccion3 = (Button)findViewById(R.id.idBtnDialogoSeleccion3);
        btnDialogoPersonalizado = (Button)findViewById(R.id.idBtnDialogoPersonalizado);

        // Configuramos los eventos Touch de los botones
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
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoAlerta dialogo = new DialogoAlerta();
                dialogo.show(fragmentManager,"dialogAlerta");
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
