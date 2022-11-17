
/**
 * Student class will keep track of student fees,
 * names, grade, paid fees
 */

public class Student {

    //Private to protect student info outside of student class

   private String name;
    private int id;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**todo students fees = $30,000 per year.
     * fees total = $0
     *

     */


    public Student ( int id, String name, int grade) {
        // create a new student object by initializing the value
        this.feesPaid = 0;
        this.feesTotal = 30_000;
        this.id = id;  // id from the student class is equal to the id from id arguement
        this.name = name;
        this.grade = grade;




    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    /**
     * updating the fees paid as school receives funds
     * will keep adding
     */
    public void updateFeesPaid(int fees){
       feesPaid = feesPaid+fees;
        }


    @Override
    public String toString() {
        return "MYSGY Student Management System 👸🏾🫅🏾 {" +
                "Student name='" + name + '\'' +
                ", Student id=" + id +
                ", Student grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                "✨";
    }
}
