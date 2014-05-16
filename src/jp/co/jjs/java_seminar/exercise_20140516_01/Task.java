package jp.co.jjs.java_seminar.exercise_20140516_01;

public class Task {

    private String task;
    private boolean isdone;



    public Task(String task) {

        this.setTask(task);


    }

    public void isdone(){

        setIsdone(true);
    }

    @Override
    public String toString() {
        return  getTask();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isIsdone() {
        return isdone;
    }

    public void setIsdone(boolean isdone) {
        this.isdone = isdone;
    }



}
