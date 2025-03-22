package responsibility;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:57
 * description:
 */
public class ManagerHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        if (request.amount() >= 1000){
            // 这里超过了1000，无权处理，然后就返回null，交给下一个Handler
            return null;
        }
        // 如果Bob与它有愁，则直接拒了
        return !request.name().equals("Bob");
    }
}
