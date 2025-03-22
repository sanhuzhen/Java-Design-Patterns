package singleton;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:10
 * description: 双重校验锁实现单例
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        // 这里是为了检验是否已经创建了单例
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                /*
                 * 即两个线程，线程1用完了时间片但已经判空过一次了，然后线程2获得了CPU时间片，此时还没有singleton实例，
                 * 但当线程2创建完成后，那么线程1还会继续，但此时已经执行过第一次判空了，所以这里还要一次判空
                 */
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
