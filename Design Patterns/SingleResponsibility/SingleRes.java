///Author: Tamzid Hossain
///Reg: 2017331006
///CSE,SUST
import java.util.ArrayList;

/*
Single Responsibility Principle:
    Every object in the system should have one and only one responsibility, and all the object’s services should be focused on
carrying out that single responsibility.
so,the Single Responsibility principle is implemented  correctly when each of the objects has only one reason to change.

"DO JUST ONE THING BUT DO IT CORRECTLY"

If single responcibility is implemented,then the code will be:
->> Low coupled
->>Lesser Dependebility

Say, we want to print the attributes and values of movie & book in jason or any other format. if this
responsibility is within the classes, then for each type/format(jason,xml etc) we have to edit the classes. we dont want that.
also, say we want to add another attribute imdb_rating to the movie class. for that, we have to edit the class,constractor and so on.
for changing the information we also have to edit the class.

*/

//we write this class which can take any type of data.as ultimately we have to print,we'll take everything as string
class Data{
    String var_name,var_type,value;
    Data(String var_name , String var_type, String value)
    {
        this.var_name = var_name;
        this.var_type = var_type;
        this.value = value;
    }
}


//we maintain an interface outputtable.movie,book both class will implement it.here, an arrylist will hold all the
//information. A class implementing this interface must implement the method,thus give all the info to the arraylist.
interface Outputtable{
    ArrayList<Data> fetchInformation();

}

//we write this outputter class, which will take both type of class(movie,book) and print them.
//it can be done with the help of Outputtable interface. when both class implements Outputtable,
//An object(instance) of a class that implements Outputtable can be reffered with the type "Outputtable"

//Now, if client want the values in xml, we just edit this Outputter class.
class Outputter{
    Outputtable obj;

    Outputter(Outputtable obj)
    {
        this.obj = obj;
    }

    public void printClass(){
        ArrayList<Data> info = obj.fetchInformation();
        System.out.println("{");
        for(int i = 0; i < info.size(); i++) {
            String str = "";
            str += "    "+ info.get(i).var_name +": "+ info.get(i).value + ",";
            System.out.println(str);
        }
        System.out.println("}\n");
    }
}

class Movie implements Outputtable{
    private String name,director;
    private Integer runtime;
    private Double imdb;

    Movie(String name,String director,Integer runtime,Double imdb)
    {
        this.name = name;
        this.director = director;
        this.runtime = runtime;
        this.imdb = imdb;
    }

    public String toString(){
        String str = "{\n";

        str += "    name: " + this.name + ",\n";
        str += "    director: " + this.director + ",\n";
        str += "    runtime: " + this.runtime + ",\n";
        str += "}\n";
        //str = "This is an amazing book";

        return str;
    }


    void setName(String name) { this.name = name; }
    void setDirector(String director) { this.director = director; }
    void setRuntime(int runtime) { this.runtime = runtime; }

    @Override
    public ArrayList<Data> fetchInformation() {
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data("name", this.name.getClass().getSimpleName(), this.name));
        info.add(new Data("Director", this.director.getClass().getSimpleName(), this.director));
        info.add(new Data("runtime", this.runtime.getClass().getSimpleName(), this.runtime.toString()));
        info.add(new Data("Imdb", this.imdb.getClass().getSimpleName(), this.imdb.toString()));

        return info;
    }
}

class Book implements Outputtable{
    private String name,author;
    private Integer numpage;

    Book(String name,String author,int numpage)
    {
        this.name = name;
        this.author = author;
        this.numpage = numpage;
    }

    public String toString(){
      String str = "{\n";

        str += "    name: " + this.name + ",\n";
        str += "    author: " + this.author + ",\n";
        str += "    num page: " + this.numpage + ",\n";
        str += "}\n";
        //str = "This is an amazing book";

        return str;
    }

    /*
    this is a bad example
    void setInfo(String name , String author , int numpage)
    {
        if(name != null) this.name = name;
        if(author != null) this.author = author;
        if(numpage != -1) this.numpage = numpage;
    }
    */
    void setName(String name) { this.name = name; }
    void setAuthor(String author) { this.author = author; }
    void setNumpage(int numpage) { this.numpage = numpage; }

    @Override
    public ArrayList<Data> fetchInformation() {
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data("name", this.name.getClass().getSimpleName(), this.name));
        info.add(new Data("author", this.author.getClass().getSimpleName(), this.author));
        info.add(new Data("numpage", this.numpage.getClass().getSimpleName(), this.numpage.toString()));

        return info;
    }
}

public class SingleRes {
    public static void main(String[] args) {
        System.out.println("CheckCode");

        Book book = new Book("The Kite runner" , "Khaled Hussaini" , 240);

        //System.out.println(book);

        Movie movie = new Movie("Intersteller", "Christopher Nola", 180, 8.9);

        //System.out.println(movie);

        Outputter ot = new Outputter(movie);
        ot.printClass();
        ot.obj = book;
        ot.printClass();

    }
   
}
