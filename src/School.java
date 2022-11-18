import java.util.HashMap;
import java.util.Scanner;

/**
 * Manages all students/teachers
 * Manages all salaries/fees
 */

public class School {

    private HashMap<Integer,Teacher> teachers;
    private HashMap<Integer,Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    Scanner scan = new Scanner (System.in);

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

    public void welcomePage() {
        String message = "Welcome to Miss Yasmin's School for Gifted Youth 🦸🏽‍ \n You are now using the school management software \n" +
                "Would you like to load a Student or Teacher manager page? (Type 'S' for students, 'T' for teachers Type 'N' to begin a new project)";
        System.out.println(message);
        String welcomereply = scan.nextLine();
        if(welcomereply.equalsIgnoreCase("S")) {
            //take to student load data

        } else if (welcomereply.equalsIgnoreCase("T"))    {
            //take to teacher load data
            } else if (welcomereply.equalsIgnoreCase("N")) {
            // take to crudSelector
        }

        }

        public void newProject () {

        String newPro = "What you like to create? A new student or Teacher? Type '1' for Student or '2' for Teacher";
        System.out.println(newPro);
        String projectReply = scan.nextLine();

        switch (projectReply) {
            case 1:
            crudStudent();
                break;
            case 2:
            //teacher crud menu
                break;
        }
    }

    public void crudStudent() {
        String crudStudentMessage = "You've selected the Student System! Here are your options:" +
                          "\n Input '1' to create a new student" +
                          "\n Input '2' to read all the students" +
                          "\n Input '3' to update a student" +
                          "\n Input '4' to delete a student" +
                          "\n Input '*' to quit menu" ;

       String crudStudentreply = scan.nextLine();

        switch (crudStudentreply) {

            case 1:
            //create student
                break;
            case 2:
            //read student
                break;
            case 3:
            //update student
                break;
            case 4:
            //delete student
                break;
            case 5:
            //quit crud

        }
    }
    public void crudTeacher() {

        String crudTeacherMessage = "You've selected the Teacher System! Here are your options:" +
                "\n Input '1' to create a new teacher" +
                "\n Input '2' to read all the teachers" +
                "\n Input '3' to update a teacher" +
                "\n Input '4' to delete a teacher" +
                "\n Input '*' to quit menu" ;

        System.out.println(crudTeacherMessage);

        String crudTeacherReply = scan.nextLine();

        switch (crudTeacherReply) {

            case 1:

        }
    }
    }
