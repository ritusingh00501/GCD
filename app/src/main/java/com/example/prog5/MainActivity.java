package com.example.prog5;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T1=(EditText) findViewById(R.id.txtNum1);
        EditText T2=(EditText) findViewById(R.id.txtNum2);
        TextView Result=(TextView) findViewById(R.id.txtResult);
        Button B1=(Button) findViewById(R.id.btnGCD);

        B1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1,n2;
                n1=Integer.parseInt(T1.getText().toString().trim());
                n2=Integer.parseInt(T2.getText().toString().trim());
                int gcd=((n1>n2)?n1:n2);
                while (gcd>0){
                    if(n1%gcd==0 && n2%gcd==0){
                        break;
                    }
                    gcd--;
                }
                Result.setText("GCD= "+n1+" and "+n2+" is "+gcd);
                Toast.makeText(MainActivity.this, "GCD is"+gcd,Toast.LENGTH_SHORT).show();
            }
        });
    }
}