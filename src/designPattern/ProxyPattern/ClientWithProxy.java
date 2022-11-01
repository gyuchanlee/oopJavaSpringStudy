package designPattern.ProxyPattern;

public class ClientWithProxy {
    public static void main(String[] args) {
        // Proxy Pattern
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
