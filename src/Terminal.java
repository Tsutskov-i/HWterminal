package ru.sbt.terminal;

import ru.sbt.terminal.exceptions.AccountIsLockedException;
import ru.sbt.terminal.exceptions.IllegalPinException;
import ru.sbt.terminal.exceptions.InvalidPinException;
import ru.sbt.terminal.exceptions.NotEnoughMoneyException;

public interface Terminal {
    void startSession(Count count);


    public void checkPin(short pin) throws InvalidPinException, AccountIsLockedException, IllegalPinException;

    void checkCount() throws AccountIsLockedException, IllegalPinException;

    void setMoney(int sum) throws AccountIsLockedException, IllegalPinException;

    void getMoney(int sum) throws AccountIsLockedException, IllegalPinException;

    void checkIfUserValid() throws AccountIsLockedException, IllegalPinException;

}
