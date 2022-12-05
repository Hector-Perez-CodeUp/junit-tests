import java.util.ArrayList;

public class Student {

    public long id;
    public String name;
    public ArrayList<Integer> grades;

    // Constructor
    public Student(long myId, String myName, String number) {
        this.id = myId;
        this.name = myName;
    }


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double gradesAvg = 0;
        for (Integer grade : grades) {
            gradesAvg += grade;
        }
        return gradesAvg / grades.size();
    }
}
