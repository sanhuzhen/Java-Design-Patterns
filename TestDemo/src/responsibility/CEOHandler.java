package responsibility;

/**
 * author: sanhuzhen
 * date: 2025/3/22 19:00
 * description:
 */
public class CEOHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        return true;
    }
}
