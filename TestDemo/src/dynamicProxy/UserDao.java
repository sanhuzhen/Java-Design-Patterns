package dynamicProxy;

/**
 * author: sanhuzhen
 * date: 2025/3/28 13:08
 * description:
 */
public class UserDao implements IUserDao{
    @Override
    public void save(){
        System.out.println("保存数据");
    }
}
