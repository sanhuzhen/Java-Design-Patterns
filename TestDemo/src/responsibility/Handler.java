package responsibility;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:55
 * description: 抽象一个处理器
 */
public interface Handler {
    // 处理是否成功，如果返回null，则交给下一个Handler处理
    Boolean process(Request request);
}
