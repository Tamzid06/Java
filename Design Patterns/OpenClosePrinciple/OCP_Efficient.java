//To solve this problem, we create an interface and implement a code so that whenever we have a new
//type of area, we just implement this method.thus, we extend the classes but don't modify any module.
//

interface CalculateArea{
    double getarea();
}


class Triangle implements CalculateArea {
    double hight;
    double vumi;
    double result = 0.0;

    public Triangle(double hight, double vumi) {
        this.hight = hight;
        this.vumi = vumi;
    }

    @Override
    public double getarea() {
        result = hight*vumi;
        return result;
    }
}

class Rectangle implements CalculateArea {
    double hight;
    double vumi;
    double result = 0.0;

    public Rectangle(double hight, double vumi) {
        this.hight = hight;
        this.vumi = vumi;
    }

    @Override
    public double getarea() {
        result = 0.5*hight*vumi;
        return result;
    }
}

class FindArea {
    double rslt;

    double calcutate(CalculateArea area){
        
        rslt = area.getarea();
        return rslt;
        
    }   
}


public class OCP_Efficient {
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
