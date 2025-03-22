package singleton;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:27
 * description:
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("通过枚举单利打印日志...");
    }
}
