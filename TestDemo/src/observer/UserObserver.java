package observer;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:35
 * description:
 */
public class UserObserver implements Observer {

    private final String name;
    private String message;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String obj) {
        this.message = obj;
        readMessage();
    }
    private void readMessage() {
        System.out.println(name + "收到一条消息：" + message);
    }
}
