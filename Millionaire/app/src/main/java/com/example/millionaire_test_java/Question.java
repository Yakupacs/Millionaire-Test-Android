package com.example.millionaire_test_java;

public class Question {
    public String question;
    public String trueAnswer;
    public String failAnswer1;
    public String failAnswer2;
    public String failAnswer3;

    Question(String question, String trueAnswer, String failAnswer1, String failAnswer2, String failAnswer3)
    {
        this.question = question;
        this.trueAnswer = trueAnswer;
        this.failAnswer1 = failAnswer1;
        this.failAnswer2 = failAnswer2;
        this.failAnswer3 = failAnswer3;
    }
}
