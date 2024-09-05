package chp07;

public class MainDog {
    public static void main(String[] args) {
        // d1, d2 객체 생성
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        // d1의 속성 값
        d1.setName("레옹");
        d1.setBreed("말티즈");
        d1.setAge(15);
        // d2의 속성 값
        d2.setName("그레이");
        d2.setBreed("골드리트리버");
        d2.setAge(7);

        System.out.printf("d1 => (name: %s, breed: %s, age: %d)\n", d1.getName(), d1.getBreed(), d1.getAge());
        System.out.printf("d2 => (name: %s, breed: %s, age: %d)\n", d2.getName(), d2.getBreed(), d2.getAge());
        // wag(); 메소드 호출
        d1.wag();
        d2.wag();
        // bark(); 메소드 호출
        d1.bark();
        d1.bark(5,"왈왈!");
        d2.bark();
        d2.bark(3,"컹컹컹");
    }
}