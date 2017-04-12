package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class FruitList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        Button btnCherry=(Button) findViewById(R.id.btn_fruit_Cherry);
        Button btnWatermelon=(Button) findViewById(R.id.btn_fruit_Watermelon);
        Button btnCantaloupe=(Button) findViewById(R.id.btn_fruit_Cantaloupe);
        Button btnGrape=(Button) findViewById(R.id.btn_fruit_Grape);
        Button btnOrange=(Button) findViewById(R.id.btn_fruit_Orange);
        Button btnLemon=(Button) findViewById(R.id.btn_fruit_Lemon);
        Button btnStrawberry=(Button) findViewById(R.id.btn_fruit_Strawberry);
        Button btnBanana=(Button) findViewById(R.id.btn_fruit_Banana);
        Button btnApple=(Button) findViewById(R.id.btn_fruit_Apple);



        btnCherry.setOnClickListener(this);
        btnWatermelon.setOnClickListener(this);
        btnCantaloupe.setOnClickListener(this);
        btnGrape.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnLemon.setOnClickListener(this);
        btnStrawberry.setOnClickListener(this);
        btnBanana.setOnClickListener(this);
        btnApple.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_fruit_Cherry:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cherry";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Watermelon:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Watermelon";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Cantaloupe:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cantaloupe";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Grape:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Grape";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Orange:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Orange";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Lemon:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Lemon";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Strawberry:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Strawberry";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Banana:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Banana";
                categoryListActivity.count++;
                break;

            case R.id.btn_fruit_Apple:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Apple";
                categoryListActivity.count++;
                break;
        }
    }
}
