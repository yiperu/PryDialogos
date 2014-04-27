package com.example.PryDialogos.Dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: Clayster Lab
 * Date: 27-04-14
 * Time: 12:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class DialogoConfirmacion extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("¿Confirma la Accion Seleecionada?")
                .setTitle("Confirmacion")
                .setPositiveButton("Aceptar",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("Dialogos","Confirmacion Aceptada");
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Cancelar",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("Dialogos","Confirmacion Cancelada");
                        dialog.cancel();
                    }
                });

        //return super.onCreateDialog(savedInstanceState);
        return builder.create();
    }
}
