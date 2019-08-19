public class Student extends Person {
   /* public Student(String n, String m)
    {
        // pass n to superclass constructor
        super(n);
        major = m;
    }*/
   private String major;

    public Student(String n, String major) {
       super(n);
        this.major = major;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
