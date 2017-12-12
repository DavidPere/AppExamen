package com.example.xgaze.appexamen;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragmento1 extends Fragment implements View.OnClickListener {
private Button boton1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_fragmento1, container, false);



        boton1 = (Button) view.findViewById(R.id.boton1);

        boton1.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        FragmentManager FM = getActivity().getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        Fragmento2 m = new Fragmento2();
        FT.replace(R.id.contenedor,m);
        FT.commit();
    }
}
