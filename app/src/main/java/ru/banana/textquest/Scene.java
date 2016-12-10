package ru.banana.textquest;


import java.io.Serializable;

public class Scene implements Serializable {

    String description;
    Action[] actions;

    public Scene(String description, Action[] actions) {
        this.description = description;
        this.actions = actions;
    }

}
