package ru.banana.textquest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class TextQuest extends AppCompatActivity {

    Scene startScene;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_quest);

        Action[] startSceneActions = new Action[3];
        startSceneActions[0] = new Action("Взять дом.");
        startSceneActions[1] = new Action("Зайти в дом.");
        startSceneActions[2] = new Action("Осмотреться.");
        startScene = new Scene("Дом. Ночь. Фонарь.Я стою на улице возле страшного дома.Меня окутывает страх, но я не могу отступить.", startSceneActions);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(startScene.description);


        ListView listView = (ListView) findViewById(R.id.listView);
        int itemLayout = android.R.layout.simple_list_item_1;
        ArrayAdapter adapter = new ArrayAdapter(this, itemLayout, startScene.actions);
        listView.setAdapter(adapter);

    }


}

