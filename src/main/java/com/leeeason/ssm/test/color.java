package com.leeeason.ssm.test;

public enum color {
    red(1561564),blue(115448),black(1);
    private int i;
    color(int i) {
        this.i= i;
    }

    public int getValue() {
        return i;
    }
}
