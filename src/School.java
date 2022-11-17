import java.util.HashMap;

/**
 * Manages all students/teachers
 * Manages all salaries/fees
 */

public class School {

    private HashMap<Integer,Teacher> teachers;
    private HashMap<Integer,Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers = hashmap of all teachers in school
     * @param students = hashmap of all students in school
     */

    public School(HashMap<Integer, Teacher> teachers, HashMap<Integer, Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned =0;
        totalMoneySpent =0;
    }
     //todo Returns list of all teachers
    public HashMap<Integer, Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(HashMap<Integer, Teacher> teachers) {
        this.teachers = teachers;
    }
//todo returns all the students
    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}