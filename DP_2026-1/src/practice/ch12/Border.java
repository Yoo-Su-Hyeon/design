package practice.ch12;

// 장식자를 대표하는 클래스(Border를 상속받으면 다 장식자가 됨)
public abstract class Border extends Display {
    protected Display display;             // 이 장식틀이 감싸는 '내용물', 장식 대상을 가리킴 => Display : 부모 타입 => 중심, 장식자 모두 가리킬 수 있음

    protected Border(Display display) { // 인스턴스 생성 시 '장식대상, 내용물'을 인수로 지정
        this.display = display;
    }
}
