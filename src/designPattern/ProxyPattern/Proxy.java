package designPattern.ProxyPattern;

public class Proxy implements IService { // Iservice 인터페이스 구현한 Proxy
    IService service1;
    
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달");
        
        service1 = new IServiceImpl(); // 구현체 등록
        return service1.runSomething();
    }
}
