package jp.co.jjs.java_seminar.exercise_20140516_01;

public class BuyTask extends Task
{

    private int price;

    public BuyTask(String task, int price) {
        super(task);
        this.price = price;
    }

    @Override
    public String getTask() {
        // TODO 自動生成されたメソッド・スタブ
        return super.getTask() + price;
    }

}
