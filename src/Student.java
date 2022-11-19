
/**
 * Student class will keep track of student fees,
 * names, grade, paid fees
 * Digital Yearbook
 */

public class Student {

    //Private to protect student info outside of student class

   private String name;
    private int id;
    private char grade; //YEAR
    private String college; // GIFT
    private String major; //
//    private int feesPaid;
//    private int feesTotal;

    /**todo students fees = $30,000 per year.
     * fees total = $0
     *

     */


    public Student (int id, String name, char
            grade, String college, String major) {
        // create a new student object by initializing the value
//        this.feesPaid = 0;
//        this.feesTotal = 30_000;
      setId(id);  // id from the student class is equal to the id from id arguement
     setName(name);
     setGrade(grade);
     setCollege(college);
     setMajor(major);


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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = Character.valueOf(grade);
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     *  fees the fees that the student pays.
     */
//    public void payFees(int fees) {
//        feesPaid = feesPaid +fees;
//        School.
//    }
//
//    public int getFeesPaid() {
//        return feesPaid;
//    }
//
//    public void setFeesPaid(int feesPaid) {
//        this.feesPaid = feesPaid;
//    }
//
//    public int getFeesTotal() {
//        return feesTotal;
//    }
//
//    public void setFeesTotal(int feesTotal) {
//        this.feesTotal = feesTotal;
//    }
//
//    /**
//     * updating the fees paid as school receives funds
//     * will keep adding
//     */
//    public void updateFeesPaid(int fees){
//       feesPaid = feesPaid+fees;
//        }




    @Override
    public String toString() {
        return "MYSGY Graduating Class👸🏾🫅🏾 {" +
                "Student name='" + name + '\'' +
                ", Student id=" + id +
                ", Student grade=" + grade +
                ", Student college=" + college +
                ", Student major" + major +
                "✨";
    }
}
