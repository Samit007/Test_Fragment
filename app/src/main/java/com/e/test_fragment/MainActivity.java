package com.example.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.test_fragment.R;

import fragments.FirstFragment;
import fragments.SecondFragment;
import fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnFrag;
    private Integer status=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFrag=findViewById(R.id.btnFrag);
        btnFrag.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        if (status == 0){
            FirstFragment firstFragment=new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
            fragmentTransaction.commit();
            btnFrag.setText("Load Second Fragment");
            status=1;
        }else if(status==1) {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, secondFragment);
            fragmentTransaction.commit();
            btnFrag.setText("Load Third Fragment");
            status = 2;
        } else {
            ThirdFragment thirdFragment=new ThirdFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,thirdFragment);
            fragmentTransaction.commit();
            btnFrag.setText("Load First Fragment");
            status=0;
        }
    }
}
