package observer;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:38
 * description: 被观察者
 */
public interface Observable {
    // 添加观察者
    void addObserver(Observer observer);

    // 移除观察者
    void removeObserver(Observer observer);

    // 通知观察者
    void notifyObservers();

    // 发布消息
    void pushMessage(String message);
}
