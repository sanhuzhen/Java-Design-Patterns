package staticProxy;

/**
 * author: sanhuzhen
 * date: 2025/3/28 12:54
 * description: 目标对象
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
