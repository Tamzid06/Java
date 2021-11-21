// Author: Tamzid Hossain
// CSE,SUST
// Bangladesh

//Dhora jak, 2ta racing game company ase. ekta car er arekta bike er. tara tader object nijeder moto implement kore. dhora jak,car company bike company
//ke kine nilo. then bike er code base tara nijeder moto implement korbe,jate car player ra parthokko dhorte na pare

// ei kaj ta amra adapter er moddhome korbo. bike er code e hat na diye, ekta adapter class banabo jeta bike object nibe ebong take car er function er rup 
//dibe. player ra car vebei car er fucntion call korbe, but under the hood ashole bike er fucntion gulai execute hobe

abstract class Car{
    int weight_kg;
    double milage;

    Car(int weight_kg,double milage){
        this.weight_kg = weight_kg;
        this.milage = milage;
    }
    abstract void start();
    abstract void steer(int left_right);
}

abstract class Bike{
    int weight_pound;
    double kiloPerLittre;

    Bike(int weight_pound,double kiloPerLittre){
        this.weight_pound = weight_pound;
        this.kiloPerLittre = kiloPerLittre;
    }
    abstract void begin();
    abstract void control(int left_right);
}

class Mcloren extends Car{

    Mcloren(int weight_kg, double milage) {
        super(weight_kg, milage);
    }

    @Override
    void start() {
        System.out.println("Gari choltase babay amay daktase");
        
    }

    @Override
    void steer(int left_right) {
        System.out.println("Gari ghurtase babay amay daktase");
        
    }

}

class Suzuki extends Bike{

    Suzuki(int weight_pound, double kiloPerLittre) {
        super(weight_pound, kiloPerLittre);
    }

    @Override
    void begin() {
        System.out.println("Hunda choltase babay amay daktase");
        
    }

    @Override
    void control(int left_right) {
        System.out.println("Gari ghurtase babay amay daktase");
        
    }

}

class BikeToCarAdapter extends Car{
    Bike bike;

    BikeToCarAdapter(Bike bike){
        super( bike.weight_pound/2, bike.kiloPerLittre*0.61);
        this.bike = bike;
    }

    @Override
    void start() {
        bike.begin();
        
    }

    @Override
    void steer(int left_right) {
        bike.control(left_right);
        
    }
}

class Adapter{
    public static void main(String[] args) {
        Mcloren m1 = new Mcloren(500,80);
        Suzuki b1 = new Suzuki(300,60);

        m1.start();
        b1.begin();

        BikeToCarAdapter bc = new BikeToCarAdapter(b1);
        bc.start();      /// ekhane jodio amra car er start call korsi, but output e dekhte pachhi ashole bike er begin() fucntion run kortese

        Car mcloren = new Mcloren(1500,30);
        Car suzuki = new BikeToCarAdapter(new Suzuki(1800,40));

        mcloren.start();
        suzuki.start();

    }
}