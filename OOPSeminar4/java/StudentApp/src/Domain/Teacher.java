package Domain;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, int age) {
        super(firstName, age);
    }
    
    @Override
    public String toString() {
        return "Teacher [acadDegree=" + acadDegree + "]";
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
}
