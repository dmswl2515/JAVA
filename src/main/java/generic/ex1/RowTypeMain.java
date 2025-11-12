package generic.ex1;

// 제네릭이 없던 시절의 과거 코드와의 하위 호환이 필요해서 로 타입을 지원했음(현재 잘 사용 안함, 알아 만두기).
public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장

        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
