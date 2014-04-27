package com.example.PryDialogos;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import com.example.PryDialogos.Dialogos.DialogoAlerta;
import com.example.PryDialogos.Dialogos.DialogoConfirmacion;
import com.example.PryDialogos.Dialogos.DialogoSeleccion1;
import com.example.PryDialogos.Dialogos.DialogoSeleccion2;

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
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                DialogoAlerta dialogo1 = new DialogoAlerta();
                dialogo1.show(fragmentManager1,"dialogoAlerta");
                break;
            case R.id.idBtnDialogoConfirmacion:
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                DialogoConfirmacion dialogo2 = new DialogoConfirmacion();
                dialogo2.show(fragmentManager2,"dialogoConfirmacion");
                break;
            case R.id.idBtnDialogoSeleccion1:
                FragmentManager fragmentManager3 = getSupportFragmentManager();
                DialogoSeleccion1 dialogo3 = new DialogoSeleccion1();
                dialogo3.show(fragmentManager3,"dialogoSeleccion1");
                break;
            case R.id.idBtnDialogoSeleccion2:
                FragmentManager fragmentManager4 = getSupportFragmentManager();
                DialogoSeleccion2 dialogo4 = new DialogoSeleccion2();
                dialogo4.show(fragmentManager4,"dialogoSeleccion2");
                break;
            case R.id.idBtnDialogoSeleccion3:
                break;
            case R.id.idBtnDialogoPersonalizado:
                break;
        }

    }
}
