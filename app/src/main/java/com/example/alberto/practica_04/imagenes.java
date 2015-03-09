package com.example.alberto.practica_04;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class imagenes extends Fragment {

    View parentView;

    public imagenes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        parentView = inflater.inflate(R.layout.fragment_imagenes, container, false);

        // Inflate the layout for this fragment
        return parentView;
    }


    public void recibirBoton(String msg) {

        switch (msg){
            case "1":
                parentView.setBackgroundResource(R.drawable.ac2i);
                break;
            case "2":
                parentView.setBackgroundResource(R.drawable.aci);
                break;
            case "3":
                parentView.setBackgroundResource(R.drawable.ac3i);
                break;
        }
    }
}
