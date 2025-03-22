package responsibility;

/**
 * author: sanhuzhen
 * date: 2025/3/22 19:00
 * description:
 */
public class DirectorHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        if (request.amount()>=10000){
            return null;
        }
        // 与人没有仇恨，只要没超过10000都可以处理
        return true;
    }
}
