package challengefunction;

@FunctionalInterface // 함수형 인터페이스 선언(하나의 추상 메서드)
interface total<T>{ // T는 타입 매개변수 -> 당 인터페이스를 사용시 타입을 지정할 수 있음
    T num(T a); // 두 개의 T 타입의 인자를 받아서 T 타입을 반환
}

public enum Customer {
    VETERAN(1, (a) -> {
        return a - (a * 0.1);
    }),
    SOLDIER(2, (a) -> {
        return a - (a * 0.05);
    }),
    STUDENT(3, (a) -> {
        return a - (a * 0.03);
    }),
    COMMON(4, (a) ->{
        return a ;
    });

    private int input;
    private total<Double> total;

    Customer(int input, total<Double> total) {
        this.input = input;
        this.total = total;
    }

    // 메소드 호출 및 결과 반환
    public Number apply(double a) {
        return total.num(a); // 연산 실행
    }
}