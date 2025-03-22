package observer;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:45
 * description:
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observable wechat = new WechatObservable();
        UserObserver you = new UserObserver("you");
        UserObserver sanhuzhen = new UserObserver("sanhuzhen");

        wechat.addObserver(you);
        wechat.addObserver(sanhuzhen);

        wechat.pushMessage("鬼子来啦！！！");
    }
}
