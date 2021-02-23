package not_DI;

public class Teacher {
    private Student student;

    public Teacher() {
        student = new Student("CodeGym", 10f);
    }

    public Teacher(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getStudentMark() {
        return student.getMark();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + student +
                '}';
    }
}
