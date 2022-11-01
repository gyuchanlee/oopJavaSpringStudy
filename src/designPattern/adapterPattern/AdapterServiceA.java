package designPattern.adapterPattern;

public class AdapterServiceA { // serviceA의 변환기
    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }
}
