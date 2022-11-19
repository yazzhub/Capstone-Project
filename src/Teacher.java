/**
 * class keeps track of teacher info (name, id, salary)
 * Teachers of MYSGY
 */

public class Teacher {

    private int id;
    private String name;
    //    private double salary;
    private String graduate;
    private String subject;


    /**
     * Creates new teacher salary of the teacher
     */
    public Teacher(int id, String name, String graduate, String subject) {
        this.id = id;
        this.name = name;
        this.graduate = graduate;
        this.subject = subject;
//        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlumni() {
        return graduate;
    }

    public void setAlumni(String alumni) {
        this.graduate = alumni;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //    public double getSalary() {
//        return salary;
//    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }


    public void print() {
        System.out.println("MYSGY Graduating Class👸🏾🫅🏾\n {" +
                " Teacher id : " + this.id + '\n' +
                ",Teacher name: " + this.name + '\n' +
                ",Teacher graduate of ;" + this.graduate + '\n' +
                ",Subject: " + this.subject + '\n' +
                "✨");
    }
}