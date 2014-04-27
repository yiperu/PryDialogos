package com.example.PryDialogos.Dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created with IntelliJ IDEA.
 * User: Henry AT
 * Date: 27-04-14
 * Time: 12:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class DialogoAlerta extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Esto es un Mensaje de Alerta")
        .setTitle("Informacion")
        .setPositiveButton("OK",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        //return super.onCreateDialog(savedInstanceState);
        return builder.create();
    }
}
