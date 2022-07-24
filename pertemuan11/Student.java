public class Student {
    private String nama;
    private String NIM;
    private Course[] courseList;
    public void addCourse(Course s){
        Course[] temp = new Course [courseList.length+1];
        for (int i = 0; i< courseList.length; i++){
            temp [i] = courseList[i];
        }
        temp[courseList.length] = s;
        courseList = temp;
    }
    public Course[] getCourse(){
        return courseList;
    }

    public void setCourse(Course[] courseList){
        this.courseList = courseList;
    }
    public void SetNama(String nama){
        this.nama = nama;
    }
    public void SetNIM(String NIM){
        this.NIM = NIM;
    }

    public String GetNama(){
        return nama;
    }
    public String GetNIM(){
        return NIM;
    }
    
}


