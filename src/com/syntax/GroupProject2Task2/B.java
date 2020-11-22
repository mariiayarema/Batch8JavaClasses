package com.syntax.GroupProject2Task2;

public class B extends Marks {
    private double matchMark;
    private double englishMarks;
    private double chemistryMarks;
    private double pianoMarks;
    double averageStudentB;

    B(double matchMark,double englishClass,double chemistryMarks, double pianoMarks){
        this.matchMark=matchMark;
        this.englishMarks=englishClass;
        this.chemistryMarks=chemistryMarks;
        this.pianoMarks=pianoMarks;
    }

    @Override
    double getPercentage() {
        averageStudentB=(matchMark+englishMarks+chemistryMarks+pianoMarks)/4;
        return averageStudentB;
    }
}
