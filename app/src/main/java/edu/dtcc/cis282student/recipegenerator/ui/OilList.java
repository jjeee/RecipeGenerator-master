package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class OilList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);

        Button btnOliveOil=(Button) findViewById(R.id.btn_oil_OliveOil);
        Button btnCanolaOil=(Button) findViewById(R.id.btn_oil_CanolaOil);
        Button btnVegetableOil=(Button) findViewById(R.id.btn_oil_VegetableOil);
        Button btnPeanutOil=(Button) findViewById(R.id.btn_oil_PeanutOil);
        Button btnCookingSpray=(Button) findViewById(R.id.btn_oil_CookingSpray);
        Button btnShortening=(Button) findViewById(R.id.btn_oil_Shortening);
        Button btnRedPepperSauce=(Button) findViewById(R.id.btn_oil_RedPepSauce);
        Button btnTomatoPaste=(Button) findViewById(R.id.btn_oil_TomatoPaste);
        Button btnTomatoSauce=(Button) findViewById(R.id.btn_oil_TomatoSauce);



        btnOliveOil.setOnClickListener(this);
        btnCanolaOil.setOnClickListener(this);
        btnVegetableOil.setOnClickListener(this);
        btnPeanutOil.setOnClickListener(this);
        btnCookingSpray.setOnClickListener(this);
        btnShortening.setOnClickListener(this);
        btnRedPepperSauce.setOnClickListener(this);
        btnTomatoPaste.setOnClickListener(this);
        btnTomatoSauce.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_oil_OliveOil:
                categoryListActivity.ingredientsList[categoryListActivity.count]="OliveOil";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_CanolaOil:
                categoryListActivity.ingredientsList[categoryListActivity.count]="CanolaOil";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_VegetableOil:
                categoryListActivity.ingredientsList[categoryListActivity.count]="VegetableOil";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_PeanutOil:
                categoryListActivity.ingredientsList[categoryListActivity.count]="PeanutOil";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_CookingSpray:
                categoryListActivity.ingredientsList[categoryListActivity.count]="CookingSpray";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_Shortening:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Shortening";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_RedPepSauce:
                categoryListActivity.ingredientsList[categoryListActivity.count]="RedPepperSauce";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_TomatoPaste:
                categoryListActivity.ingredientsList[categoryListActivity.count]="TomatoPase";
                categoryListActivity.count++;
                break;

            case R.id.btn_oil_TomatoSauce:
                categoryListActivity.ingredientsList[categoryListActivity.count]="TomatoSauce";
                categoryListActivity.count++;
                break;
        }
    }
}
