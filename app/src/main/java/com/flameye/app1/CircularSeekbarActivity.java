package com.flameye.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.triggertrap.seekarc.SeekArc;

public class CircularSeekbarActivity extends AppCompatActivity {
    private SeekArc mSeekArc;
    private TextView mSeekArcProgress;
    private Button simButton;
    private Button mediumButton;
    private Button highButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_seekbar);

        mSeekArc = (SeekArc) findViewById(R.id.seekArc);
        mSeekArcProgress = (TextView)findViewById(R.id.seekArcProgress1);

        simButton = (Button)findViewById(R.id.buttonSim);
        mediumButton = (Button) findViewById(R.id.buttonMedium);
        highButton = (Button)findViewById(R.id.buttonHigh);

        if(mSeekArc != null) {
            mSeekArc.setOnSeekArcChangeListener(new SeekArc.OnSeekArcChangeListener() {
                @Override
                public void onProgressChanged(SeekArc seekArc, int i, boolean b) {
                mSeekArcProgress.setText(String.valueOf(i));
                }

                @Override
                public void onStartTrackingTouch(SeekArc seekArc) {

                }

                @Override
                public void onStopTrackingTouch(SeekArc seekArc) {

                }
            });
        }
        if(simButton != null && mediumButton != null && highButton != null && mSeekArc != null) {
            simButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mSeekArc.setProgress(0);
                }
            });

            mediumButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mSeekArc.setProgress(180);
                }
            });

            highButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mSeekArc.setProgress(300);
                }
            });
        }
    }



}
