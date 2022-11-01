package designPattern.decoratorPattern;

public class Service implements IService { // 실제 서비스

    @Override
    public String runSomething() {
        return "서비스 짱!";
    }
}
