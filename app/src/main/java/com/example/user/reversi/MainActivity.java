package com.example.user.reversi;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    /*LinearLayout mainLayout;*/
    private Animation in, in1, out,out1,fedout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button playBtn = findViewById(R.id.play_btn);
        final Button playOnLineBtn = findViewById(R.id.online_btn);
        final Button settingBtn = findViewById(R.id.setting_btn);
        final Button recordsBtn = findViewById(R.id.records_btn);
        final Button exitBtn = findViewById(R.id.exit_btn);

        in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        in1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in1);
        out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);
        out1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out1);
        fedout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fedout);

        playBtn.setAnimation(in);
        playOnLineBtn.setAnimation(in1);
        settingBtn.setAnimation(in);
        recordsBtn.setAnimation(in1);
        exitBtn.setAnimation(in);

        /*mainLayout = findViewById(R.id.main_layout);
        LayoutTransition transition = new LayoutTransition();
        transition.enableTransitionType(LayoutTransition.APPEARING);
        mainLayout.setLayoutTransition(transition);*/


        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        /*        playBtn.setAnimation(out);
                playOnLineBtn.setAnimation(out1);
                settingBtn.setAnimation(out);
                recordsBtn.setAnimation(out1);
                exitBtn.setAnimation(out);*/
                Intent intent = new Intent(MainActivity.this, ActivityMatchSettings.class);
                startActivity(intent);
            }
        });


        playOnLineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                final View dialogView = getLayoutInflater().inflate(R.layout.login_dialog, null);

                builder.setView(dialogView);

                EditText userNameET = dialogView.findViewById(R.id.input_username);
                EditText passwordET = dialogView.findViewById(R.id.input_password);
                Button loginBtn = dialogView.findViewById(R.id.login_btn);
                Button singUpBtn = dialogView.findViewById(R.id.sing_up_btn);

                final AlertDialog dialog = builder.create();

                loginBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });

                singUpBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                dialog.show();
            }
        });


        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivitySettings.class);
                startActivity(intent);
            }
        });


        recordsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
