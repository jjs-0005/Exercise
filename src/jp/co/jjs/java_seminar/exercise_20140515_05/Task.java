package jp.co.jjs.java_seminar.exercise_20140515_05;

public class Task {

    String task;
    boolean isdone;


    public Task(String task) {

        this.task = task;


    }

    public void isdone(){

        isdone = true;
    }

    @Override
    public String toString() {
        return  task;
    }



}
