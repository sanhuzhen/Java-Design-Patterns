package staticProxy;

/**
 * author: sanhuzhen
 * date: 2025/3/28 12:57
 * description:
 */
public class TestProxy {
    public static void main(String[] args) {
        IUserDao target = new UserDao();

        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }

}
