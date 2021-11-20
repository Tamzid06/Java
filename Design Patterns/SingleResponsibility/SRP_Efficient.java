//--------------------Tamzid Hossain-----------------
//----------------------2017331006-------------------

import java.util.Random;

class OnlineExmEf {
    Integer duration,totalMark;
    private Integer result;
    String subject;

    OnlineExmEf(String subject,Integer duration,Integer totalMark){
        this.subject = subject;
        this.duration = duration;
        this.totalMark = totalMark;
    }

    //Now, this method only takes exam.generating result, submitting to server is done by different method
    public Integer takeExm(){
        System.out.println(this.subject+" Exam Completed");
        generateResult();
        return result;
    }

    private void generateResult(){
        Random rand = new Random();
        this.result = rand.nextInt(100);
        this.submitResult(result);

    }
    private void submitResult(Integer result){
        System.out.println("Result has been submitted to the server");

    }
}

//Now,this class does not authenticate students anymore,it is done by different class
class StudentEf{
    Integer std_id;
    String name;
    OnlineExmEf onlineexmEf;

    StudentEf(Integer std_id,String name){
        this.std_id = std_id;
        this.name = name;
    }

    public void participateExam(String subject,Integer duration,Integer totalMark)
    {
        StudentAuth studentAuth = new StudentAuth(this);
        onlineexmEf = new OnlineExmEf(subject, duration, totalMark);

        Integer mark = onlineexmEf.takeExm();
        System.out.println("The mark for the "+subject+" exam is "+mark);
    }

}

//This class authenticate student
class StudentAuth{
    StudentEf student;

    StudentAuth(StudentEf student){
        this.student = student;
        authentication();
    }

    private void authentication(){
        System.out.println("Authenticating student...\n"+student.name+" "+student.std_id+"\nAuthentication Complete");
    }
}

public class SRP_Efficient {
    public static void main(String[] args){

        StudentEf student = new StudentEf(331006,"Tamzid");
        student.participateExam("SWE",180,100);
    }
    
}
