import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private int loadCapacity;
    private int startMoney = 6000;
    private int money = startMoney;

    public User(int startMoney, int money) {
        this.startMoney = startMoney;
        this.money = money;
    }

    public int getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(int startMoney) {
        this.startMoney = startMoney;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void buy() {
    }
}
