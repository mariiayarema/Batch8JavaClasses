package com.syntax.Repl;
 class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
