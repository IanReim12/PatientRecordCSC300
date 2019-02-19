package com.example.broncoian2.patientrecordcsc300;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class PatientRecordAddNewActivity extends ArrayAdapter
{
    private Context mContext;
    private PatientRecord[] patientRecordList = new PatientRecord[1000];
    private int textViewResourceId;

    public PatientRecordAddNewActivity(Context context, int textViewResourceId,
                                       PatientRecord[] list)
    {
        super(context, textViewResourceId, list);
        mContext = context;
        patientRecordList = list;
        this.textViewResourceId = textViewResourceId;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;
        if (listItem == null)
        {
            listItem = LayoutInflater.from(mContext).inflate(this.textViewResourceId, parent,false);
        }
        PatientRecord pr = this.patientRecordList[position];
        TextView firstNameET = (TextView)listItem.findViewById(R.id.firstNameET);
        TextView middleInitialET = (TextView)listItem.findViewById(R.id.middleInitialET);
        TextView lastNameET = (TextView)listItem.findViewById(R.id.lastNameET);
        TextView height_feet_ET = (TextView)listItem.findViewById(R.id.height_feet_ET);
        TextView height_inch_ET = (TextView)listItem.findViewById(R.id.height_inch_ET);
        TextView ageET = (TextView)listItem.findViewById(R.id.ageET);
        firstNameET.setText(pr.getFirst_name());
        middleInitialET.setText(pr.getMiddle_initial());
        lastNameET.setText(pr.getLast_name());

        return listItem;
    }




    //public void onAddButtonPressed(View v)
    {
        //EditText firstNameET = (EditText)this.findViewById(R.id.firstNameET);
        //EditText lastNameET = (EditText)this.findViewById(R.id.lastNameET);
        //EditText middleInitialET = (EditText)this.findViewById(R.id.middleInitialET);
        //EditText ageET = (EditText)this.findViewById(R.id.ageET);
        //EditText height_feet_ET = (EditText)this.findViewById(R.id.height_feet_ET);
        //EditText height_inch_ET = (EditText)this.findViewById(R.id.height_inch_ET);


        //String fname = firstNameET.getText().toString();
        //String lname = lastNameET.getText().toString();
        //char middleInitial = middleInitialET.getText().toString().charAt(0);
        //int age = Integer.parseInt(ageET.getText().toString());
        //int height_F = Integer.parseInt(height_feet_ET.getText().toString());
        //int height_I = Integer.parseInt(height_inch_ET.getText().toString());
        //PatientRecord pr = new PatientRecord(fname, lname, middleInitial, age, height_F, height_I);
       //Core.addPatientRecord(pr);
        //pr.display();
        //this.finish();

    }

}
