package responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * author: sanhuzhen
 * date: 2025/3/22 19:01
 * description: 将这些Handler串联起来
 */
public class HandlerChain {
    private final List<Handler> chain = new ArrayList<>();

    public void addHandler(Handler handler) {
        chain.add(handler);
    }

    // 模拟过程
    public boolean process(Request request) {
        for (Handler handler : chain) {
            Boolean process = handler.process(request);
            if (process != null) {
                System.out.println(request.name() + "'s request " + (process ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return process;
            }
        }
        throw new RuntimeException("Count not handle request: " + request);
    }
}
