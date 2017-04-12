package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class NutList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut);

        Button btnPeanut=(Button) findViewById(R.id.btn_nut_Peanut);
        Button btnCashew=(Button) findViewById(R.id.btn_nut_Cashew);
        Button btnWalnut=(Button) findViewById(R.id.btn_nut_Walnut);
        Button btnPistachio=(Button) findViewById(R.id.btn_nut_Pistachio);
        Button btnAlmond=(Button) findViewById(R.id.btn_nut_Almond);
        Button btnPeanutButter=(Button) findViewById(R.id.btn_nut_PeanutButter);
        Button btnHazelnut=(Button) findViewById(R.id.btn_nut_Hazelnut);
        Button btnMacadamia=(Button) findViewById(R.id.btn_nut_Macadamia);
        Button btnPecan=(Button) findViewById(R.id.btn_nut_Pecan);



        btnPeanut.setOnClickListener(this);
        btnCashew.setOnClickListener(this);
        btnWalnut.setOnClickListener(this);
        btnPistachio.setOnClickListener(this);
        btnAlmond.setOnClickListener(this);
        btnPeanutButter.setOnClickListener(this);
        btnHazelnut.setOnClickListener(this);
        btnMacadamia.setOnClickListener(this);
        btnPecan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_nut_Peanut:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Peanut";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Cashew:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cashew";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Walnut:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Walnut";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Pistachio:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Pistachio";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Almond:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Almond";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_PeanutButter:
                categoryListActivity.ingredientsList[categoryListActivity.count]="PeanutButter";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Hazelnut:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Hazelnut";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Macadamia:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Macadamia";
                categoryListActivity.count++;
                break;

            case R.id.btn_nut_Pecan:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Pecan";
                categoryListActivity.count++;
                break;
        }
    }
}
