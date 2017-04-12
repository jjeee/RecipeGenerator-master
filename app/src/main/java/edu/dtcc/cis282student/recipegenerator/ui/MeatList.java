package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class MeatList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        Button btnChicken=(Button) findViewById(R.id.btn_meat_ChickenBreast);
        Button btnGrndBeef=(Button) findViewById(R.id.btn_meat_GrndBeef);
        Button btnPorkchop=(Button) findViewById(R.id.btn_meat_Porkchop);
        Button btnLamb=(Button) findViewById(R.id.btn_meat_Lamb);
        Button btnTurkey=(Button) findViewById(R.id.btn_meat_Turkey);
        Button btnBeefSteak=(Button) findViewById(R.id.btn_meat_beefSteak);
        Button btnSausage=(Button) findViewById(R.id.btn_meat_Sausage);
        Button btnBacon=(Button) findViewById(R.id.btn_meat_Bacon);
        Button btnVeal=(Button) findViewById(R.id.btn_meat_Veal);

        btnChicken.setOnClickListener(this);
        btnGrndBeef.setOnClickListener(this);
        btnPorkchop.setOnClickListener(this);
        btnLamb.setOnClickListener(this);
        btnTurkey.setOnClickListener(this);
        btnBeefSteak.setOnClickListener(this);
        btnSausage.setOnClickListener(this);
        btnBacon.setOnClickListener(this);
        btnVeal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_meat_ChickenBreast:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Chicken";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_GrndBeef:
                categoryListActivity.ingredientsList[categoryListActivity.count]="GrndBeef";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_Porkchop:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Porkchop";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_Lamb:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Lamb";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_Turkey:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Turkey";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_beefSteak:
                categoryListActivity.ingredientsList[categoryListActivity.count]="beefSteak";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_Sausage:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Sausage";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_Bacon:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Bacon";
                categoryListActivity.count++;
                break;

            case R.id.btn_meat_Veal:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Veal";
                categoryListActivity.count++;
                break;
        }
    }
}
