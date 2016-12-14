package ru.banana.textquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;



public class FirstSceneActivity extends AppCompatActivity {

    Scene startScene;
    ListView listView;
    Button button;
    public Button button1 = (Button) findViewById(R.id.button3);
    public Button button2 = (Button) findViewById(R.id.button4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_quest);

        Action[] startSceneActions = new Action[3];
        startSceneActions[0] = new Action("Стоять около дома.");
        startSceneActions[1] = new Action("Зайти в дом.");
        startSceneActions[2] = new Action("Осмотреться.");
        startScene = new Scene("Дом. Ночь. Фонарь.Я стою на улице возле страшного дома.Меня окутывает страх, но я не могу отступить.", startSceneActions);



        final ListView listView = (ListView) findViewById(R.id.listView);
        final int itemLayout = android.R.layout.simple_list_item_1;
        Quest_Adapter adapter = new Quest_Adapter(this, itemLayout, startScene.actions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Action mobaction = startScene.actions[position];
                if (mobaction.описание.equals("Зайти в дом.")) {
                    Action[] startSceneActions = new Action[1];
                    startSceneActions[0] = new Action("Осмотреть дом.");
                    Scene scene = new Scene("Дом. Ночь. Фонарь.Я стою на улице возле страшного дома.Меня окутывает страх, но я не могу отступить.", startSceneActions);


                    Quest_Adapter adapter = new Quest_Adapter(FirstSceneActivity.this, itemLayout, scene.actions);
                    listView.setAdapter(adapter);
                } else {

                }
            }
        });

        getSupportActionBar().setTitle("Привеик");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.);








    }





}