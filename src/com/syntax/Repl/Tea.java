package com.syntax.Repl;

abstract public class Tea {
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
