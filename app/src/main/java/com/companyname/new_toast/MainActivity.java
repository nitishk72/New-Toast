package com.companyname.new_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.companyname.newtoast.NewToast;

public class MainActivity extends AppCompatActivity {

    Button b1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.tt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewToast.makeToast(MainActivity.this,"NEW ",NewToast.LENGTH_SHORT,NewToast.SUCCESS).show();
            }
        });
    }

}
