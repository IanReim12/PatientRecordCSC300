package com.example.broncoian2.patientrecordcsc300;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.broncoian2.patientrecordcsc300.R.layout.list_view_row;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        for(int i = 0; i < Core.bballplayerStrings.length; i++)
        {
            Core.bballplayerStrings[i] = "No entry";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> aa = new ArrayAdapter<String >(this, list_view_row,Core.bballplayerStrings);
        this.listView  = (ListView) this.findViewById(R.id.listView);
        this.listView.setAdapter(aa);


    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        this.listView.invalidateViews();
    }
    public void onAddPatientRecordPressed(View v)
    {
        Intent i = new Intent(this, PatientRecordAddNewActivity.class);
        this.startActivity(i);

    }
}
