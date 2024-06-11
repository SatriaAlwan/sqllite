package com.example.sqlite;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.MaterialTextInputPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Fragment fragment = new FragmentControl();
        FragmentManager fragmentManager=getSupportFragmentManager(); FragmentTransaction
                fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framecontainer,fragment);
        fragmentTransaction.commit();

    }
}