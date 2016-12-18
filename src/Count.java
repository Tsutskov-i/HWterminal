package ru.sbt.terminal;

import ru.sbt.terminal.exceptions.NotEnoughMoneyException;

public class Count {
    private String count;
    private int Money;

    public Count(String count, int money) {
        Money = money;
        this.count = count;
    }

    public void setMoney(int money) {
        Money =+ money;
    }

    public void getMoney(int money) throws NotEnoughMoneyException {
        if (Money - money < 0) {
            throw new NotEnoughMoneyException("Can't do operation: count doesn't has enough money");
        }
        else {
            Money -= money;
        }
    }

    public int showMoney() {
        return Money;
    }
}
