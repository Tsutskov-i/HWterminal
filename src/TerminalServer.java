package ru.sbt.terminal;

import ru.sbt.terminal.exceptions.NotEnoughMoneyException;

public class TerminalServer {
    private Count currentCount;


    public void startSession(Count count) {
        currentCount = count;
    }

    public void setMoney(int money) {
        currentCount.setMoney(money);
    }

    public void getMoney(int money) throws NotEnoughMoneyException {
        currentCount.getMoney(money);
    }
}
