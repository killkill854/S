package ru.banana.textquest;


import java.io.Serializable;

public class Action implements Serializable{
    String описание;

    public Action(String описание) {
        this.описание = описание;
    }

    public String toString() {
        return описание;
    }

}

