package staticProxy;

/**
 * author: sanhuzhen
 * date: 2025/3/28 12:55
 * description: 代理对象
 */
public class UserDaoProxy implements IUserDao {

    private final IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开启事务");//拓展额外功能
        target.save();
        System.out.println("提交事务");
    }
}
