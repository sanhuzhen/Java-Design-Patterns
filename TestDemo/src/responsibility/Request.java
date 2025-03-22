package responsibility;

/**
 * author: sanhuzhen
 * date: 2025/3/22 18:53
 * description: 抽象一个请求对象，负责在责任链上传递
 */
public record Request(String name, double amount) {
}
