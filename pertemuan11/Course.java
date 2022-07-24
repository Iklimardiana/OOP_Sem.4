public class Course {
    private String nameCourse;
    private int Code;
    private Student[] classList;
    private Faculty faculty;
    public void addStudent(Student s){
        Student[] temp = new Student[classList.length+1];
        for (int i = 0; i<classList.length; i++){
            temp[i]=classList[i];
        }
        temp [classList.length] = s;
        classList = temp;
    }
    
    public void SetFaculty(Faculty faculty){
        this.faculty = faculty;
    }

    public void SetNameCourse(String nameCourse){
        this.nameCourse = nameCourse;
    }

    public void SetCode(int Code){
        this.Code = Code;
    }

    public String getNameCourse(){
        return nameCourse;
    }

    public int getCode(){
        return Code;
    }

    public Student[] getStudent(){
        return classList;
    }

    public Faculty faculty(){
        return faculty;
    }

}
