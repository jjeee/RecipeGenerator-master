package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class VegetableList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        Button btnGarlic=(Button) findViewById(R.id.btn_vegetable_Garlic);
        Button btnLettuce=(Button) findViewById(R.id.btn_vegetable_Lettuce);
        Button btnCarrot=(Button) findViewById(R.id.btn_vegetable_Carrot);
        Button btnTomato=(Button) findViewById(R.id.btn_vegetable_Tomato);
        Button btnBellPepper=(Button) findViewById(R.id.btn_vegetable_BellPep);
        Button btnCorn=(Button) findViewById(R.id.btn_vegetable_Corn);
        Button btnPotato=(Button) findViewById(R.id.btn_vegetable_Potato);
        Button btnOnion=(Button) findViewById(R.id.btn_vegetable_Onion);
        Button btnKidneyBean=(Button) findViewById(R.id.btn_vegetable_KidneyBeans);



        btnGarlic.setOnClickListener(this);
        btnLettuce.setOnClickListener(this);
        btnCarrot.setOnClickListener(this);
        btnTomato.setOnClickListener(this);
        btnBellPepper.setOnClickListener(this);
        btnCorn.setOnClickListener(this);
        btnPotato.setOnClickListener(this);
        btnOnion.setOnClickListener(this);
        btnKidneyBean.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_vegetable_Garlic:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Garlic";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_Lettuce:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Lettuce";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_Carrot:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Carrot";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_Tomato:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Tomato";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_BellPep:
                categoryListActivity.ingredientsList[categoryListActivity.count]="BellPepper";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_Corn:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Corn";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_Potato:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Potato";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_Onion:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Onion";
                categoryListActivity.count++;
                break;

            case R.id.btn_vegetable_KidneyBeans:
                categoryListActivity.ingredientsList[categoryListActivity.count]="KidneyBeans";
                categoryListActivity.count++;
                break;
        }
    }
}
