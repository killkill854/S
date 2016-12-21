package ru.banana.textquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActiviti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activiti);

        View bigLayout = findViewById(R.id.activity_start_activiti);
        bigLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActiviti.this, FirstSceneActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
