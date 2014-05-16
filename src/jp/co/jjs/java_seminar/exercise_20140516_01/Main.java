package jp.co.jjs.java_seminar.exercise_20140516_01;



public class Main {


    public static void main(String[] args) {

        TodoList list = new TodoList();


        //taskに追加
        Task task1 = new Task("牛乳を買う");
        Task task2 = new Task("卵を買う");
        Task task3 = new Task("ArrayListを使えるようにする。");
        Task task4 = new Task("家賃を支払う");

        BuyTask task5 = new BuyTask("牛乳を買う", 190);
        BuyTask task6 = new BuyTask("卵を買う", 140);


        //listに追加
        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);
        list.add(task5);
        list.add(task6);

        task1.isdone();
        task3.isdone();



        list.list();






    }




}
