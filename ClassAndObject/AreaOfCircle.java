import java.util.*;

class AreaOfCircleDetails {
    int radius;

    public AreaOfCircleDetails(int radius) {
        this.radius = radius;
    }
    public void display(){
        double circum=  (Math.PI*2*radius);
        System.out.println("circumference: "+circum);
    }
}
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        AreaOfCircleDetails area=new AreaOfCircleDetails(radius);
        area.display();

    }
}
