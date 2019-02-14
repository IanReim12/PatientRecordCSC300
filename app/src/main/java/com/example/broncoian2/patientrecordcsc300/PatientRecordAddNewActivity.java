package com.example.broncoian2.patientrecordcsc300;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PatientRecordAddNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_record_add_new);
    }
    public void onAddButtonPressed(View v)
    {
        EditText firstNameET = (EditText)this.findViewById(R.id.firstNameET);
        EditText lastNameET = (EditText)this.findViewById(R.id.lastNameET);
        EditText middleInitialET = (EditText)this.findViewById(R.id.middleInitialET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);
        EditText height_feet_ET = (EditText)this.findViewById(R.id.height_feet_ET);
        EditText height_inch_ET = (EditText)this.findViewById(R.id.height_inch_ET);


        String fname = firstNameET.getText().toString();
        String lname = lastNameET.getText().toString();
        char middleInitial = middleInitialET.getText().toString().charAt(0);
        int age = Integer.parseInt(ageET.getText().toString());
        int height_F = Integer.parseInt(height_feet_ET.getText().toString());
        int height_I = Integer.parseInt(height_inch_ET.getText().toString());
        PatientRecord pr = new PatientRecord(fname, lname, middleInitial, age, height_F, height_I);
        Core.addPatientRecord(pr);
        pr.display();
        this.finish();
 
    }

}
