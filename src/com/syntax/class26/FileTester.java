package com.syntax.class26;

public class FileTester {
    public static void main(String[] args) {
        File [] allFile={new JavaFile(),new PgafFile(),new WordFile()};

        for (File f:allFile) {
            f.open();
            f.close();
            f.edit();
        }
    }
}
