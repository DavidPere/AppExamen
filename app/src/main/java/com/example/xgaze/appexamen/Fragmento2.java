package com.example.xgaze.appexamen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragmento2 extends Fragment {
private Button boton2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_fragmento2, container, false);

        

        return view;
    }

    public void cambiarPantalla(View view){
    FragmentManager FM = getActivity().getSupportFragmentManager();
    FragmentTransaction FT = FM.beginTransaction();
    Fragmento1 m = new Fragmento1();
           FT.replace(R.id.contenedor,m);
           FT.commit();
    }
}
