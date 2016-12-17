package ru.banana.textquest;


import java.io.Serializable;

public class Scene implements Serializable {

    String description;
    String action1;
    String action2;

    public Scene(String description, String action1, String action2) {
        this.description = description;
        this.action1 = action1;
        this.action2 = action2;
    }


}
