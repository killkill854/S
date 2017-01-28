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

    static String LOCATION_STREET = "Улица";

    Scene startScene;
    ListView listView;
    Button button;
    public Button button1;
    public Button button2;
    ArrayAdapter adapter;

    String location = LOCATION_STREET;
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
    boolean ТолькоВниз = false;
    boolean НачалоИстории = false;
    boolean помощ1 = false;
    boolean бугаиЧтотоУслышали = false;
    boolean маленькийСекрет = false;
    boolean очнулся = false;
    boolean kritika = false;
    boolean vigovor = false;
    boolean tijelayaIstoriya = false;
    boolean znakomstvoSMagistrom = false;
    boolean PresidentVladimirPutin  = false;
    boolean asd = false;
    boolean PUTIN = false;
    boolean razgovorSPutinim = false;
    boolean nastoizie = false;
    boolean asr = false;
    boolean booblik = false;
    boolean pravelniiParol = false;
    boolean snovaPravilno = false;
    boolean sokrovisha = false;
    boolean youLive = false;
    boolean iystal = false;
    boolean vtoroy = false;
    boolean yshol = false;
    boolean parolnevernyi = false;
    boolean eshoOdno = false;
    boolean ustalI = false;
    boolean falsename = false;
    boolean naxal = false;
    boolean nevery = false;
    boolean asv = false;




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
        if (location.equals(LOCATION_STREET)) {
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
                scene.action2 = "Только Вниз!";
            }if (лестнрца) {
                scene.description = "Ну ладно. Я полез! Иииии..... Отлично! Я на чердаке! И здесь.....";
                scene.action1 = "Что,что,что???" ;
                scene.action2 = "Да что уже. Не томи!";
            }if (наЧердаке){
                scene.description = ".................................. [Этап закончен!] [Досвидания]";
                scene.action1 = "Эээээ! Куда!";
                scene.action2 = "Ну ладно.";
            }if (ТолькоВниз){
                scene.description = "Так. Лезу. Знаешь здесь очень... АААААААА!!!!";
                scene.action1 = "Что случилось?";
                scene.action2 = "Ты в порядке?";
            }if (НачалоИстории){
                scene.description = "ОТпустите меня! Или вам всем здесь не поздаровиться!";
                scene.action1 = "Дай ИМ жару! Но всё таки кто это?";
                scene.action2 = "Сделай так что бы я слышал вас всех.";
            }if (помощ1) {
                scene.description = "[Объект находится в критическом состоянии.]" +
                        "[Вклюена громкая связь.] ";
                scene.action1 = "Ты там это... Держись!";
                scene.action2 = "....";
            }if (бугаиЧтотоУслышали){
                scene.description = "Ты это слышал?" +
                        "Нет";
                scene.action1 = "[Выключть звук.]";
                scene.action2 = "[Выключть усторйство.]";
            }if (маленькийСекрет){
                scene.description = "Ты помнишь код от защитной двери?" +
                        "Нет" +
                        "Ладно я на листочке записла.... Таак 2247. Кстати если кто то попытается выбраться то код поменяется и его смогу узнать только Я через свои часы!" +
                        "А как ты так сделал?" +
                        "Эту штуку мне сам Магистр дал!" +
                        "Круто! А мне такую же?" +
                        "Незаслужил!";
                scene.action1 = "...";
                scene.action2 = "-Вот блин!-";
            }if (очнулся){
                scene.description= "А? Где я? Друг ты меня слышишь?";
                scene.action1 = "Да, я тебя слышу!";
                scene.action2 = "Нет не слышу!, но читаю!";
            }if (kritika){
                scene.description = "Странно... Ладно потом обсудим. У меня сейчас очень болит голова! Такое чувство что меня чем то ударили.";
                scene.action1 = "Да, лучше присядь.";
                scene.action2 = "Да ладно! Пустяки!";
            }if (vigovor){
                scene.description = "Эмм.... Мне здесь негде сидеть. Давай потом?";
                scene.action1 = "Ну ладно, давай, опиши обстановку.";
                scene.action2 = "Нет. Это важно!";
            }if (tijelayaIstoriya){
                scene.description = "Ладно. Сижу на холодном и отчасти мокром полу.";
                scene.action1 = "Вставай Немедленно! Простудишься!";
                scene.action2 = "Вообщем. 1- Ты не сможешь выбраться без часов которые у ОДного из тех бугаев которые тебя вырубили.2-Код на дверях постоянно меняется. Но я так понимаю это можно остановить. 3- Ты один из немногих кто повстречается с 'Магистром' 4- Тебе нужно будет очень скоро валить!";
            }if (znakomstvoSMagistrom){
                scene.description = "Так! Я ничего не понял! Но я вижу красную жутко мигающую лампочку рядом с указателем и подписью 'Магистр'";
                scene.action1 = "Ладно пошли, потом объясню";
                scene.action2 = "Нет дай сначало объясню!";
            }if (PresidentVladimirPutin){
                scene.description = "Да ну тебя, я пошёл";
                scene.action1= "Да ну тебя!";
                scene.action2 = "Лано, потом.";
            }if (asd){
                scene.description = "Вааау! Если бы ты это видел! Здесь всё покрыто мрамором, а колонны из изумруда! Да такого! Это наверное МИЛЛИАРДЫ стоит!";
                scene.action1 = "Что то не вериться!1";
                scene.action2 = "Там есть кто то кроме тебя?";
            }if (PUTIN){
                scene.description = "Да. Прямо передомной сидит человек. Весь в белом. И возле него двое Охраников в костюмах. Он зовёт меня взглядом и приглашает сесть за стол где лежит чашка(похоже это чай)";
                scene.action1 = "Подойди к нему и спроси, 'Что я здесь делаю' ";
                scene.action2 = "Сядь на столик на котором чай.";
            }if (razgovorSPutinim){
                scene.description = "Здравствуйте. Как к вам можно обращятся?(Магистр)" +
                        "Добрый день!";
                scene.action1 = "Скажи настоящее имя.";
                scene.action2 = "Скажи похожее имя!.";
            }if (nastoizie){
                scene.description= "Моё имя Сергей." +
                        "Прекрасно! Меня зовут Владимир. Я так полагаю вы закончили со своим заданием?(Магистр)" +
                        "С каким заданием?(Сергей)" +
                        "Разве вы не получали задание от своего 'путеводителя' или лучше сказать проводника?(Магистр)";
                scene.action1 = "Скажи, что получил, но просто забыл.";
                scene.action2 = "Я не знаю ни о каком задании!";
            }if (asr){
                scene.description = "Как не получал! (по рации) Это не он! (Вас расстреливают. Конец игры)";
                scene.action1 = "Блин!";
                scene.action2 = "Лан я пошёл.";
            }if (booblik){
                scene.description = "Ладно скажи пароль (Указывает на кружку)";
                scene.action1 = "Бублик!";
                scene.action2 = "Чашка!";
            }if (pravelniiParol){
                scene.description = "Прекрасно! Вы можете быть свободны";
                scene.action1 = "Остаться";
                scene.action2 = "Уйти";
            }if (snovaPravilno){
                scene.description = "Прекрасно! А теперь пройдёмте за наградой!";
                scene.action1 = "Урааа!";
                scene.action2 = "Мне кажаться здесь подвох!";
            }if (sokrovisha){
                scene.description = "'Я сижу. Он кивает, зовёт. Я пошёл. Мы где то под землёй. В такой глуши! Он показывает две двери, на первой : ты уйдёшь один. На второй: выуйдёте вместе.'";
                scene.action1 = "Войди где один.";
                scene.action2 = "Войди где два";
            }if (youLive){
                scene.description = "Поздравляем! Вы выйграли! Если есть какие либо предложения как сделать игру лучше буду вам очень благодарен. Это тестовый вариант. Так жа пишите ваши пожелания и истории. Возможно какая нибудь превратьтся в следующий Text Quest! Спасибо за всё с уажением разработчики!";
                scene.action1 = "Мне не плонравилось!";
                scene.action2 = "Это было круто!";
            }if (iystal){
                scene.description = "Чтож, он своё выбрал. В скором времени вас устранят. Спасибо за игру. Это 2ая из 5 концовок.";
                scene.action1 = "Мне не плонравилось!";
                scene.action2 = "Это было круто!";
            }if (yshol){
                scene.description = "'Вас провожают к выходу. Вы прощаетесь с Сергеем. Вы больше никогда не останитесь прежним. Вы понимаете что вам чегото не хватает. Вы сами отправились в путь. Хоть вы и незнали куда, но вы пришли имеено к этому же дому, вместе с пейджерем который вам подарили на следующее день рожденья. ПОЗДРАВЛЯЕМ! Это Секретная концовка игры (не очень ;-))'";
                scene.action1 = "Ей! Секретики ;>";
                scene.action2 = "Скучно! :[";
            }if (parolnevernyi){
                scene.description = "Не прошло и 5и минут как к вам в комнату ворвались люди в масках с ружьями и в бронежилетах. Вас бысто обсыскали и удаставерившись, что ключ карты у вас нет выпери вас отсюда, со словами'Как он вообще проверку прошёл.' Это было последнее что вы услышали, так как один из оханников сломал переговорное устройство.";
                scene.action1 = "Спасибо за квест. Сейчас попробую ещё раз!";
                scene.action2 = "Нет! Я устал.";
            }if (eshoOdno){
                scene.description="Я устал!" ;
                scene.action1 = "Работай!";
                scene.action2 = "Ну выбора у тебя нет :-(";
            }if (ustalI){
                scene.description ="'(Маг.) Переговаривается по какомуто телефону. Ой! Кажется он меня заметил(М,К,с)'  [Связь оборвалась] [Объект не отвечает.] Это конец. {Godzo!}" ;
                scene.action1 = "Бывает.";
                scene.action2 = "Что такое 'Godzo'?";
            }if (falsename){
                scene.description = "Моё имя Максим." +
                        "Ну чтож, не хотите не говорите. Но, я так или иначе его узнаю. Меня зовут Владимир. Я так полагаю вы закончили со своим заданием?(Магистр)" +
                        "                        С каким заданием?(Сергей)" +
                        "                        Разве вы не получали задание от своего 'путеводителя' или лучше сказать проводника?(Магистр)";
                scene.action1 = "Скажи, что получил, но просто забыл.";
                scene.action2 = "Я не знаю ни о каком задании!";
            }if (naxal){
                scene.description = "Я вроде попросил вас сесть?(Магистр)" +
                        "Что я здесь делаю?!" +
                        "Ох, вы не знаете?(Маг.)" +
                        "Нет!" +
                        "Ну чтож... Прошу [Указывает на дверь.]";
                scene.action1 = "Зайди..";
                scene.action2 = "Остнься..";


            }if (nevery){
                scene.description = "[Очухатся надо!] Блин! Где я?! ААА! ЧТО ЭТО?! АААаааа..... {Prodoljenie sleduet}";
                scene.action1 = "Давай пили быстрее!";
                scene.action2 = "Что опять?!";
            }if (asv){
                scene.description = "Ладно здесь горит яркая лампа! Кароче я пошёл! И это... Спасибо!";
                scene.action1 = "Удачи!.";
                scene.action2 = "Будь осторожнее.";

            }
        }

        return scene;
    }


    public void doAction(String action) {
        if (location.equals(LOCATION_STREET)) {
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
            }else if (action.equals("Только Вниз!")){
                ТолькоВниз = true;
            }else if (action.equals("Что случилось?")){
                НачалоИстории = true;
            }else if (action.equals("Дай ИМ жару! Но всё таки кто это?")){
                помощ1 = true;
            }else if (action.equals("Ты там это... Держись!")){
                бугаиЧтотоУслышали = true;
            }else if (action.equals("[Выключть звук.]")){
                маленькийСекрет = true;
            }else if (action.equals("-Вот блин!-")){
                очнулся = true;
            }else if (action.equals("Нет не слышу!, но читаю!")){
                kritika = true;
            }else if (action.equals("Да, лучше присядь.")){
                vigovor = true;
            }else if (action.equals("Нет. Это важно!")){
                tijelayaIstoriya = true;
            }else if (action.equals("Вообщем. 1- Ты не сможешь выбраться без часов которые у ОДного из тех бугаев которые тебя вырубили.2-Код на дверях постоянно меняется. Но я так понимаю это можно остановить. 3- Ты один из немногих кто повстречается с 'Магистром' 4- Тебе нужно будет очень скоро валить!")){
               znakomstvoSMagistrom = true;
            }else if (action.equals("Нет дай сначало объясню!")){
                PresidentVladimirPutin = true;
            }else if (action.equals("Лано, потом.")){
                asd = true;
            }else if (action.equals("Там есть кто то кроме тебя?")){
                PUTIN = true;
            }else if (action.equals("Сядь на столик на котором чай.")){
                razgovorSPutinim = true;
            }else if (action.equals("Скажи настоящее имя.")){
                nastoizie = true;
            }else if (action.equals("Я не знаю ни о каком задании!")){
                asr = true;
            }else if (action.equals("Скажи, что получил, но просто забыл.")){
                booblik = true;
            }else if (action.equals("Бублик!")){
                pravelniiParol =true;
            }else if (action.equals("Остаться")){
                snovaPravilno = true;
            }else if (action.equals("Мне кажаться здесь подвох!")){
                sokrovisha = true;
            }else if (action.equals("Войди где два")){
                youLive = true;
            }else if (action.equals("Войди где один.")){
                iystal = true;
            }else if (action.equals("Урааа!")){
                sokrovisha = true;
            }else if (action.equals("Уйти")){
                yshol = true;
            }else if (action.equals("Чашка!")){
                parolnevernyi = true;
            }else if (action.equals("Я не знаю ни о каком задании!")){
                eshoOdno =true;
            }else if (action.equals("Работай!")){
                ustalI = true;
            }else if (action.equals("Ну выбора у тебя нет :-(")){
                ustalI =true;
            }else  if (action.equals("Скажи похожее имя!.")){
                falsename = true;
            }else if (action.equals("Подойди к нему и спроси, 'Что я здесь делаю' ")){
                naxal = true;
            }else if (action.equals("Зайди..")){
                yshol = true;
            }else if (action.equals("Остнься..")){
                snovaPravilno = true;
            }else if (action.equals("Что то не вериться!1")){
                nevery = true;
            }else if (action.equals("Что то не вериться!")){
                asd = true;
            }else if (action.equals("Ладно пошли, потом объясню")){
                asd = true;
            }else if (action.equals("Вставай Немедленно! Простудишься!")){
                asv = true;
            }else if (action.equals("Удачи!.")){
                asd = true;
            }else if (action.equals("Будь осторожнее.")){
                asd = true;
            }else if (action.equals("Да, я тебя слышу!")){
                kritika = true;
            }else if (action.equals("Ну ладно, давай, опиши обстановку.")){
                asd = true;
            }else if (action.equals("Да ладно! Пустяки!")){
                asd = true;
            }else if (action.equals("...")){
                очнулся = true;
            }else if (action.equals("[Выключть усторйство.]")){
                очнулся = true;
            }else if (action.equals("....")){
                маленькийСекрет = true;
            }else if (action.equals("Ты в порядке?")){
                НачалоИстории = true;
            }


        }


        Scene новаяСцена = createScene();
        перейтиКСцене(новаяСцена);
    }
}
