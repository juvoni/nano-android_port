package com.juvoni.projectportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button spotifyBtn, scoresBtn, libraryBtn, builditBtn, xyzBtn, capstoneBtn;

    private String preToast = "This will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyBtn = (Button) findViewById(R.id.spotify_id);
        spotifyBtn.setOnClickListener(this);
        scoresBtn = (Button) findViewById(R.id.score_id);
        scoresBtn.setOnClickListener(this);
        libraryBtn = (Button) findViewById(R.id.library_id);
        libraryBtn.setOnClickListener(this);
        builditBtn = (Button) findViewById(R.id.buildit_id);
        builditBtn.setOnClickListener(this);
        xyzBtn = (Button) findViewById(R.id.xyz_id);
        xyzBtn.setOnClickListener(this);
        capstoneBtn = (Button) findViewById(R.id.capstone_id);
        capstoneBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){

            Button b = (Button)view;
            String buttonText = b.getText().toString();
            Toast.makeText(getBaseContext(), preToast + buttonText , Toast.LENGTH_LONG).show();

    }

}
