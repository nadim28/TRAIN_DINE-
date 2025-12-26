package com.marty.yummy.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.marty.yummy.R;

public class TrainInfo extends Activity  {
    private TextView textViewtrainName,textViewDepartureTime,textViewArrivalTime,textViewTrainNumber,textViewTrainCoach;
    private EditText editTextTrainName,editTextDepartureTime,editTextArrivalTime,editTextTrainNumber;
    private Button buttonSubmit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traininfo);

        textViewtrainName=(TextView) findViewById(R.id.textViewTrainName);
        textViewDepartureTime=findViewById(R.id.textViewDepartureTime);
        textViewArrivalTime=findViewById(R.id.textViewArrivalTime);
        textViewTrainNumber=findViewById(R.id.textViewTrainNumber);

        editTextTrainName=findViewById(R.id.editTextTrainName);
        editTextDepartureTime=findViewById(R.id.editTextDepartureTime);
        editTextArrivalTime=findViewById(R.id.editTextArrivalTime);
        editTextTrainNumber=findViewById(R.id.editTextTrainNumber);

        buttonSubmit=findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextTrainName.getText().toString().equals("BijoyExpress") && editTextTrainNumber.getText().toString().equals("786") ){
                   nextPhase();
                }
                else {
                    Toast.makeText(TrainInfo.this,"Wrong Info",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    void nextPhase(){
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

}
