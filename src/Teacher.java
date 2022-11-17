/**
 * class keeps track of teacher info (name, id, salary)
 */

public class Teacher {

    private int id;
    private String name;
    private double salary;

    /**
     * Creates new teacher salary of the teacher
     *
     */
    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "MYSGY Teacher Management System👩🏾‍🏫👨🏾‍🏫{" +
                "Staff id=" + id +
                ", Staff name='" + name + '\'' +
                ", Staff salary=" + salary +
                "✨";
    }

}
