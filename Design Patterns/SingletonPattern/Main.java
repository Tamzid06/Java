// Author: Tamzid Hossain
// CSE,SUST
// Bangladesh

public class Main {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
       
        boiler.fill();
        boiler.fill();     // can't fill, as already filled


        // ekhane dekha jachhe, amra je error chacchi thikthak temon ee dichhhe. but ekhn amra jodi arekta instance create kore fill korar try kori, she kintu thik ee
        // fill kore dibe. but boiler to ekta,emn to howa uchit na.

        ChocolateBoiler boiler2 = ChocolateBoiler.getUniqueInstance();
        boiler2.fill();
        boiler2.boil();

        boiler.boil();


    }
}
