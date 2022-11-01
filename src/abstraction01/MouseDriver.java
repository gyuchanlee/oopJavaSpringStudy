package abstraction01;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null; // 참조 변수에서 참조하던 인스턴스를 끊음 > 인스턴스는 힙에서 더 이상 쓰이지 않으므로 GC(가비지 컬렉션)이 어느 순간 와서 정리.

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();
    }
}
