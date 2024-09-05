package chp07.ex11;

public class CylinderMain {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setHeight(5);
        c.setRadius(4);

        System.out.printf("원기둥의 부피: %.2f\n",c.getvolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n",c.getsurfaceArea());
    }
}
