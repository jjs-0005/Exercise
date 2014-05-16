package jp.co.jjs.java_seminar.exercise_20140515_05;

import java.util.ArrayList;


public class TodoList {

    private ArrayList<Task> todolist = new ArrayList<>();

    public void add(Task task) {
        todolist.add(task);
    }

    public void list() {
        for (Task task: todolist) {
            System.out.printf("%s%s\n",
                    task.getTask(),
                    task.isIsdone() ? "(DONE)": "");
        }
    }


}