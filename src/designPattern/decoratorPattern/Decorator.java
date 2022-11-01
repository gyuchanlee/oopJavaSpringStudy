package designPattern.decoratorPattern;

public class Decorator implements IService {
    IService service;

    @Override
    public String runSomething () {
        System.out.println("호출에 대한 장식이 주목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");
        service = new Service();
        return "정말루 " + service.runSomething();
    }
}
