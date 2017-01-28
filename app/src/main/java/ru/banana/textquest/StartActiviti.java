package ru.banana.textquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActiviti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activiti);

        View bigLayout = findViewById(R.id.activity_start_activiti);
        bigLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {

                    String[] strings = new String[999999999];
                    for (int i = 0; i < 999999999; ++i) {
                        strings[i] = "АААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА";
                    }
                } catch (OutOfMemoryError e){
                    Log.w("Ты слишком много ешь!",e.toString());
                }

                    // Intent intent = new Intent(StartActiviti.this, FirstSceneActivity.class);
                    // startActivity(intent);
                    //finish();
                }


        });
        final ImageView imageView = (ImageView) findViewById(R.id.imageView2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().rotation(360*999).scaleX(2).scaleY(2).setDuration(200*1000).alpha(1).start();

            }
        };

        imageView.setOnClickListener(listener);
    }
}
