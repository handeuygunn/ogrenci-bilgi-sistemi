public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","05535520235","TRH");
        Teacher t2 = new Teacher("Grahambell","020","FZK");
        Teacher t3 = new Teacher("kulyutmaz","555","BIO");


        Course tarih = new Course("Tarih ","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik ","101","FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("biyoloji ","101","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("inek saban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,60,50,80,90,60);
        s1.isPass();

        Student s2 = new Student("guduk necmi","444","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,30,90,80,60,90);
        s2.isPass();


    }
}
