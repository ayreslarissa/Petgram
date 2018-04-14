package com.journaldev.recyclerviewcardview.ListaAnimais;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

import com.journaldev.recyclerviewcardview.R;

public class InfoActivity extends AppCompatActivity {
    private DataModel data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);


        data = new DataModel();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            collapsingToolbar.setTitle(data.getName());
            collapsingToolbar.setBackgroundResource(data.getImage());
        }



    }
}
