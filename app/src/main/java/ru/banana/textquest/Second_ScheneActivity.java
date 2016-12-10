package ru.banana.textquest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import static ru.banana.textquest.R.id.textView;

public class Second_ScheneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_quest);

        Action action = (Action) getIntent().getSerializableExtra("КВЕСТ");

        // ищем элементы
        TextView textView = (TextView) findViewById(R.id.textView);
        ListView listView = (ListView) findViewById(R.id.listView);
        int itemLayout = android.R.layout.simple_list_item_1;

        // заполняем их в зависимости от action
        if (action.описание.equals("Зайти в дом.")) {
            Action[] startSceneActions = new Action[1];
            startSceneActions[0] = new Action("Осмотреть дом.");
            Scene scene = new Scene("Дом. Ночь. Фонарь.Я стою на улице возле страшного дома.Меня окутывает страх, но я не могу отступить.", startSceneActions);

            textView.setText(scene.description);
            Quest_Adapter adapter = new Quest_Adapter(this, itemLayout, scene.actions);
            listView.setAdapter(adapter);
        } else {
            // TODO
        }
    }

}
