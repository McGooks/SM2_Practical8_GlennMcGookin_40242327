package Prac8;


public class Student {
    private String fName;
    private String lName;
    private int age;
    private int studentNum;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public Student(String fName, String lName, int age, int studentNum) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.studentNum = studentNum;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", studentNum=" + studentNum +
                '}';
    }
}
