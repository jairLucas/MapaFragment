package com.jk.mapafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaccion;
    Fragment FMapa1,FMapa2,Finicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FMapa1 = new FragmentMapa();
        FMapa2 = new FragmentsMapa2();
        Finicio = new FragmentInicio();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments,Finicio).commit();

    }

    public void onClick(View view){
        transaccion=getSupportFragmentManager().beginTransaction();
        switch(view.getId()){
            case R.id.btn1:transaccion.replace(R.id.contenedorFragments,FMapa1);
                transaccion.addToBackStack(null);
                break;
            case R.id.btn2:transaccion.replace(R.id.contenedorFragments,FMapa2);
                transaccion.addToBackStack(null);
                break;
        }
        transaccion.commit();
    }
}