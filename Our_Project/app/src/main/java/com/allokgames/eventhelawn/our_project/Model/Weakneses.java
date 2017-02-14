package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by User on 14.02.2017.
 */
public class Weakneses {
    private String type;
    private int value;

    public Weakneses(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {

        return type;
    }

    public int getValue() {
        return value;
    }
}
