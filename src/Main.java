import ra.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Tiep",true,"jv03",19,"Ha noi");
        Student student2 = new Student(2,"dang",false,"jv03",149,"Ha noi");
        Student student3 = new Student(3,"tran",true,"jv03",139,"Ha noi");
        System.out.println(student.display());
        System.out.println(student2.display());
        System.out.println(student3.display());
    }
}