package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:41
 * description:
 */
public class WechatObservable implements Observable {
    // 一个观察者列表
    private final List<Observer> list = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    @Override
    public void pushMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
