package ru.banana.textquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    boolean зашёлВДом = false;
    boolean увиделСтраннуюФигуру = false ;
    boolean сваливаем = false;
    boolean рассказОФантоме = false;
    boolean подробныйРассказОФантоме = false;
    boolean глубокомысленныйРазговорОФантоме = false;
    boolean чтоТоУслышал = false;
    boolean долгоеНахождениеВПараднойДома = false;
    boolean забралсяНаЧердак = false;
    boolean описаниеЗвука = false;
    boolean опасныйПоходВКонец = false;
    boolean лестнрца = false;
    boolean наЧердаке = false;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // создаём меню
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_item:
                // сортируем массив
                Intent intent = new Intent(FirstSceneActivity.this, AboutActiviti.class);
                startActivity(intent);

                return true;
            default:
                return true;



            case R.id.perezapusk_item:
                // сортируем массив
                intent = new Intent(FirstSceneActivity.this, FirstSceneActivity.class);
                startActivity(intent);
                finish();

                return true;



        }

    }
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
        Scene scene = new Scene("Дом. Улица. Фонарь.", "Зайти в дом", "Осмотреться");
        if (location.equals("Улица")) {
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
            }
        } else if (location.equals("Чердак")) {
            scene.description = "Наверное, но давай попробуем более сложный путь а?";
            scene.action1 = "Щя ток перезапущу";
            scene.action2 = "Мне и так норм";
        } else if (location.equals("Дом")) {
            if (зашёлВДом) {
                scene.description = "Я внутри. Здесь очень мрачно. Иии... О боже!";
                scene.action1 = "Что там?";
                scene.action2 = "Там кто-то есть?";

            }if (увиделСтраннуюФигуру){
                scene.description = "Кажется что-то промелькнуло передо мной. Как будто фантом, или нечто хуже! ";
                scene.action1 = "Ты уверен что тебе не показалось?";
                scene.action2 = "Жуть какая. Давай свалим отсюда?";
            }if (сваливаем){
                scene.description = "Вы так и не узнали что находилось на чердке. Вы не справились с заданием полученным в Миннистерсве. Вас деактивируют через трое суток.На данный момент вы числитесь среди гловарей бандитов. И вы так и неузнали имени главного персонажа.";
                scene.action1 = "Переиграть!";
                scene.action2 = "Ок";
            }
            if (рассказОФантоме){
                scene.description = "Это.... это было как тень. Я очень хочу что бы мне это показалось. Ладно. ОНО было как тень, но я чётко разглядел его, а точнее её очертания";
                scene.action1 = "В смысле, Фантом что девушка?";
                scene.action2 = "Чем дальше в лес тем больше дров! Хватит разглагольсвовать идём дальше!";

            }if (подробныйРассказОФантоме){
                scene.description = "Нууу..... НАсколько я мог увидеть, то да! Но я могу и ошибаться.";
                scene.action1 = "Ладно, понял, пора валить.";
                scene.action2 = "Можешь описать е внешность?";
            }if (глубокомысленныйРазговорОФантоме) {
                scene.description = "У неё короткие волосы,острый подбородок... короче чё я говорю! Представь Дженнифер Лоуренс в синем костюме!";
                scene.action1 = "СТОП! Как ты увидел синий?";
                scene.action2 = "Ладно у тебя там всё в порядке?";
            }if (чтоТоУслышал) {
                scene.description = "Тихо! Я что то услышал!";
                scene.action1 = "Что это?";
                scene.action2 = "Фантом?";
            }if (описаниеЗвука){
                scene.description = "Нет, наврятли. Скорее Мышь. Во всяком случае я на это надеюсь.";
                scene.action1 = "Я тоже надеюсь на это";
                scene.action2 = "Ладно идём дальше";
            }if (опасныйПоходВКонец){
                scene.description = "Лано. Хватит разглагольствовать! Я пошёл! Здесь развитвление. Есть лестница, а есть подвал(НЕДОСТУПеН)";
                scene.action1 = "Только лестница!";
                scene.action2 = "(Ну выбора у тебя нет)";
            }if (лестнрца) {
                scene.description = "Ну ладно. Я полез! Иииии..... Отлично! Я на чердаке! И здесь.....";
                scene.action1 = "Что,что,что???" ;
                scene.action2 = "Да что уже. Не томи!";
            }if (наЧердаке){
                scene.description = ".................................. [Этап закончен!] [Досвидания]";
                scene.action1 = "Эээээ! Куда!";
                scene.action2 = "Ну ладно.";
            }
        }

        return scene;
    }


    public void doAction(String action) {
        if (location.equals("Улица")) {
            if (action.equals("Зайти в дом")) {
                location = "Дом";
                зашёлВДом = true;
            }else if (action.equals("Осмотреться")) {
                осмотрелсяЛиНаУлице = true;
            } else if (action.equals("Да.Оставь")) {
                попробовалВзятьКошку = true;
            } else if (action.equals("Ладно возьми")) {
                попробовалВзобратьсяНаЧердак = true;
            } else if (action.equals("Что там?")) {
                boolean забралсяНаЧердак = true;
            }
        } else if (location.equals("Чердак")) {

        } else if (location.equals("Дом")){
            if (action.equals("Что там?")) {
                увиделСтраннуюФигуру = true;

            }else  if (action.equals("Жуть какая. Давай свалим отсюда?")) {
                location = "гдетоОченьДалеко";
                сваливаем = true;
            }else if (action.equals("Ты уверен что тебе не показалось?")){
                рассказОФантоме = true;
            }else  if (action.equals("В смысле, Фантом что девушка?")){
                подробныйРассказОФантоме = true;
            }else  if (action.equals("Можешь описать е внешность?")){
                глубокомысленныйРазговорОФантоме = true;
                boolean долгоеНахождениеВПараднойДома = true;
            }else if (action.equals("СТОП! Как ты увидел синий?")){
                чтоТоУслышал = true;
            }else  if (action.equals("Фантом?")) {
                описаниеЗвука = true;
            }else  if (action.equals("Я тоже надеюсь на это"))  {
                опасныйПоходВКонец = true;
            }else if (action.equals("Только лестница!")){
                лестнрца = true;
            }else if (action.equals("Что,что,что???")){
                наЧердаке = true;
            }
        }


        Scene новаяСцена = createScene();
        перейтиКСцене(новаяСцена);
    }
}
