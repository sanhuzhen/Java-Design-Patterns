package responsibility;

/**
 * author: sanhuzhen
 * date: 2025/3/22 19:07
 * description:
 */
public class HandlerTest {
    public static void main(String[] args) {
        Request request = new Request("Bob", 5000);
        HandlerChain chain = new HandlerChain();
        Handler managerHandler = new ManagerHandler();
        Handler directorHandler = new DirectorHandler();
        Handler ceoHandler = new CEOHandler();
        chain.addHandler(managerHandler);
        chain.addHandler(directorHandler);
        chain.addHandler(directorHandler);

        System.out.println(chain.process(request));
    }
}
