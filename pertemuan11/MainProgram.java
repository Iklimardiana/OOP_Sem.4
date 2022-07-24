public class MainProgram {
    Student s1 = new Student("Asep", "2000532", new Course[0]);
        Student s2 = new Student("Budi", "2000533", new Course[0]);
        Student s3 = new Student("Caca", "2000534", new Course[0]);
        Faculty f1 = new Faculty("Prof Asep", 1, new Course[0]);
        Faculty f2 = new Faculty("Prof Budi", 2, new Course[0]);
        Course c1 = new Course("Algoritma", 1, new Student[0], f1);
        Course c2 = new Course("Pemrograman", 2, new Student[0], f1);
        Course c3 = new Course("Ilkom", 200, new Student[0], f1);
        Course c4 = new Course("Fisika", 201, new Student[0], f1);
        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c2);
        s2.addCourse(c3);
        s3.addCourse(c3);
        s3.addCourse(c4);
        System.out.println(s1.GetCourse(0).GetNameCourse());
        System.out.println(s1.GetCourse(1).GetNameCourse());
        System.out.println(s2.GetCourse(0).GetNameCourse());
        System.out.println(s2.GetCourse(1).GetNameCourse());
        System.out.println(s3.GetCourse(0).GetNameCourse());
        System.out.println(s3.GetCourse(1).GetNameCourse());
}
