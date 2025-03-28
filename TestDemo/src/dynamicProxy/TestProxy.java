package dynamicProxy;

/**
 * author: sanhuzhen
 * date: 2025/3/28 13:12
 * description:
 */
public class TestProxy {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
