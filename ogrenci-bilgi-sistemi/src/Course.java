public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else {
            System.out.println("ogretmen ve ders bolumleri uyusmuyor");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }

}
