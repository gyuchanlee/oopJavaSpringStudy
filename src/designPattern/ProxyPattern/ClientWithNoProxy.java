package designPattern.ProxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        // No Proxy Pattern
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
