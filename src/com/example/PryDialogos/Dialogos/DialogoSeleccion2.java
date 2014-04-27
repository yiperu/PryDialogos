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
 * Time: 01:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class DialogoSeleccion2 extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = {"Español","Ingles","Frances"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Seleccion")
                .setSingleChoiceItems(items,-1,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i("Dialogos","Opcion elegida: "+ items[which]);
                            }
                        });
        //return super.onCreateDialog(savedInstanceState);
        return builder.create();

    }
}
