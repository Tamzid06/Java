/*
In object oriented programming, the command pattern is a behavourial design pattern in which an object is used to 
encapsulate all information needed to perform an action or trigger an event at a later time.
this information includes the method name,the object that owns the method,and values for the method parameters.

Example hishebe amra Alexa er kotha bolte pari. ei Alexa ke amra jekono kichhu korar jonno bolte pari.dhora jak ami bollam,
Alexa, music on koro. ekhn music on kora bolte ki bujhaisi sheta alexa er moddhe agge thekei shob bola thakbe,jmn 
volune koto hobe, kn playlist thakbe, kon channel er kon frequency te jabe etc. 

Amra evabe bolte pari, Alexa te kichhu slote thake each command er jonno.protita command er jonno motamoti 2 ta state thake,
on and off. protita command er jonno on bolle ki ki korte hobe shob ekjaygay encapsulate kora thakbe,abr off er jonno 
ki ki kora lagbe tao encapsulate kora thakbe.

amra ekhane emn ekta slot o add korte pari, shob kisu on hobe ba shob kisu off kore dibe emn.

2 dhoroner Hardware thakbe. Music and Kitchen.
*/

package commandpattern;

public class CommandPattern {


     public static void main(String[] args) {
        //Example 1 - Empty slots
        AlexaDevice alexa = new AlexaDevice();
        System.out.println(alexa);

//      ---------------------------------------------------------------

        //Example 2 - Kitchen Lights on
//        AlexaDevice alexa = new AlexaDevice();
//
//        //Create an instance
//        KitchenLights kitchenLights = new KitchenLights();
//
//        //Set the slots with new commands
//        alexa.setCommand(
//                0,
//                new KitchenLightsOnCommand(kitchenLights),
//                new KitchenLightsOffCommand(kitchenLights)
//        );
//
//        System.out.println(alexa);
//
//        alexa.activateSlot(0);
//        alexa.deactivateSlot(0);

//      ---------------------------------------------------------------

        //Example 3 - Everything on!
//        AlexaDevice alexa = new AlexaDevice();
//
//        //Create an instance
//        KitchenLights kitchenLights = new KitchenLights();
//        Music music = new Music();
//
//        //Set the slots with new commands
//        alexa.setCommand(
//                1,
//                new EverythingOnCommand(music, kitchenLights),
//                new EverythingOffCommand(music, kitchenLights)
//        );
//
//        System.out.println(alexa);
//
//        alexa.activateSlot(1);
//        alexa.deactivateSlot(1);

    }
    
}
