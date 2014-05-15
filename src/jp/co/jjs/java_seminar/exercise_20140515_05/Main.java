package jp.co.jjs.java_seminar.exercise_20140515_05;



public class Main {


    public static void main(String[] args) {

        TodoList list = new TodoList();

        //taskに追加
        Task task1 = new Task("牛乳を買う");
        Task task2 = new Task("卵を買う");
        Task task3 = new Task("ArrayListを使えるようにする。");
        Task task4 = new Task("家賃を支払う");

      //Task型のlistを生成


        //listに追加
        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);

        task1.isdone();
        task3.isdone();


        list.list();

    }




}
