//--------------------Tamzid Hossain-----------------
//----------------------2017331006-------------------
import java.util.Random;

class OnlineExm {
    Integer duration,totalMark;
    private Integer result;
    String subject;

    OnlineExm(String subject,Integer duration,Integer totalMark){
        this.subject = subject;
        this.duration = duration;
        this.totalMark = totalMark;
    }
    //here, this method has too many responsibility.it takes exam,generates result and submit that to the server
    public Integer takeExm(){
        //taking exam
        System.out.println(this.subject+" Exam Completed");

        //generating result
        Random rand = new Random();
        this.result = rand.nextInt(100);

        //Submitting result
        System.out.println("Result has been submitted to the server");

        return result;
    }

}

//this class has too many responsibility.it holds the student's information, also check the Authentication
//But according to the SRP, it should have one and only one responsibility, thus have only one reason to change.

class Student{
    Integer std_id;
    String name;
    OnlineExm ol;

    Student(Integer std_id,String name){
        this.std_id = std_id;
        this.name = name;
    }

    public void participateExam(String subject,Integer duration,Integer totalMark)
    {
        studentAuthentication();
        OnlineExm onlineexm = new OnlineExm(subject, duration, totalMark);
        Integer mark = onlineexm.takeExm();
        System.out.println("The mark for the "+subject+" exam is "+mark);
    }

    private void studentAuthentication(){
        System.out.println("Authenticating student...\n"+name+" "+std_id+"\nAuthentication Complete");
    }

}

public class SRP_Inefficient {
    public static void main(String[] args){
        //System.out.println("hey");
        //OnlineExm ol = new OnlineExm("SWE",180,100);

        Student student = new Student(331006,"Tamzid");
        student.participateExam("SWE",180,100);
        //System.out.println(ol.takeExm());
    }
    
}
