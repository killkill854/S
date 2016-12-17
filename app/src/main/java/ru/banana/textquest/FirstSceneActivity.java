package ru.banana.textquest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class FirstSceneActivity extends AppCompatActivity {

    Scene startScene;
    ListView listView;
    Button button;
    public Button button1;
    public Button button2;
    ArrayAdapter adapter;

    String location = "Улица";
    boolean осмотрелсяЛиНаУлице = false;
    boolean попробовалВзятьКошку = false;
    boolean попробовалВзобратьсяНаЧердак = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_quest);

        listView = (ListView) findViewById(R.id.listView);
        button1 = (Button) findViewById(R.id.button3);
        button2 = (Button) findViewById(R.id.button4);
        final int itemLayout = android.R.layout.simple_list_item_1;
        adapter = new ArrayAdapter<String>(this, itemLayout, new ArrayList<String>());
        listView.setAdapter(adapter);

        Scene перваяСцена = createScene();
        перейтиКСцене(перваяСцена);
    }

    public void перейтиКСцене(final Scene scene) {
        // dobavit description
        adapter.add(scene.description);

        // pereimenovat knopki
        button1.setText(scene.action1);
        button2.setText(scene.action2);

        // veshaem obrabot4iki nagatiia
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doAction(scene.action1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doAction(scene.action2);
            }
        });
    }

    Scene createScene() {
        if (location.equals("Улица")) {
            Scene scene = new Scene("Дом. Улица. Фонарь.", "Зайти в дом", "Осмотреться");
            if (осмотрелсяЛиНаУлице) {
                scene.description = "Дом. Улица. Фонарь.Иии.... Я нашёл крюк-кошку! Думаю она мне поможет. Как думаешь?";
                scene.action1 = "Да.Оставь";
                scene.action2 = "Нет.Положи откуда взял!";
            }
            if (попробовалВзятьКошку) {
                scene.description = "Я же смогу пробраться наверх, к чердаку!";
                scene.action1 = "Я сказал 'НЕТ!'";
                scene.action2 = "Ладно возьми";
            }
            if (попробовалВзобратьсяНаЧердак) {
                scene.description = "Ура! Я на чердаке";
                scene.action1 = "Что там?";
                scene.action2 = "Это конец?";

                return scene;
            }
        }

        return new Scene("", "", "");
    }


    public void doAction(String action) {
        if (location.equals("Улица")) {
            if (action.equals("Зайти в дом")) {
                location = "Дом";
            } else if (action.equals("Осмотреться")) {
                осмотрелсяЛиНаУлице = true;
            } else if (action.equals("Да.Оставь")) {
                попробовалВзятьКошку = true;
            } else if (action.equals("Ладно возьми")) {
                попробовалВзобратьсяНаЧердак = true;
            }
        }

        Scene новаяСцена = createScene();
        перейтиКСцене(новаяСцена);
    }

}
