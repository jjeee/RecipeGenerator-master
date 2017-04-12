package edu.dtcc.cis282student.recipegenerator.ui;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class DairyList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        Button btnEgg=(Button) findViewById(R.id.btn_dairy_Egg);
        Button btnMilk=(Button) findViewById(R.id.btn_dairy_Milk);
        Button btnHeavyCream=(Button) findViewById(R.id.btn_dairy_HeavyCream);
        Button btnButter=(Button) findViewById(R.id.btn_dairy_Butter);
        Button btnSourCream=(Button) findViewById(R.id.btn_dairy_SourCream);
        Button btnCheddar=(Button) findViewById(R.id.btn_dairy_Cheddar);
        Button btnCreamCheese=(Button) findViewById(R.id.btn_dairy_CreamCheese);
        Button btnYogurt=(Button) findViewById(R.id.btn_dairy_Yogurt);
        Button btnCream=(Button) findViewById(R.id.btn_dairy_Cream);



        btnEgg.setOnClickListener(this);
        btnMilk.setOnClickListener(this);
        btnHeavyCream.setOnClickListener(this);
        btnButter.setOnClickListener(this);
        btnSourCream.setOnClickListener(this);
        btnCheddar.setOnClickListener(this);
        btnCreamCheese.setOnClickListener(this);
        btnYogurt.setOnClickListener(this);
        btnCream.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_dairy_Egg:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Egg";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_Milk:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Milk";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_HeavyCream:
                categoryListActivity.ingredientsList[categoryListActivity.count]="HeavyCream";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_Butter:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Butter";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_SourCream:
                categoryListActivity.ingredientsList[categoryListActivity.count]="SourCream";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_Cheddar:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cheddar";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_CreamCheese:
                categoryListActivity.ingredientsList[categoryListActivity.count]="CreamCheese";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_Yogurt:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Yogurt";
                categoryListActivity.count++;
                break;

            case R.id.btn_dairy_Cream:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cream";
                categoryListActivity.count++;
                break;
        }
    }
}
