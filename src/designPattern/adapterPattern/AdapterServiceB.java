package designPattern.adapterPattern;

public class AdapterServiceB { // ServiceB 변환기
    ServiceB sb1 = new ServiceB();

    void runService() {
        sb1.runServiceB();
    }
}
