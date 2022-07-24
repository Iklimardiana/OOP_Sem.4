package Pertemuan9.Latihan2;

public class main {
        public static void main(String[] args) {
                Person p1 = new Person("Iklima", "Tasikmalaya", "082176542897", "Iklima@gmail.com");

                Student s1 = new Student("Intan", "Bandung", "089736789276", "Intan@gmail.com", 1);

                Employee e1 = new Employee("Agung", "Cirebon", "087767875432", "Agung@gmail.com", 01, 12000000);

                Staff s2 = new Staff("Salman", "Bogor", "082112456783", "Salman@gmail.com", 02, 7500000, "S.Kom");

                Faculty f1 = new Faculty("Fahmi", "Palembang", "083267839876", "Fahmi@gmail.com", 03, 5000000,
                                "08.00 - 16.00", "Wakil Dekan");

                System.out.println(p1.toString());
                System.out.println(" ");
                System.out.println(s1.toString());
                System.out.println(" ");
                System.out.println(e1.toString());
                System.out.println(" ");
                System.out.println(s2.toString());
                System.out.println(" ");
                System.out.println(f1.toString());
        }
}
