package abstraction01;

public class Mouse { // Mouse Class
    public String name;
    public int age;
    public static int countOfTail; // 클래스 멤버 필드 : T메모리 중 스태틱영역에 단 하나의 저장 공간만 가짐. 클래스단위로 참조 가능.
    
    public void sing() {
        System.out.println(name+" 찎찎!!!");
    }
}
