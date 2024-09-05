package chp07;

public class MainSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square();

        s1.setLength(15);
        s2.setLength(7);

        int result = s1.area();
        int result2 = s2.area();

        System.out.printf("길이가 %dcm인 정사각형의 면적은 %d㎠ 입니다.\n", s1.getLength(), result);
        System.out.printf("길이가 %dcm인 정사각형의 면적은 %d㎠ 입니다.\n", s2.getLength(), result2);
    }
}
