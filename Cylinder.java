package test;

public class Cylinder {

    public static void main(String[] ar) {
        Circle cp = new Circle(2.8);
        double h = 5.6;
        
        System.out.println("���� : " + (cp.getArea() * h));
    }
}
 
class Circle {
    public double radius;
    public static double PI = 3.141592;
 
    //������ ����
    public Circle(double radius){
        this.radius = radius;
    }
    //���� �������� ����Ͽ� ���� ������ ���ϴ� �޼ҵ�
    public double getArea(){
        return radius * radius * PI;
    }
}