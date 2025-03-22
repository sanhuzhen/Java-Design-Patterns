package singleton;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:24
 * description: 静态内部类实现单例
 */
public class StaticSingleton {
    private StaticSingleton singleton;

    private static class SingletonHolder {
        public static StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
