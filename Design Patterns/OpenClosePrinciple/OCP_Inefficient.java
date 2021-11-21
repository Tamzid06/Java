// Author : Tamzid Hossain
// CSE,SUST
// Bangladesh


// Open Close Principle:  "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"


//Say, we have a class that finds area of a rectangle.We write the code for that.Now if we have to
//determine the area of triangle later, we have to modify the FindArea module.


class Triangle {
    double hight;
    double vumi;
    double result = 0.0;

    public Triangle(double hight, double vumi) {
        this.hight = hight;
        this.vumi = vumi;
    }
}

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
    double rslt;

    double calcutate(Object area){
        
        if(area instanceof Rectangle){
            Rectangle rectangle= (Rectangle) area ;
            rslt = rectangle.hight*rectangle.vumi;
        }
        else if(area instanceof Triangle){
            Triangle triangle = (Triangle) area ;
            rslt = 0.5*triangle.hight*triangle.vumi;
        }
        return rslt;
        
    }   
}

public class OCP_Inefficient {
    public static void main(String[] args){
        //System.out.println("test");
        Rectangle rectangle = new Rectangle(5, 10);
        FindArea findArea = new FindArea();
        double area = findArea.calcutate(rectangle);
        System.out.println(area);
        Triangle triangle = new Triangle(5, 10);
        area = findArea.calcutate(triangle);
        System.out.println(area);

    }  
}
