package main.entities;

import static java.lang.String.valueOf;

public class Node {

    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return valueOf(value);
    }
}
