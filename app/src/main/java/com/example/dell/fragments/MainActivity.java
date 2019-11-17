package com.example.dell.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeFragment(View view){
        Fragment fragment;
        Fragment1 fragment1;
        Fragment2 fragment2;
        if(view == findViewById(R.id.fragment1)){
            fragment1 = new Fragment1();

            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
         //   ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.fragment2)){
            fragment2= new Fragment2();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
        //    ft.replace(R.id.fragment_place,fragment2);
            ft.commit();
        }
    }

}
