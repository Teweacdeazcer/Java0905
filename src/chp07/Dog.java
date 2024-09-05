package chp07;

 // Dog 클래스 생성
public class Dog {
 // Dog의 속성
    private String name;
    private String breeds;
    private int age;

 // getter and setter(Alt + Insert)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breeds;
    }

    public void setBreed(String breed) {
        this.breeds = breeds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 // wag();, bark(); 메소드 생성
    public void wag(){
        System.out.println(name + "가(이) 살랑살랑 꼬리를 친다.");
    }

    public void bark(){
        System.out.println("멍멍!");
    }
    // 메소드 오버로딩: 이름이 같은 메소드지만 입력변수의 개수 또는 타입으로 구분(Java의 다형성)
    public void bark(int times, String sound){
        System.out.printf("%s가(이) %d번 %s 짖는다.\n", name, times, sound);
    }
}
