package ru.banana.textquest;

/**
 * Created by User on 12/3/2016.
 */

public class Scene {

    String description;
    Action[] actions;

    public Scene(String description, Action[] actions) {
        this.description = description;
        this.actions = actions;
    }

}
