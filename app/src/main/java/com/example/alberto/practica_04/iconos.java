package com.example.alberto.practica_04;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class iconos extends Fragment implements View.OnClickListener{

    View parentView;
    detectarImagen MiCallBack;

    public iconos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_iconos, container, false);
        parentView.findViewById(R.id.ACII).setOnClickListener(this);
        parentView.findViewById(R.id.ACR).setOnClickListener(this);
        parentView.findViewById(R.id.ACIII).setOnClickListener(this);

        return parentView;
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        MiCallBack = (detectarImagen) activity;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id) {
            case R.id.ACII:
                MiCallBack.detectarBoton("1");
                break;
            case R.id.ACR:
                MiCallBack.detectarBoton("2");
                break;
            case R.id.ACIII:
                MiCallBack.detectarBoton("3");
                break;
        }
    }
}
