package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class SeaList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea);

        Button btnSalmon=(Button) findViewById(R.id.btn_sea_Salmon);
        Button btnTrout=(Button) findViewById(R.id.btn_sea_Trout);
        Button btnSeaBass=(Button) findViewById(R.id.btn_sea_SeaBass);
        Button btnShrimp=(Button) findViewById(R.id.btn_sea_Shrimp);
        Button btnTuna=(Button) findViewById(R.id.btn_sea_Tuna);
        Button btnTilapia=(Button) findViewById(R.id.btn_sea_Tilapia);
        Button btnHalibut=(Button) findViewById(R.id.btn_sea_Halibut);
        Button btnMackerel=(Button) findViewById(R.id.btn_sea_Mackerel);
        Button btnAnchovy=(Button) findViewById(R.id.btn_sea_Anchovy);



        btnSalmon.setOnClickListener(this);
        btnTrout.setOnClickListener(this);
        btnSeaBass.setOnClickListener(this);
        btnShrimp.setOnClickListener(this);
        btnTuna.setOnClickListener(this);
        btnTilapia.setOnClickListener(this);
        btnHalibut.setOnClickListener(this);
        btnMackerel.setOnClickListener(this);
        btnAnchovy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_sea_Salmon:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Salmon";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Trout:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Trout";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_SeaBass:
                categoryListActivity.ingredientsList[categoryListActivity.count]="SeaBass";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Shrimp:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Shrimp";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Tuna:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Tuna";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Tilapia:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Tilapia";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Halibut:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Halibut";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Mackerel:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Mackerel";
                categoryListActivity.count++;
                break;

            case R.id.btn_sea_Anchovy:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Anchovy";
                categoryListActivity.count++;
                break;
        }
    }
}
