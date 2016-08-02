package com.reversible.expandablesearchview;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;

import com.reversible.expandablesearchview.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        ExpandableSearchView expandableSearchView = (ExpandableSearchView) findViewById(R.id.expandableSearchView);
        expandableSearchView.setOnSearchActionListener(new ExpandableSearchView.OnSearchActionListener() {
            @Override
            public void onSearchAction(String text) {
                //
                progressBar.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                    }
                }, 3000);
            }
        });
    }
}
