package com.syntax.Repl;

public class ChaiTea extends Tea {

    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}
