//Say, we have a class that finds area of a rectangle.We write the code for that.Now if we have to
//determine the area of triangle later, we have to modify the FindArea module.

// interface CalculateArea{}


// class Triangle implements CalculateArea {
//     double hight;
//     double vumi;
//     double result = 0.0;

//     public Triangle(double hight, double vumi) {
//         this.hight = hight;
//         this.vumi = vumi;
//     }
// }

class Rectangle{
    double hight;
    double vumi;
    double result = 0.0;

    public Rectangle(double hight, double vumi) {
        this.hight = hight;
        this.vumi = vumi;
    }
}

class FindArea {
    double calcutate(Rectangle area){
        area.result = area.hight*area.vumi;
        return area.result;
    }   
}

public class OpenClose {
    public static void main(String[] args){
        //System.out.println("test");
        Rectangle rectangle = new Rectangle(5, 10);
        FindArea findArea = new FindArea();
        double area = findArea.calcutate(rectangle);
        System.out.println(area);

    }  
}
