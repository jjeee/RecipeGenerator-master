package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class SpiceList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spice);

        Button btnSalt=(Button) findViewById(R.id.btn_spice_Salt);
        Button btnBlackPepper=(Button) findViewById(R.id.btn_spice_BlackPep);
        Button btnBasil=(Button) findViewById(R.id.btn_spice_Basil);
        Button btnParsley=(Button) findViewById(R.id.btn_spice_Parsley);
        Button btnOregano=(Button) findViewById(R.id.btn_spice_Oregano);
        Button btnCumin=(Button) findViewById(R.id.btn_spice_Cumin);
        Button btnChiliPowder=(Button) findViewById(R.id.btn_spice_ChiliPowder);
        Button btnGarlicPowder=(Button) findViewById(R.id.btn_spice_GarlicPowder);
        Button btnOnionPowder=(Button) findViewById(R.id.btn_spice_OnionPowder);



        btnSalt.setOnClickListener(this);
        btnBlackPepper.setOnClickListener(this);
        btnBasil.setOnClickListener(this);
        btnParsley.setOnClickListener(this);
        btnOregano.setOnClickListener(this);
        btnCumin.setOnClickListener(this);
        btnChiliPowder.setOnClickListener(this);
        btnGarlicPowder.setOnClickListener(this);
        btnOnionPowder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_spice_Salt:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Salt";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_BlackPep:
                categoryListActivity.ingredientsList[categoryListActivity.count]="BlackPepper";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_Basil:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Basil";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_Parsley:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Parsley";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_Oregano:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Oregano";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_Cumin:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cumin";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_ChiliPowder:
                categoryListActivity.ingredientsList[categoryListActivity.count]="ChiliPowder";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_GarlicPowder:
                categoryListActivity.ingredientsList[categoryListActivity.count]="GarlicPowder";
                categoryListActivity.count++;
                break;

            case R.id.btn_spice_OnionPowder:
                categoryListActivity.ingredientsList[categoryListActivity.count]="OnionPowder";
                categoryListActivity.count++;
                break;
        }
    }
}
