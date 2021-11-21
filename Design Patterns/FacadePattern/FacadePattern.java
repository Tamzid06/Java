import java.util.ArrayList;

class Light{
    String name;

    Light(String name){
        this.name = name;
    }

    void on(){
        System.out.println(name + " is now on");
    }

    void off(){
        System.out.println(name + " is now off");
    }
}

class Fan{
    String name;

    Fan(String name){
        this.name = name;
    }

    void start(){
        System.out.println(name + " has started");
    }

    void stop(){
        System.out.println(name + " has stopped");
    }
}

class Projector{
    String name;

    Projector(String name){
        this.name = name;
    }

    void up(){
        System.out.println(name + "  screen is up");
    }

    void down(){
        System.out.println(name + " screen is down");
    }
}

class PC{
    String name;

    PC(String name){
        this.name = name;
    }

    void turn_on(){
        System.out.println(name + " is turned on");
    }

    void turn_off(){
        System.out.println(name + " is switched off");
    }
}

class Facade{
    ArrayList<Light> light_arr = new ArrayList<>();
    ArrayList<Fan> fan_arr = new ArrayList<>();
    Projector projector;
    ArrayList<PC> pc_arr = new ArrayList<>();

    void addLight(Light light){
        light_arr.add(light);
    }

    void addFan(Fan fan){
        fan_arr.add(fan);
    }

    void setProjector(Projector projector){
        this.projector = projector;
    }

    void addPC(PC pc){
        pc_arr.add(pc);
    }

    void start_class(){
        for(Light light : light_arr) light.on();
        for(Fan fan : fan_arr) fan.start();
        projector.down();
        for(PC pc : pc_arr) pc.turn_on();

    }

    void stop_class(){
        for(Light light : light_arr) light.off();
        for(Fan fan : fan_arr) fan.stop();
        projector.up();
        for(PC pc : pc_arr) pc.turn_off();
    }

}

class FacadePattern{
    public static void main(String[] args) {
        System.out.println("facade");

        Facade facade = new Facade();
        
        facade.addLight(new Light("Light 1"));
        facade.addLight(new Light("Light 2"));

        facade.addFan(new Fan("Fan 1"));
        facade.addFan(new Fan("Fan 2"));

        facade.setProjector(new Projector("Main projector"));

        facade.addPC(new PC("PC 1"));
        facade.addPC(new PC("PC 2"));

        facade.start_class();
        System.out.println("\n \n \n");
        facade.stop_class();
    }
}

/* ********************Arraylist iterating method******************************

 * How to iterate through Java List? Seven (7) ways to Iterate Through Loop in Java.
 * 1. Simple For loop
 * 2. Enhanced For loop
 * 3. Iterator
 * 4. ListIterator
 * 5. While loop
 * 6. Iterable.forEach() util
 * 7. Stream.forEach() util
 
 
public class CrunchifyIterateThroughList {
 
    public static void main(String[] argv) {
 
        // create list
        List<String> crunchifyList = new ArrayList<String>();
 
        // add 4 different values to list
        crunchifyList.add("Facebook");
        crunchifyList.add("Paypal");
        crunchifyList.add("Google");
        crunchifyList.add("Yahoo");
 
        // Other way to define list is - we will not use this list :)
        List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");
 
        // Simple For loop
        System.out.println("==============> 1. Simple For loop Example.");
        for (int i = 0; i < crunchifyList.size(); i++) {
            System.out.println(crunchifyList.get(i));
        }
 
        // New Enhanced For loop
        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for (String temp : crunchifyList) {
            System.out.println(temp);
        }
 
        // Iterator - Returns an iterator over the elements in this list in proper sequence.
        System.out.println("\n==============> 3. Iterator Example...");
        Iterator<String> crunchifyIterator = crunchifyList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }
 
        // ListIterator - traverse a list of elements in either forward or backward order
        // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
        // and obtain the iterator's current position in the list.
        System.out.println("\n==============> 4. ListIterator Example...");
        ListIterator<String> crunchifyListIterator = crunchifyList.listIterator();
        while (crunchifyListIterator.hasNext()) {
            System.out.println(crunchifyListIterator.next());
        }
 
        // while loop
        System.out.println("\n==============> 5. While Loop Example....");
        int i = 0;
        while (i < crunchifyList.size()) {
            System.out.println(crunchifyList.get(i));
            i++;
        }
 
        // Iterable.forEach() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==============> 6. Iterable.forEach() Example....");
        crunchifyList.forEach((temp) -> {
            System.out.println(temp);
        });
 
        // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==============> 7. Stream.forEach() Example....");
        crunchifyList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));
    }
}

*/

