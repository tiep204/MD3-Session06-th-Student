package ra;

public class Student {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }
    public String display(){
        return "Id: "+studentId +"\t"
                +"Name: "+studentName +"\t"
                +"Gioi tinh: "+sex +"\t"
                +"lop: "+className +"\t"
                +"tuoi: "+ age +"\t"
                + "dia chi: "+address;
    }
}