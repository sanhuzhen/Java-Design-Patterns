package ProducerConsumerModel;

import java.util.Objects;

/**
 * author: sanhuzhen
 * date: 2025/6/9 14:50
 * description: wait()和notify()方法的实现
 */
public class Test1 {

    // 总的生产数量
    private static Integer count = 0;
    // 仓库存储量
    private static final Integer FULL = 10;
    private static final String LOCK = "lock";

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    // 构建生产者
    private static class Producer implements Runnable {
        @Override
        public void run() {
            // 生产
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 上锁
                synchronized (LOCK) {
                    // 当生产的数量达到长裤的存储量时，停下
                    while (Objects.equals(count, FULL)) {
                        try {
                            LOCK.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(STR."\{Thread.currentThread().getName()}生产者生产，目前总共有\{count}");
                    LOCK.notifyAll();
                }
            }
        }
    }

    // 消费者
    private static class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    // 当不足时，要通知生产者开始生产
                    while (count == 0) {
                        try {
                            LOCK.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(STR."\{Thread.currentThread().getName()}消费者消费，目前总共有\{count}");
                    LOCK.notifyAll();
                }
            }
        }
    }
}
