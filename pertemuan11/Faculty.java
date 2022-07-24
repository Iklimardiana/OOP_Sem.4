public class Faculty {
    private String nameFaculty;
    private int id;
    private Course[] courseList;
    public void addCourse(Course c){
        Course[] temp = new Course [courseList.length+1];
        for (int i = 0; i< courseList.length; i++){
            temp [i] = courseList[i];
        }
        temp[courseList.length] = s;
        courseList = temp;
    }

    public void SetNameFaculty(String nameFaculty){
        this.nameFaculty = nameFaculty;
    }

    public void SetId(int id){
        this.id = id;
    }

    public String getNameFaculty(){
        return nameFaculty;
    }

    public int getId(){
        return id;
    }
}
