//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....


class Student{
    private String rollNo;
    private String name;
    public String getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

}


class StudentView{

    void printSTDetail(String st_name , String st_roll){
        System.out.println(st_name + " ----- " + st_roll);
    }
}


class StudentController{
    private Student model;
    private StudentView view;
    public StudentController(Student model , StudentView view){
        this.model=model;
        this.view=view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public void updatedView(){
        view.printSTDetail(model.getName() , model.getRollNo());
    }
}

public class MVC {
    public static void main(String[] args){
        Student model = retriveSTfromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updatedView();
   
    }

    private static Student retriveSTfromDB(){
        Student st = new Student();
        st.setName("Robert");
        st.setRollNo("10");
        return st;
    }
    
}
