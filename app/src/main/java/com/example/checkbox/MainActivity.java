package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza, coffe, burger;
    Button billButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        pizza = (CheckBox) findViewById(R.id.PizzaOne);
        coffe = (CheckBox) findViewById(R.id.CoffeOne);
        burger = (CheckBox) findViewById(R.id.BurgerOne);

        billButton = (Button) findViewById(R.id.Amount);

        billButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalSum = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected items: ");
                if(pizza.isChecked()){
                    result.append("\n pizz 100 repuee");
                    totalSum += 100;
                }

                if(pizza.isChecked()){
                    result.append("\n Coffe 50 rupees: ");
                            totalSum  += 50;
                }

                if (pizza.isChecked()) {
                    result.append("\n burger is 120 pray[ace ");
                    totalSum +=120;
            }
                result.append("\n total: t"+ totalSum + "Rs: ");
                Toast.makeText(getApplicationContext(),"total amount"+result, Toast.LENGTH_LONG).show();

        }
        });
    }

}