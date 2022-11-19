
import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Manages all students/teachers
 * Manages all salaries/fees
 */

public class School implements Serializable {
    Scanner scan = new Scanner(System.in);
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
//    private static int totalMoneyEarned;
//    private static int totalMoneySpent;


    /**
     * new school object is created
     *
     * @param = hashmap of all teachers in school
     * @param = hashmap of all students in school
     */

    public School() {
        this.teachers = new ArrayList<Teacher>(); ///check serialize project
        this.students = new ArrayList<Student>();
//        totalMoneyEarned = 0;
//        totalMoneySpent = 0;
    }

    //todo Returns list of all teachers
    public ArrayList<Teacher> getTeachers() { //from video
        return teachers;
    }

    public void setTeachers() {
        this.teachers = teachers;
    }

    //todo returns all the students
    public ArrayList<Student> sgetStudents() { //from video
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * the total money spent by the school.
     */

//    public int getTotalMoneyEarned() {
//        return totalMoneyEarned;
//    }
//
//    public void setTotalMoneyEarned(int totalMoneyEarned) {
//        this.totalMoneyEarned = totalMoneyEarned;
//    }
//
//
//    public void setTotalMoneySpent(int totalMoneySpent) {
//        this.totalMoneySpent = totalMoneySpent;
//    }
    /**
     *the total money earned by the school.
     */
//    public int getTotalMoneyEarned (int MoneyEarned) {
//        return totalMoneyEarned;
//    }
//    /**
//     * Adds the total money earned by the school.
//     * MoneyEarned money that is supposed to be  added.
//     */
//    public static void updateMoneySpent(int MoneyEarned) {
//        totalMoneyEarned = totalMoneyEarned + MoneyEarned;
//    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     *
     * @param// the money spent by school.
     */
//    public static void updateTotalMoneySpent(int moneySpent) {
//        totalMoneyEarned-=moneySpent;
//    }
    public void welcomePage() {
        String message = "Welcome to Miss Yasmin's School for Gifted Youth 🦸🏽‍ \n You are now using the school management software \n" +
                "Would you like to load a Student or Teacher manager page? (Type 'S' for students, 'T' for teachers Type 'N' to begin a new project)";
        System.out.println(message);
        String welcomereply = scan.nextLine();
        if (welcomereply.equalsIgnoreCase("S")) {
            //take to student load data

        } else if (welcomereply.equalsIgnoreCase("T")) {
            //take to teacher load data
        } else if (welcomereply.equalsIgnoreCase("N")) {
            // take to crudSelector
        }

    }

    public void newProject() {

        String newPro = "Want to make changes? What system what you like Student or Teacher? Type '1' for Student or '2' for Teacher";
        System.out.println(newPro);
        String projectReply = scan.nextLine();

//        switch (projectReply) {
//            case 1:
//                crudStudent();
//                break;
//            case 2:
//                //teacher crud menu
//                break;
    }


    public void crudStudent() {
        String crudStudentMessage = "You've selected the Student System! Here are your options:" +
                "\n Input 'C' to create a new student" +
                "\n Input 'R' to read all the students" +
                "\n Input 'U' to update a student" +
                "\n Input 'D' to delete a student" +
                "\n Input 'Q' to quit menu";

        String crudStudentreply = scan.nextLine();
        if (crudStudentreply.equalsIgnoreCase("C")) {
            createStudent();
        } else if (crudStudentreply.equalsIgnoreCase("R")) {
            readStudent();
        } else if (crudStudentreply.equalsIgnoreCase("U")) {
            updateStudent();
        } else if (crudStudentreply.equalsIgnoreCase("D")) {
            deleteStudent();
        }
    }


    public void createStudent() {
        System.out.println("Create a new student ➕ ");
        System.out.println("Input the new Student's id:");
        int id = Integer.parseInt(scan.nextLine());
        System.out.println("Input trhe student's full name:");
        String name = scan.nextLine();
        System.out.println("Input the student's grade:");
        char grade = scan.next().charAt(0);
        System.out.println("What college do you hope to attend?");
        String college = scan.nextLine();
        System.out.println("What will be your major?");
        String major = scan.nextLine();

//        System.out.println("Input the fees paid thus far:");
//        int feesPaid = Integer.parseInt(scan.nextLine());
//        System.out.println("Input the total fees");
//        int feesTotal = Integer.parseInt(scan.nextLine());

        students.add(new Student(id, name, grade, college, major));
        //save(students);
    }

    public void readStudent() {
        toString();
    }

    public Student findStudentbyId(int id) {
        for (Student s : students) {

            if (s.getId() == id) {
                return s;
            } else {
                continue;
            }
        }
        return null;
    }

    public void updateStudent() {
        readStudent();
        System.out.println("Input the id of the student you'd like to update:");
        int update = Integer.parseInt(scan.nextLine());
        Student student = this.findStudentbyId(update);
        for (Student updateStudent : students)
            if (updateStudent.getId() == update) {

                System.out.println("Input the student's id:");
                int id = Integer.parseInt(scan.nextLine());
                student.setId(id);
                System.out.println("Input he student's name:");
                String name = scan.nextLine();
                student.setName(name);
                System.out.println("Input the student's grade:");
                char grade = scan.next().charAt(0);
                student.setGrade(grade);
                System.out.println("What college do you hope to attend?");
                String college = scan.nextLine();
                student.setCollege(college);
                System.out.println("What will be your major?");
                String major = scan.nextLine();
                student.setMajor(major);
                readStudent();
                break;
            }
    }

    public void deleteStudent() {
        System.out.println("Let's Delete!");
        readStudent();
        System.out.println("Input the id of the student you'd like to delete:");
        int deleteId = Integer.parseInt(scan.nextLine());
        for (Student deleteS : students) {
            if (deleteS.getId() == deleteId) {
                students.remove(deleteS);
                System.out.println("--**STUDENT ❌ REMOVED**--");
                readStudent();
            }
        }

    }

    public void crudTeacher() {

        String crudTeacherMessage = "You've selected the Teacher System! Here are your options:" +
                "\n Input 'C' to create a new teacher" +
                "\n Input 'R' to read all the teachers" +
                "\n Input 'U' to update a teacher" +
                "\n Input 'D' to delete a teacher" +
                "\n Input '' to quit menu";

        System.out.println(crudTeacherMessage);
        System.out.println("Create a new Teacher ➕");
        String crudTeacherReply = scan.nextLine();
        if (crudTeacherReply.equalsIgnoreCase("C")) {
            System.out.println("Input the new teacher's id:");
            int id = Integer.parseInt(scan.nextLine());
            System.out.println("Input the new teacher's full name:");
            String name = scan.nextLine();
            System.out.println("List the institution where the Teacher is a graduate of:");
            String graduate = scan.nextLine();
            System.out.println("Input the subject taught by Teacher:");
            String subject = scan.nextLine();
            students.add(new Student(id, name, graduate, subject));// why char??
        }
    }

    public void readTeacher() {
        for (Teacher teach : teachers) {
            teach.print();
        }
    }

    public void updateTeacher() {
        System.out.println("Let's update!");
        readTeacher();

        System.out.println("Input the id of the Teacher you'd like to update:");
        int updateId = Integer.parseInt(scan.nextLine());
        for (Teacher update : teachers) {
            if (update.getId() == updateId) {
                System.out.println("Input the new teacher's id:");
                int id = Integer.parseInt(scan.nextLine());
                System.out.println("Input the new teacher's full name:");
                String name = scan.nextLine();
                System.out.println("List the institution where the Teacher is a graduate of:");
                String graduate = scan.nextLine();
                System.out.println("Input the subject taught by Teacher:");
                String subject = scan.nextLine();
                students.add(new Student(id, name, graduate, subject));

            }

        }
    }

    public void deleteTeacher() {
        System.out.println("Let's Delete!");
        readTeacher();
        System.out.println("Input the id of the teacher you'd like to delete:");
        int deleteId = Integer.parseInt(scan.nextLine());

        for (Teacher deleteTeach : teachers) {
            if (deleteTeach.getId() == deleteId) {
                teachers.remove(deleteTeach);
                System.out.println("--**TEACHERS ❌ REMOVED**--");
            }
        }


    }

    public void saveStudent(ArrayList<Student> students) {
        try {
            FileOutputStream fileOut = new FileOutputStream("students.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Student s : students) {
                out.writeObject(students);
            }

            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadStudent() {

        try {
            FileInputStream file = new FileInputStream("students.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            students = (ArrayList<Student>) in.readObject();
            in.close();
            file.close();

            System.out.println(students.toString());

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            System.out.println("You sure? Please create a new student");
        }
    }

    public void saveTeacher(ArrayList<Teacher> teachers) { //
        try {
            FileOutputStream fileOut = new FileOutputStream("teachers.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Teacher t : teachers) {
                out.writeObject(teachers);
            }

            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }


    public void loadTeacher() {
        try {
            FileInputStream file = new FileInputStream("teachers.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            teachers = (ArrayList<Teacher>) in.readObject();
            in.close();
            file.close();

            System.out.println(teachers.toString());

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            System.out.println("You sure? Please create a new teacher");
        }
    }


    public void exitProgramStudents() {
        System.out.println("Ready to go? Would you like to save your submissions? Type(Y) for yes or (N) for no");
        String reply = scan.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            saveStudent(students);
            System.out.println("--***✅STUDENT SUBMISSIONS SAVED✅**-- ");
            System.exit(-1);
        } else if (reply.equalsIgnoreCase("N")) {
            System.out.println("GOODBYE!");
        }
    }

    public void exitProgramTeachers() {
        System.out.println("Ready to go? Would you like to save your submissions? Type(Y) for yes or (N) for no");
        String reply = scan.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            saveStudent(students);
            System.out.println("--***✅STUDENT SUBMISSIONS SAVED✅**-- ");
            System.exit(-1);

        } else if (reply.equalsIgnoreCase("N")) {
            System.out.println("GOODBYE!");

        }
    }
}