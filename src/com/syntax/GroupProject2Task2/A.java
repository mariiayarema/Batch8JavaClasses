package com.syntax.GroupProject2Task2;

public class A extends Marks{
    private double matchMark;
    private double englishMarks;
    private double chemistryMarks;
    private double averageStudentA;

    A(double matchMark,double englishClass,double chemistryMarks){
    this.matchMark=matchMark;
    this.englishMarks=englishClass;
    this.chemistryMarks=chemistryMarks;
    }

    @Override
    double getPercentage() {
        averageStudentA=(matchMark+englishMarks+chemistryMarks)/3;
        return averageStudentA;
    }
}
