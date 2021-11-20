/*
***The strategy pattern defines a family of algorithms and encapsulates each one and make them interchangable.
it lets you encapsulate groups of behaviors into a class and make that class interchangable with other classes.

***the strategy lets the algorithm vary independently from clients that use it.

Example: dhora jak, amra duck niye kaj korbo. duck er onek behavior ase, jemon swim(), or display() {dekhte kmn} etc. 
dhora jak, ami fly() fucntion add korte chaitesi. but shob duck to fly korte parena. amra jeta korte pari, duck ee fly()
thakbe, tarpor jara urte parena tara oivabe override korbe. but this is not a good solution,as amke prottekta duck er jnno
barbar kore fly() talikha lagbe.

dhora jak, 2 type er duck ase, mallerduck ar redDuck. Mallerd urte pare,red duck urte parena.
ekhn eta kivabe implement korbo?
ekta upay hote pare, akta interface use korbo, Flyable.ei interface e fly() fucntion thakbe.
jara jara urbe tara ei Flyable take implement korbe.

eta ekta valo solution. but problem holo, dhora jak arro 4-5 ta type duck ase,jara hubohu mallerd duck er motoi 
urbe. tarmane taderkeo Flyable implement korte hobe, ekdm same upayee.but ideally amra to eta chai na. amra chai
same fly() take amra ekbar ee likhbo, then oi behaviour ta shobar majhe share hobe.so this is not a very
reusable approach.ekhanei strategy pattern er beauty.

Strategy te jeta kori, amra behavior takee ekta class er moddhe encapsulate kore feli. then oi class er
object baniye sheta host class gulor moddhe share kori.

Ekta interface thakbe,Flybehaviour,jekhane fly() function thakbe. ei interface er concrete implementation thakbe proyojon onujai. 
dhorlam, jara wing diye fly korbe tader jnno FlyWithWings class, jara urbena tader jonno NoFly.
era nijeder moto kore ei FLyBehaviour takee implement korbe. tarpor amra jeta korbo, FlyWithWings er ekta matro
object banayee jotogula duck fly korbe shobar moddhe share korbo. tar mane amke shudhu ektai FlyWithWings er object
banaite hoitese behaviour takee define korar jnno.

similarly jara urte parena, tara NoFly er object share korbe

eita stratgy implement korar jnno jeta korte hobe, Duck er moddhe ekta instance level variable thakbe, FlyBehaviour type er.
Say FlyBehavior fb. then ei variable er fly() takee invoke korar jnno ekta fucntion thakbe, performFly(), jeta fb.fly() ke
call korbe. Construct korar smy ee amra ei fb object takee pass kore dibo.

 */
package strategypattern;

public class StrategyPattern {

    
    public static void main(String[] args) {
        FlyBehaviour flyBehaviour = new FlyWithWings();
        Duck mallerdDuck = new MallerdDuck(flyBehaviour);
        
        mallerdDuck.performFly();
        
        FlyBehaviour flyBehaviour2 = new NoFly();
        Duck redDuck = new RedDuck(flyBehaviour2);
        
        redDuck.performFly();
        
    }
    
}
