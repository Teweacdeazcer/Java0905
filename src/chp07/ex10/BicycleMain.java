package chp07.ex10;

public class BicycleMain {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();

        b1.setName("로드형 자전거");
        b1.setWeight(7.25);
        b1.setPrice(100000);

        System.out.printf("b1 => {%s, %.2f, %d}\n",b1.name ,b1.weight, b1.price);
    }
}
