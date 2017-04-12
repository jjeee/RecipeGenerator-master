package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class GrainList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grain);

        Button btnFlour=(Button) findViewById(R.id.btn_grain_Flour);
        Button btnRice=(Button) findViewById(R.id.btn_grain_Rice);
        Button btnCornTortilla=(Button) findViewById(R.id.btn_grain_CornTortilla);
        Button btnBread=(Button) findViewById(R.id.btn_grain_Bread);
        Button btnPasta=(Button) findViewById(R.id.btn_grain_Pasta);
        Button btnSemolina=(Button) findViewById(R.id.btn_grain_Semolina);
        Button btnCereal=(Button) findViewById(R.id.btn_grain_Cereal);
        Button btnBagel=(Button) findViewById(R.id.btn_grain_Bagel);
        Button btnPita=(Button) findViewById(R.id.btn_grain_Pita);



        btnFlour.setOnClickListener(this);
        btnRice.setOnClickListener(this);
        btnCornTortilla.setOnClickListener(this);
        btnBread.setOnClickListener(this);
        btnPasta.setOnClickListener(this);
        btnSemolina.setOnClickListener(this);
        btnCereal.setOnClickListener(this);
        btnBagel.setOnClickListener(this);
        btnPita.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_grain_Flour:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Flour";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Rice:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Rice";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_CornTortilla:
                categoryListActivity.ingredientsList[categoryListActivity.count]="CornTortilla";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Bread:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Bread";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Pasta:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Pasta";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Semolina:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Semolina";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Cereal:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Cereal";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Bagel:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Bagel";
                categoryListActivity.count++;
                break;

            case R.id.btn_grain_Pita:
                categoryListActivity.ingredientsList[categoryListActivity.count]="Pita";
                categoryListActivity.count++;
                break;
        }
    }
}
